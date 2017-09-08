pipeline {
  agent any  
  stages {
    stage('build') {
      steps {
        sh './gradlew clean compile'
      }
    }
    stage('Lint') {
      steps {
        sh "./gradlew lint"
      }
      post {
        always {
          androidLint pattern: '**/lint-results-*.xml'
        }
      }
    }
    stage('tests') {
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

          post {
                always {
                    junit '**/build/test-results/*/*.xml'
                }
            }
    }
    stage('deploy') {
      steps {
        sh 'echo \'not yet implemented\''
      }
    }
  }
}
