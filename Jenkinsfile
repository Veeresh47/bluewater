pipeline {
    agent any

    tools {
        maven 'Maven'       // Must match name in Jenkins Global Tool Config
        jdk 'JDK17'         // Must match name in Jenkins Global Tool Config
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
                bat 'java -cp target/hello-world-1.0-SNAPSHOT.jar com.example.App'
            }
        }
    }
}
