package testes;

import java.io.IOException;

import elementos.Elementos;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pages.Metodos;

public class Steps {

	Metodos metodos = new Metodos();
    Elementos elemento = new Elementos();
	
	
	@Given("que eu esteja no {string}")
	public void que_eu_esteja_no(String appUrl) {

		metodos.abrirNavergador(appUrl, appUrl);
	}

	@When("eu busco {String}")
	public void eu_busco_palavra(String palavra) {
		
		metodos.escrever(palavra, elemento.getPesquisar());
		metodos.submit(elemento.getPesquisar());
	}

	@Then("valido o {string}")
	public void valido_o(String retorno) throws IOException {
	
		metodos.validarPorTexto(retorno);
		metodos.sairNavegador(retorno);
		
	}

}
