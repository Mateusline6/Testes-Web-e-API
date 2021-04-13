package Elements;

import org.openqa.selenium.By;

public class Elements {
	public By pesquisa = By.id("inpHeaderSearch");
	public By button = By.id("btnHeaderSearch");
	public By LinkCartao = By.cssSelector(
			"#__next > div > div > div:nth-child(1) > div > div.wrapper-main > div > div.wrapper-menu > nav > div > div > div > ul > li.item-of-menu.item-ten.js-item > a");
	public By Imagen = By.cssSelector("#__next > div > div > div:nth-child(2) > a > img");
	public By Name = By.id("form.payload.lead_name_crypto");
	public By Email = By.id("form.payload.contact_email");
	public By Cpf = By.id("form.payload.cpf");
	public By Renda = By.id("form.payload.profession_income");
	public By Proximo = By.id("form-0");

	public By erroName = By.id("error_form.payload.lead_name_crypto");
	public By erroEmail = By.id("error_form.payload.contact_email");
	public By erroCpf = By.id("error_form.payload.cpf");
	public By erroRenda = By.xpath("//*[@id=\"error_form.payload.profession_income\"]/span/text()[1]");

	public By magalu = By.cssSelector(
			"#__next > div:nth-child(2) > div > div.wrapper-main > div > div.wrapper-header > header > div > div:nth-child(1) > div > div > div.container-left-top-header > a:nth-child(2) > span > strong");
	public By H12 = By.cssSelector("#home > div.col.left > div.step > div > div > h1");
	public By h1 = By.cssSelector("#home > div.col.left > div.step > div > div > h1");
	
	
	
	
}
