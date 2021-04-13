package Elements;

import org.openqa.selenium.By;

public class Elements {

	private By nome = By.id("nome");
	private By email = By.id("email");
	private By msg = By.id("msg");
	private By btn = By.cssSelector("a");
	public By getBtn() {
		return btn;
	}
	public void setBtn(By btn) {
		this.btn = btn;
	}
	public By getMsg() {
		return msg;
	}
	public void setMsg(By msg) {
		this.msg = msg;
	}
	public By getEmail() {
		return email;
	}
	public void setEmail(By email) {
		this.email = email;
	}
	public By getNome() {
		return nome;
	}
	public void setNome(By nome) {
		this.nome = nome;
	}
	
}
