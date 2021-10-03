pipeline {
  agent any
    tools { 
      maven 'test_maven' 
    }

  stages {
    stage('Pull from git') {
      steps {
        git credentialsId: 'test_jenkins', url: 'git@github.com:YuryShcharbina/test_jenkins.git'
        }
    }

    stage('Sonaqube check'){
      environment{
        scannerHome = tool 'test_sonarscanner'
      }
      steps{
        withSonarQubeEnv('test_sonarqube'){
          sh '${scannerHome}/bin/sonar-scanner -X \
              -Dsonar.projectKey=test_java_project \
              -Dsonar.sources=.'
              }
      }
    }

    stage('Build application'){
      steps{
        sh 'mvn clean package';
      }
    }

    stage ('Upload to repository') {
      steps {
        rtUpload (
          serverId: 'test_artifactory',
          spec: """{
            "files": [
              {
                "pattern": "target/*.war",
                "target": "test_repo"
              }
            ]
          }"""
        )
      }
    }

    stage ('Deploy to server') {
      steps {
        rtDownload (
          serverId: 'test_artifactory',
          spec: """{
            "files": [
              {
                "pattern": "test_repo/hello-world-war*.war",
                "target": "/var/jenkins_home/webapps/hello.war"
              }
            ]
          }"""
        )
      }
    }
  }
}
