pipeline {
    agent any

    stages {
        stage('Build') {
            steps {
                script {
                    dir('simple-scala-project') {
                        sh 'sbt clean compile'
                    }
                }
            }
        }

        stage('Test') {
            steps {
                script {
                    dir('simple-scala-project') {
                        sh 'sbt test'
                    }
                }
            }
        }
    }

    post {
        success {
            echo 'Build and Test stages passed.'
        }
        failure {
            echo 'Build or Test stages failed.'
        }
    }
}