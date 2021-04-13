package Runner;

import org.junit.runner.RunWith;

import Methods.Browser;
import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(
		
		features = "src/test/resources/Feature",
		glue = "Steps",
		tags = "@Executa",
		dryRun = false,
		monochrome = true,
		plugin = {"pretty" , "html:target/report.html", "json:target/report.json"}
		)

public class Runner  extends Browser{

	
	
	public static void fecharPagina() {
		aDriver().quit();
		System.out.println("Teste Finalizado");
	}
	 
}
