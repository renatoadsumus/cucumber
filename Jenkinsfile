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
		
		stage('Functional Test'){
		
			steps{			

                echo "#####################################"
				echo "###  FUNCTIONAL TEST  ###"
				echo "#####################################"
				
				sh(""" docker run --rm \
						-v /var/lib/jenkins/workspace/Teste_Aceitacao:/codigo_aplicacao/ \
						-w /codigo_aplicacao/ maven:3.6.3-jdk-8 mvn test -Dtest=RunCucumberTest \
						-Dtags=\"@validação and @regressão\" """)
			}		
		}	
		
						
	}

	post {
        always {
          //cleanws()
		  echo "Eliminando..."
        }
    }
}
