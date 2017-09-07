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
      sh 'echo \'not yet implemented\''
    }
  }
}