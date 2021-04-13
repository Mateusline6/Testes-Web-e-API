package Tests;

import java.io.IOException;

import Elements.Elements;
import Methods.Methods;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class Steps {

	Methods m = new Methods();
	Elements el = new Elements();

	@Given("that I am on the site {string}")
	public void that_i_am_on_the_site(String site) throws IOException {

		m.openBrowser(site, "Acessando magazine");
		m.validate("magazineluiza.com", el.magalu, null);
	}

	@Given("access the card form")
	public void access_the_card_form() throws IOException {
		m.toType(el.pesquisa, "Cartao luiza", "Pesquisando cartao");
		m.click(el.button, null);
		m.click(el.Imagen, null);

	}

	@When("fill the form {string} {string} {string} {string} in step")
	public void fill_the_form_in_step(String nome, String email, String cpf, String renda) throws IOException {
		m.toType(el.Name, nome, "Digitando nome");
		m.toType(el.Email, email, "Digitando email");
		m.toType(el.Cpf, cpf, "Digitando CPF");
		m.toType(el.Renda, renda, "Digitando renda");

	}

	@Then("I verify the ok in step")
	public void i_verify_the_ok_in_step() throws IOException {
		m.click(el.Proximo, "Continuar");
		m.validate("Me fale mais sobre você.", el.h1, "Validado com sucesso");
		m.quit("Finalizando teste 1");
	}

	@Then("I verify the invalid in step")
	public void i_verify_the_invalid_in_step() throws IOException {
		m.validate("Insira nome completo", el.erroName, "Validado");
		m.validate("Digite um E-mail válido", el.erroEmail, "Validado");
		m.validate("Digite um CPF válido", el.erroCpf, "Validado");
		m.submit(el.Renda, null);
		m.quit("Finalizando teste");
	}

}
