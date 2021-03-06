pipeline {
  agent any
  stages {
    stage('AddTwo') {
      environment {
        CI = 'true'
      }
      steps {
        sh './jenkins/scripts/tests.sh'
      }
    }
  }
}