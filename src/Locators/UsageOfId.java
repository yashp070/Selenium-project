package Locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class UsageOfId {
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		//driver.get("https://www.facebook.com/");
		//WebElement emailTextField = driver.findElement(By.id("email"));
		//emailTextField.sendKeys("6783265897");
		driver.get("https://demo.actitime.com/login.do");
		WebElement usernameTextField=driver.findElement(By.id("username"));
		usernameTextField.sendKeys("yashraj");
		Thread.sleep(2000);
		driver.manage().window().minimize();
		driver.quit();
	
		
		
		
		
	}
	

}
