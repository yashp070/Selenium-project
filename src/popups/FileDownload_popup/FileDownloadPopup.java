package popups.FileDownload_popup;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.SearchContext;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FileDownloadPopup {
public static void main(String[] args) throws Throwable {
	WebDriver driver = new ChromeDriver();
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
	driver.get("https://www.selenium.dev/downloads/");
	JavascriptExecutor jse = (JavascriptExecutor)driver;
	jse.executeScript("window.scrollTo(0,1100)");
	Thread.sleep(2000);
	WebElement currentselVersion = driver.findElement(By.linkText("4.11.0"));
	currentselVersion.click();
	driver.get("chrome://downloads/");
	//WebElement shadowHost1 = driver.findElement(By.tagName("downloads-manager"));
	//SearchContext shadowRoot1 = shadowHost1.getShadowRoot();
	//WebElement shadowHost2 = shadowRoot1.findElement(By.id("frb0"));
	//SearchContext shadowRoot2 = shadowHost2.getShadowRoot();
	//WebElement targetElement = shadowRoot2.findElement(By.cssSelector("cr-button[role='button']"));
	Thread.sleep(2000);
	//targetElement.click();
	WebElement shadowHost1 = driver.findElement(By.tagName("downloads-manager"));
	SearchContext shadowRoot1 = shadowHost1.getShadowRoot();
	WebElement shadowHost2 = shadowRoot1.findElement(By.id("frb0"));
	SearchContext shadowRoot2 = shadowHost2.getShadowRoot();
	WebElement discardOption = shadowRoot2.findElement(By.cssSelector("cr-button[role='button']"));
	Thread.sleep(2000);
	discardOption.click();
}
}
