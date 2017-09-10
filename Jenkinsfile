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
    stage('assemble') {
      steps {
        sh './gradlew :app:assembleRelease'
      }
    }
    stage('publish') {
      steps {
        sh 'echo "TODO upload to artifactory / fabric"'
      }
    }
    stage('notify') {
      steps {
        sh 'echo "TODO notify chat / email"'
      }
    }
  }
}