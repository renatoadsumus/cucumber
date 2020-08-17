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
				
				sh(""" source /etc/profile.d/maven.sh """)			
				sh(""" mvn test -Dtest=DescontoTest """)
			}		
		}	
		
		stage('Functional Test'){
		
			steps{			

                echo "#####################################"	
				echo "###  FUNCTIONAL TEST  ###"
				echo "#####################################"
				
				sh(""" mvn test -Dtest=RunCucumberTest -Dtags=\"@validação and @regressão\"  """)
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
