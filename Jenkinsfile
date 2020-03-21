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
                sh 'mvn clean package'
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
                sh 'ansible -i inventory/hosts.yml --playbook-dir playbooks/main.yml'
            }
        }
    }
}