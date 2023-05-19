pipeline {
    agent any

    stages {
        stage('Checkout') {
            steps {
                // Récupération du code source depuis Git
                git 'https://github.com/yohamza44/tpJee.git'
            }
        }

        stage('Affichage de la date système') {
            steps {
                script {
                    // Affichage de la date système
                    def currentDate = sh(returnStdout: true, script: 'date')
                    println "La date système est : ${currentDate}"
                }
            }
        }
    }
}
