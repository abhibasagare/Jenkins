pipeline {
    agent any
    stages {
        stage('Pull') {
            steps {
                git branch: 'main', credentialsId: 'second', url: 'https://github.com/abhibasagare/Jenkins'
                echo "pulling done from remote repository"
            }
        }

        stage('Build') {
            steps {
                sh '/opt/apache-maven-3.9.6/bin/mvn clean package'
                echo 'Here we doing build operation'
            }
        }
        stage('Test') {
            steps {
                sh '''mvn sonar:sonar   -Dsonar.projectKey=studentapp_ui   -Dsonar.host.url=http://3.111.149.241:9000   -Dsonar.login=d28be382dbb7818776a331660feddb3a40a84e29'''
                echo 'This is test operation'
            }
        }

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
