package Steps;

import Elementos.Elementos;
import Metodos.Metodos;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class Steps {
	
	Metodos metodo = new Metodos();
	Elementos elemento = new Elementos();

	@Given("acessar Site {string}")
	public void acessar_site(String string) {
	    
		metodo.openNavegador("https://www.magazineluiza.com.br", "CHROME");
		
	}

	@When("preencher Formulario")
	public void preencher_formulario() throws InterruptedException {
	   
		metodo.digitar(elemento.input, "Cartao luiza");
		metodo.clicar(elemento.btnbusca);
		metodo.esperar(3000);
		metodo.clicar(elemento.image);
		metodo.digitar(elemento.nome, "Lucas Silva");
		metodo.digitar(elemento.cfp, "401.738.498.65");
		metodo.digitar(elemento.celular, "(11) 95566-5656");
		metodo.digitar(elemento.email, "lucassilva3552@gmail.com");
		metodo.esperar(3000);
		
	}

	@Then("validar")
	public void validar() throws InterruptedException {
		metodo.clicar(elemento.enviar);
		metodo.esperar(3000);
		
	}

	
	
}
