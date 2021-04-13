package Steps;

import Elementos.Elementos;
import Metodos.Metodos;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class Steps {

	
	Metodos metodo = new Metodos();
	Elementos elemento = new Elementos();
	
	
	@Given("realizar pesquisa {string}")
	public void realizar_pesquisa(String string) throws InterruptedException {
	
		string = "Bolsas";
		metodo.abrirNavegador("https://www.shoestock.com.br", "CHROME");
		metodo.esperar(3000);
		metodo.digitar(elemento.pesquisa, string);
		metodo.clicar(elemento.btnBusca);
		
		
	}


	@When("incluir produto")
	public void incluir_produto() throws InterruptedException {
		
		metodo.esperar(3000);
		metodo.clicar(elemento.bolsa);
		metodo.esperar(7000);
		metodo.clicar(elemento.novaCompra);
		metodo.esperar(6000);
		
	
	}

	
	
	
	@Then("validar produtos")
	public void validar_produtos() {
	   
		
		metodo.clicar(elemento.btnBusca);
		
	}

	
	
	
	
	
	
}
