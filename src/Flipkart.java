import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Flipkart {
	public static void main(String[] args) throws Throwable {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		driver.get("https://www.flipkart.com/");
		Thread.sleep(4000);
		WebElement xOption = driver.findElement(By.xpath("//button[text()='✕']"));
		xOption.click();
		Thread.sleep(4000);
		Actions a = new Actions(driver);
		WebElement electronics = driver.findElement(By.xpath("//div[contains(text(),'Electronics')]"));
		a.moveToElement(electronics).perform();
		WebElement bluetooth = driver.findElement(By.xpath("//a[normalize-space()='Audio']"));
		bluetooth.click();
		
	}
}
