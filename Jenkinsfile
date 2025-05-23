pipeline {
    agent any

    tools {
        maven 'Maven 3.9.4'  // Replace this with your Jenkins Maven tool name
    }

    stages {
        stage('Checkout') {
            steps {
                git branch: 'main', url: 'https://github.com/Veeresh47/bluewater.git'
            }
        }

        stage('Build') {
            steps {
                dir('SimpleCalculator') {
                    bat 'mvn clean package'
                }
            }
        }

        stage('Test') {
            steps {
                dir('SimpleCalculator') {
                    bat 'mvn test'
                }
            }
        }

        stage('Deploy') {
            steps {
                echo 'Deployment steps go here...'
            }
        }
    }
}
