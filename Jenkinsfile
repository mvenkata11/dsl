pipeline {
	agent any
	stages {
		stage ('build') {
			bat 'echo "build"'  
		}
		stage ('test: integration-&-quality') {
			bat 'echo "test: integration-&-quality"' 
		}
		stage ('test: functional') {
			bat 'echo "test: functional"' 
		}
		stage ('test: load-&-security') {
			bat 'echo "test: load-&-security"' 
		}
		stage ('approval') {
			bat 'echo "approval"' 
		}
		stage ('deploy:prod') {
			bat 'echo "deploy:prod"' 
		}
	}
}

