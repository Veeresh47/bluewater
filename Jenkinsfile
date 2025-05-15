pipeline {
    agent any

    tools {
        maven 'Maven'
        jdk 'JDK17'
    }

    stages {
        stage('Checkout') {
            steps {
                git url: 'https://github.com/Veeresh47/bluewater.git', branch: 'main'
            }
        }
        stage('Build') {
            steps {
                bat 'mvn clean package'
            }
        }
        stage('Test') {
            steps {
                bat 'mvn test'
            }
        }
        stage('Run') {
            steps {
                bat 'java -cp target/hello-0.0.1-SNAPSHOT.jar com.maventogradle.App'
            }
        }
    }
}
