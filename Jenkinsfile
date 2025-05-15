pipeline {
    agent any

    tools {
        maven 'Maven'       // Your Maven tool name configured in Jenkins
        jdk 'JDK17'         // Your JDK tool name configured in Jenkins
    }

    stages {
        stage('Checkout') {
            steps {
                git url: 'https://github.com/Veeresh47/your-repo.git', branch: 'main'
            }
        }
        stage('Build') {
            steps {
                sh 'mvn clean package'
            }
        }
        stage('Test') {
            steps {
                sh 'mvn test'
            }
        }
        stage('Run') {
            steps {
                sh 'java -cp target/hello-world-1.0-SNAPSHOT.jar com.example.App'
            }
        }
    }
}
