pipeline {
	agent any
	stages {
		stage ('build') {
			bat '"build"'  
		}
		stage ('test: integration-&-quality') {
			bat '"test: integration-&-quality"' 
		}
		stage ('test: functional') {
			bat '"test: functional"' 
		}
		stage ('test: load-&-security') {
			bat '"test: load-&-security"' 
		}
		stage ('approval') {
			bat ' "approval"' 
		}
		stage ('deploy:prod') {
			bat '"deploy:prod"' 
		}
	}
}

