pipeline {
    agent any

    stages {
        stage('Compilation') {
            steps {
                script {
                    sh 'sbt clean compile'
                }
            }
        }

        stage('Tests') {
            steps {
                script {
                    sh 'sbt test'
                }
            }
        }
    }

    post {
        success {
            echo 'Compilation et tests effectués.'
        }
        failure {
            echo 'Erreur lors de la compilation ou des tests.'
        }
    }
}