package pages;

import static org.junit.Assert.assertEquals;

import java.io.File;
import java.io.IOException;
import java.time.LocalDateTime;
import java.util.NoSuchElementException;

import org.apache.commons.io.FileUtils;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;


public class Metodos {

	WebDriver driver;

	public void abrirNavergador(String appUrl, String descricaoPasso) {

		try {
		System.setProperty("webdriver.chrome.driver", "./Drivers/chromedriver.exe");
		driver = new ChromeDriver();
		driver.get(appUrl);
		driver.manage().window().maximize();
		}catch(Exception e) {
			
			Assert.fail(LocalDateTime.now()+ " erro no passo \"+ descricaoPasso");
			
		}
		
	}

	public void escrever(String texto, By elemento) {
		try {
		driver.findElement(elemento).sendKeys(texto);
		}catch (NoSuchElementException e) {
			Assert.fail(LocalDateTime.now()+ " erro no passo \"+ descricaoPasso");
		}
	}

	public void submit(By elemento) {

		driver.findElement(elemento).submit();

	}

	public void validarTexto(By elemento, String txtEsperado) {

		String texto = driver.findElement(elemento).getText();
		assertEquals(txtEsperado, texto);

	}

	public void validarPorTexto(String palavra) {

		String texto = driver.findElement(By.xpath("//span[text()='" + palavra + "']")).getText();
		assertEquals(palavra, texto);

	}

	public void sairNavegador(String teste) throws IOException {
		screenShot(teste);
		driver.quit();

	}

	public void screenShot(String nome) throws IOException {

		TakesScreenshot srcShot = ((TakesScreenshot) driver);
		File srcFile = srcShot.getScreenshotAs(OutputType.FILE);
		File destFile = new File("./src/evidencias/" + nome + "teste.png");
		FileUtils.copyFile(srcFile, destFile);

	}

}
