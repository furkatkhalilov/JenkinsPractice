pipeline {
    agent any

    stages {
        stage('Build') {
            steps {
                catchError(buildResult: 'SUCCESS', stageResult: 'FAILURE')
                {
                    sh './mvnw clean verify'
                }
            }

            post {

                success {
                    junit '**/target/surefire-reports/TEST-*.xml'
                    archiveArtifacts 'target/*.jar'
                }
            }
        }

        stage('Collecting results'){
            steps{
                publishHTML(target:[
                            reportDir: 'target/site/jacoco',
                            reportFiles: 'index.html',
                            reportName: 'Coverage Report'])
                }
        }

    }

}