package Elementos;

import org.openqa.selenium.By;

public class Elementos {

	
	public By pesquisa = By.id("search-input");
	public By bolsa = By.cssSelector("div.item-card:nth-child(1) > div:nth-child(1) > a:nth-child(2)");
	public By tam = By.cssSelector("div.label:nth-child(1) > ul:nth-child(2) > li:nth-child(8) > a:nth-child(1)");
	public By novaCompra = By.id("buy-button-now");
	public By btnBusca = By.cssSelector("button.button");
	public By btnContinua = By.cssSelector("body > div.main > div.cart.breakpoint.main > div.cart__content > div.cart__summary > div.summary > div > a.btn.btn--secondary.btn--block");
	
	
}
