pipeline {
    agent any
    
    stages {
       stage('check out') {
          steps {
             echo 'checkout source code'
             sh 'mvn clean install'
          }
       }
       
       stage ('build') {
          steps {
             echo 'build'
             sh 'mvn clean install'
          }
       }
       
       stage('deploy') {
          steps {
             echo 'deploy'
          }
       }
    }
}
