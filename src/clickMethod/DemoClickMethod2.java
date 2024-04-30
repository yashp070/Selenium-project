package clickMethod;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class DemoClickMethod2 {
	public static void main(String[] args) throws Throwable {
	WebDriver driver = new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("https://shop-global.malaicha.com/login");
	Thread.sleep(3000);
	WebElement registerButton = driver.findElement(By.xpath("//button[text()='Register']"));
	registerButton.click();
	Thread.sleep(2000);
	driver.manage().window().minimize();
	driver.quit();
	
	}

}
