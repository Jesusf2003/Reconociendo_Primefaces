node{
    stage (' Cloning the project from Git') {
        git branch: 'main',
        credentialsId: '90f0aece-c730-4741-89f6-976aca79c973',
        url: 'https://github.com/Jesusf2003/Reconociendo_Primefaces.git',
        gitToolName: 'Default'
    }
    stage('SonarQube analysis'){
	def mvn = tool 'Default Maven';
        def scannerHome = tool name: 'sonarqubetest', type: 'hudson.plugins.sonar.SonarRunnerInstallation';
        withSonarQubeEnv('sonarqubetest'){
            sh 'mvn org.sonarsource.scanner.maven:sonar-maven-plugin:3.6.0.1398:sonar'
            sh "${mvn}/bin/mvn clean verify sonar:sonar -D sonar.projectKey=sonarqubetest -d sonar.login=6345b35d62cea7ce8eaa8b66f139f0e5273244ea"
        }
    }
}