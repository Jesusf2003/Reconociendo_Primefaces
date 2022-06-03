node{
    stage (' Cloning the project from Git') {
        git branch: 'main',
        credentialsId: '90f0aece-c730-4741-89f6-976aca79c973',
        url: 'https://github.com/Jesusf2003/Reconociendo_Primefaces.git',
        gitToolName: 'Default'
    }
    stage('SonarQube analysis'){
        def scannerHome = tool 'sonarqubetest';
        withSonarQubeEnv('sonarqubetest'){
	    sh "${scannerHome}/bin/sonar-scanner -D sonar.projectKey=sonarqubetest -D sonar.login=6345b35d62cea7ce8eaa8b66f139f0e5273244ea"
        }
    }
}