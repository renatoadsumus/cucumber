import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

import org.junit.BeforeClass;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
   
    format = {"pretty", "html:target/html-cucumber-reports","json:target/json-cucumber-reports/cucumber.json"}
    
    )


public class RunCucumberTest {
	
	@BeforeClass
	public static void antesDoTeste()
	{
		Navegador.abrir();
		
	}

}
