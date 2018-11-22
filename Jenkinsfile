pipeline {
    agent any
    
    stages {
       stage('check out') {
          steps {
              echo 'checkout source code'
		  }
       }
       
       stage ('build jar') {
          steps {
             container('maven-slave') {
	             echo 'build'
	             sh 'mvn clean package'
	         }
          }
       }
       
        stage ('build image') {
          steps {
             container('kube') {
	             echo 'build image'
	             sh 'skaffold build -f skaffold.yaml'
	         }
          }
       }
	    
       stage('deploy') {
          steps {
            container('kube') {
                echo 'deploy'
                sh 'helm ls'
            }
          }
       }
    }
}
