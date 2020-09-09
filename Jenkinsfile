pipeline {
    
	agent {
	    node{
	        label 'master'
	    }	    
	} 	
	
	
	stages {  	 
		
		stage('Unit Test'){
		
			steps{
			
			
				echo "#####################################"	
				echo "###  UNIT TEST  ###"
				echo "#####################################"
						
				sh(""" docker run --rm \
						-v /var/lib/jenkins/workspace/Teste_Aceitacao:/codigo_aplicacao/ \
						-w /codigo_aplicacao/ maven:3.6.3-jdk-8 mvn test -Dtest=DescontoTest """)
			}		
		}	
		
		stage('Publish Test Results') {
			steps{				
				echo "#############################"
                echo "###  PUBLISH TEST RESULTS ###"
                echo "#############################"	

                junit 'target/surefire-reports/TEST-*.xml'
			}
		}


		/*stage('Functional Test'){
		
			steps{			

                echo "#####################################"
				echo "###  FUNCTIONAL TEST  ###"
				echo "#####################################"
				
				sh(""" docker run --rm \
						-v /var/lib/jenkins/workspace/Teste_Aceitacao:/codigo_aplicacao/ \
						-w /codigo_aplicacao/ maven:3.6.3-jdk-8 mvn test -Dtest=RunCucumberTest \
						-Dtags=\"@validação and @regressão\" """)
			}		
		}*/	
		
						
	}

/*post {
        always {
          //cleanws()
		  echo "Eliminando..."
		  cucumber failedFeaturesNumber: -1, failedScenariosNumber: -1, failedStepsNumber: -1, fileIncludePattern: 'target/json-cucumber-reports/*.json', pendingStepsNumber: -1, skippedStepsNumber: -1, sortingMethod: 'ALPHABETICAL', undefinedStepsNumber: -1
        }
    }*/
}

