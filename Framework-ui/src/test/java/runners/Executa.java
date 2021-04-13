package runners;

import org.junit.runner.RunWith;

import io.cucumber.core.backend.CucumberBackendException;

@RunWith(CucumberBackendException.class)
@CucumberOptions(
		//caminho das features
		feature = "./teste/resources/feature",
		// caminho dos steps de teste
		glue = "tests",
		
		tags = "@teste",
		
		plugin = {"pretty", "html:target/report.html"},
		//nao executa o teste, valida se foi incluso algum novo bdd 
		dryRun =  false
		)



public class Executa {

	
	
	
	
	
}
