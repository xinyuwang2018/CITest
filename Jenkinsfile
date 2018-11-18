pipeline {
    agent {
        label "jenkins-maven"
    }
    
    stages {
       stage('check out') {
          steps {
             echo 'checkout source code'
          }
       }
       
       stage ('build') {
          steps {
             echo 'build'
          }
       }
       
       stage('deploy') {
          steps {
             echo 'deploy'
          }
       }
    }
}
