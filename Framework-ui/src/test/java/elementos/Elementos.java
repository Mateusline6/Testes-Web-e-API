package elementos;

import org.openqa.selenium.By;

public class Elementos {

	// elementos web
	
	private By pesquisar = By.name("q");
	
	
	
	private By e2etreinamentos = By.cssSelector("#tsuid51 > span > div > div > div.Hhmu2e.mod.NFQFxe.viOShc.LKPcQc > div > div.SPZz6b > h2 > span");
	private By felicidade = By.cssSelector("#wp-tabs-container > div:nth-child(1) > div.SzZmKb > div > div > div > div.SPZz6b > h2 > span");
	private By inovacao = By.cssSelector("#wp-tabs-container > div:nth-child(1) > div.SzZmKb > div > div > div > div.SPZz6b > h2 > span");
	
	
	// metodos publicos dos elementos
	public By getPesquisar() {
		return pesquisar;
	}


	public By getE2etreinamentos() {
		return e2etreinamentos;
	}


	public By getFelicidade() {
		return felicidade;
	}


	public By getInovacao() {
		return inovacao;
	} 
	
	
	
	
	
}
