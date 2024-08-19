pipeline{
    agent any
    stages{
        stage("code will come from github"){
            steps{
                git url:"https://github.com/Ac90210/FinalPhase.git"
            }
        }
        stage("compiling the code"){
            steps{
                sh 'mvn compile'
            }
        }
        stage("tetsing the code"){
            steps{
                sh 'mvn test'
            }
        }
        stage("quality check of the code"){
            steps{
                sh 'mvn validate'
            }
        }
        stage("package the code"){
            steps{
                sh 'mvn package'
            }
        }
    }
}