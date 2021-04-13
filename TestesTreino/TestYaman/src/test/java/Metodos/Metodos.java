package Metodos;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import Elementos.Elementos;

public class Metodos {

	WebDriver driver;

	Elementos elemento = new Elementos();

	public void abrirNavegador(String url, String browser) {

		if (browser == "CHROME") {

			System.setProperty("webdriver.chrome.driver", "./Driver/chromedriver.exe");
			driver = new ChromeDriver();
			driver.get(url);
			driver.manage().window().maximize();

		} else if (browser == "FIREFOX") {

			System.setProperty("webdriver.gecko.driver", "./Driver/geckodriver.exe");
			driver = new FirefoxDriver();
			driver.get(url);
			driver.manage().window().maximize();

		} else {

			System.out.println("Por Favor digite CHROME ou FIREFOX");

		}
	}

	public void digitar(By elemento, String texto) {

		driver.findElement(elemento).sendKeys(texto);

	}

	public void esperar(int tempo) throws InterruptedException {

		Thread.sleep(tempo);

	}

	public void fechar() {

		driver.quit();
		System.out.println("Finalizando tarefa");
	}

	public void clicar(By elemento) {

		driver.findElement(elemento).click();

	}

}
