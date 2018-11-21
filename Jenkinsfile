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
	         }
          }
       }
       
       stage('deploy') {
          steps {
            container('helm') {
                echo 'deploy'
                sh 'helm ls'
            }
          }
       }
    }
}
