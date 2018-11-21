pipeline {
    agent any
    
    stages {
       stage('check out') {
          steps {
              echo 'checkout source code'
		  }
       }
       
       stage ('build') {
          steps {
             container('maven-slave') {
	             echo 'build'
	             sh 'mvn clean install'
	             sh 'skaffold build -f skaffold.yaml'
	         }
          }
       }
       
       stage('deploy') {
          steps {
            container('maven-slave') {
                echo 'deploy'
                sh 'helm ls'
            }
          }
       }
    }
}
