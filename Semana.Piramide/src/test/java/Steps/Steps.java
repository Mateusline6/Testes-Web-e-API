package Steps;

import java.io.IOException;

import Elements.Elements;
import Methods.Form;
import Methods.Methods;
import io.cucumber.java.pt.Dado;
import io.cucumber.java.pt.Entao;
import io.cucumber.java.pt.Quando;

public class Steps {

	
	Methods m = new Methods();
	Elements l = new Elements();
	Form f = new Form();
	
	@Dado("que eu esteja no formulario")
	public void que_eu_esteja_no_formulario() {
	    m.openBrowser("file:///C:/Users/mateu/OneDrive/%C3%81rea%20de%20Trabalho/Semana%20piramide%20de%20teste/index.html");
	}

	@Quando("eu preecher e enviar o formulario")
	public void eu_preecher_e_enviar_o_formulario() throws IOException {
	    f.preencherForm("e2etreinamentos","e2etreinamentos@e2etreinamentos.com.br" , "Bem vindo a E2E");
	    m.clicar(l.getBtn());
	}

	@Entao("sou direcionado para o site da escola")
	public void sou_direcionado_para_o_site_da_escola() {
	    m.ValidarTitle("E2E Treinamentos");
	}
	
	
}
