pipeline {
    agent any
    tools {
        maven 'Apache Maven 3.0.5'
        jdk 'OpenJDK11'
    }
    stages {
        stage('Build') {
            steps {
                echo 'Building...'
                sh 'mvn clean package -ntp'
            }
        }
        stage('Test') {
            steps {
                echo 'Test...'
            }
        }
        stage('Deploy') {
            steps {
                echo 'Deploy...'
            }
        }
    }
}