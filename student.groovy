pipeline {
    agent any

    stages {
        stage('Pull') {
            steps {
                echo 'This is pull operation'
            }
        }

        // stage('Build') {
        //     steps {
        //         echo 'This is build operation'
        //     }
        // }

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