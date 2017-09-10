pipeline {
  agent any
  stages {
    stage('build') {
      steps {
        sh './gradlew clean compile'
      }
    }
    stage('unittest') {
      steps {
        parallel(
          "unittest": {
            sh './gradlew test'
            
          },
          "instrumentationTest": {
            sh 'echo \'not yet implemented\''
            
          }
        )
      }
    }
    stage('deploy') {
      steps {
        parallel(
          "deploy": {
            sh 'echo \'not yet implemented\''
            
          },
          "package": {
            sh './gradlew :app:assembleRelease'
            
          }
        )
      }
    }
  }
}