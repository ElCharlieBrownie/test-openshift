pipeline {
    agent any

    tools {
        // Install the Maven version configured as "M3" and add it to the path.
        maven "maven3"
    }

    stages {
        stage('Build') {
            steps {
                // Get some code from a GitHub repository
                git 'https://github.com/ElCharlieBrownie/test-openshift.git'

                // Run Maven on a Unix agent.
                sh "mvn clean package -DskipeTest=true "

                // To run Maven on a Windows agent, use
                // bat "mvn -Dmaven.test.failure.ignore=true clean package"
            }

        }
         stage('Test') {
            steps {
                // Run Maven on a Unix agent.
                sh "mvn test "

                // To run Maven on a Windows agent, use
                // bat "mvn -Dmaven.test.failure.ignore=true clean package"
            }
        }
    }
}