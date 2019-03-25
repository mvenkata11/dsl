pipeline{

agent any {

stages{
    stage('gitcheckout'){
        
        checkout([$class: 'GitSCM', branches: [[name: '*/master']], doGenerateSubmoduleConfigurations: false, extensions: [], submoduleCfg: [], userRemoteConfigs: [[url: 'https://github.com/asquarezone/spring-petclinic.git']]])
        
    }
    
    stage('static code analysis'){
        
    bat 'echo "stage2"'
   
    }

   stage( 'build'){
       
     bat 'echo "stage3"'  
   }
   
   stage('Publish'){
            
            bat 'echo "stage4"'       
                
            }


}

}

}
