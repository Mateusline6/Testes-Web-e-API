package Methods;

import static org.junit.Assert.assertEquals;

import java.io.File;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Methods {

	WebDriver driver;

	public void openBrowser(String url, String description) throws IOException {

		try {

			System.setProperty("webdriver.chrome.driver", "./Driver/chromedriver.exe");
			driver = new ChromeDriver();
			driver.get(url);
			driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
			driver.manage().window().maximize();
			System.out.println("Getting Started");

		} catch (Exception e) {
			e.printStackTrace();
			System.out.println("Pitch failure " + description);
			screenShot(description);
		}

	}

	public void toType(By element, String text, String description) throws IOException {
		try {

			driver.findElement(element).sendKeys(text);

		} catch (Exception e) {
			e.printStackTrace();
			System.out.println("Pitch failure " + description);
			screenShot(description);
		}

	}

	public void waitForClick(By element, String description) {

		try {
			WebDriverWait wait = new WebDriverWait(driver, 10);
			wait.until(ExpectedConditions.elementToBeClickable(element));

		} catch (Exception e) {
			e.printStackTrace();
			System.out.println("Pitch failure " + description);
		}

	}

	public void waiting(By element) {

		WebDriverWait wait = new WebDriverWait(driver, 10);
		wait.until(ExpectedConditions.invisibilityOfElementLocated(element));

	}

	public void validate(String text, By element, String description) throws IOException {
		try {

			String txtTela = driver.findElement(element).getText();
			assertEquals(text, txtTela);
		} catch (Exception e) {
			e.printStackTrace();
			System.out.println("Pitch failure " + description);
			screenShot(description);
		}

	}

	public void quit(String description) throws IOException {
		try {
			driver.quit();
			System.out.println("Teste Finalizado");
		} catch (Exception e) {
			e.printStackTrace();
			System.out.println("Pitch failure " + description);
			screenShot(description);
		}
	}

	public void zoom() {

		WebElement html = driver.findElement(By.tagName("html"));
		html.sendKeys(Keys.chord(Keys.CONTROL, Keys.SUBTRACT));

	}

	public void click(By element, Object description) throws IOException {
		try {
			driver.findElement(element).click();
		} catch (Exception e) {
			e.printStackTrace();
			System.out.println("Pitch failure " + description);
			screenShot(description);
		}

	}

	public void submit(By element, String description) throws IOException {
		try {
			driver.findElement(element).submit();
		} catch (Exception e) {
			e.printStackTrace();
			System.out.println("Pitch failure " + description);
			screenShot(description);
		}
	}

	public void screenShot(Object description) throws IOException {

		TakesScreenshot shot = ((TakesScreenshot) driver);
		File file = shot.getScreenshotAs(OutputType.FILE);
		File Cam = new File("./relatorio" + description + ".png");
		FileUtils.copyDirectory(file, Cam);

	}

}
