node{
    stage (' Cloning the project from Git') {
        git branch: 'main',
        credentialsId: '90f0aece-c730-4741-89f6-976aca79c973',
        url: 'https://github.com/Jesusf2003/Reconociendo_Primefaces.git'
    }
    stage('SonarQube analysis'){
        def scannerHome = tool 'sonarqubetest';
        withSonarQubeEnv('sonarqubetest'){
	    sh "${scannerHome}/bin/sonar-scanner -D sonar.projectKey=sonarqubetest"
        }
    }
}