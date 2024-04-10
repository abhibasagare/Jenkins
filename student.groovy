pipeline {
    agent any
    environment 
    { 
        NAME = "/opt/apache-maven-3.9.6/bin/"
            }
    stages {
        stage('Pull') {
            steps {
                git branch: 'main', credentialsId: 'second', url: 'https://github.com/abhibasagare/Jenkins'
                echo "pulling done from remote repository"
            }
        }

        stage('Build') {
            steps {
                sh 'mvn clean package'
                echo 'Here we doing build operation'
            }
        }
        // stage('Test') {
        //     steps {
        //         echo 'This is test operation'
        //     }
        // }

        // stage('Quality check') {
        //     steps {
        //         echo 'This is quality check operation'
        //     }
        // }

        // stage('Deploy') {
        //     steps {
        //         echo 'This is deploy operation'
        //     }
        // }
    }
}
