pipeline{

agent {

node{
    stage('gitcheckout'){
        
        checkout([$class: 'GitSCM', branches: [[name: '*/master']], doGenerateSubmoduleConfigurations: false, extensions: [], submoduleCfg: [], userRemoteConfigs: [[url: 'https://github.com/asquarezone/spring-petclinic.git']]])
        
    }
    
    stage('static code analysis'){
        
    
    withSonarQubeEnv {
       
        bat """${sonar_scanner}/bin/sonar-scanner.bat -D sonar.projectKey=myProject1 -D sonar.sources=. -D sonar.java.binaries=."""
      

        }
    }

   stage( 'build'){
       
     bat 'mvn clean package'  
   }
   
   stage('Publish'){
            
                archiveArtifacts 'target/springboot-petclinic-1.4.1.jar'
                junit 'target/surefire-reports/*.xml'
                
            }


}

}

}
