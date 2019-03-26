pipeline {
	agent any
	stages {
		stage ('build') {
			"build"  
		}
		stage ('test: integration-&-quality') {
			"test: integration-&-quality" 
		}
		stage ('test: functional') {
			"test: functional" 
		}
		stage ('test: load-&-security') {
			"test: load-&-security" 
		}
		stage ('approval') {
			"approval" 
		}
		stage ('deploy:prod') {
			"deploy:prod" 
		}
	}
}

