package Methods;

import static org.junit.Assert.assertArrayEquals;
import static org.junit.Assert.assertEquals;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;

public class Methods extends Browser{
	
	public void escrever(By element, String text) {
		
		aDriver().findElement(element).sendKeys(text);
		
	}
	
	public void clicar(By element) {
		
		aDriver().findElement(element).click();
		
	}
	
	public void screenshot(String nomeSrc) throws IOException {
		
		TakesScreenshot srcShot = ((TakesScreenshot)aDriver());
		File srcFile = srcShot.getScreenshotAs(OutputType.FILE);
		File destFile = new File("./Evidencias/"+ nomeSrc + ".png");
		FileUtils.copyFile(srcFile, destFile);
	}
	
	public void ValidarTitle(String title) {
		
		String paginaAtual = aDriver().getTitle();
		assertEquals(title, paginaAtual);
		
	}
	
	
}
