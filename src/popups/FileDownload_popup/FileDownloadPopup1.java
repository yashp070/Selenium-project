package popups.FileDownload_popup;

import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.SearchContext;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FileDownloadPopup1 {

	public static void main(String[] args) throws Throwable {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		driver.get("https://www.selenium.dev/downloads/");
		JavascriptExecutor jse = (JavascriptExecutor)driver;
		jse.executeScript("window.scrollBy(0,1100)");
		Thread.sleep(2000);
		WebElement slNewVersion = driver.findElement(By.linkText("4.12.0"));
		slNewVersion.click();
		driver.get("chrome://downloads/");
		WebElement shadowHost1 = driver.findElement(By.tagName("downloads-manager"));
		SearchContext shadowRoot1 = shadowHost1.getShadowRoot();
		WebElement shadowHost2 = shadowRoot1.findElement(By.id("frb0"));
		SearchContext shadowRoot2 = shadowHost2.getShadowRoot();
		WebElement targetEle = shadowRoot2.findElement(By.cssSelector("cr-button[focus-type='save']"));
		targetEle.click();
		Robot robot = new Robot();
		robot.keyPress(KeyEvent.VK_TAB);
		robot.keyRelease(KeyEvent.VK_TAB);
		robot.delay(2000);
		robot.keyPress(KeyEvent.VK_ENTER);
		robot.keyRelease(KeyEvent.VK_ENTER);
		
	}
}
