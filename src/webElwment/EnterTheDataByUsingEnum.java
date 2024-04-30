package webElwment;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class EnterTheDataByUsingEnum {
	public static void main(String[] args) throws Throwable {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demo.vtiger.com/vtigercrm/");
		Thread.sleep(2000);
		WebElement usernameTextField = driver.findElement(By.id("username"));
		Thread.sleep(2000);
		usernameTextField.sendKeys(Keys.CONTROL+"a");
		Thread.sleep(2000);
		usernameTextField.sendKeys(Keys.DELETE);
		Thread.sleep(2000);
		usernameTextField.sendKeys(Keys.chord("admin"));
		Thread.sleep(2000);
		WebElement passwordTextField = driver.findElement(By.id("password"));
		Thread.sleep(2000);
		passwordTextField.sendKeys(Keys.CONTROL+"a");
		Thread.sleep(2000);
		passwordTextField.sendKeys(Keys.DELETE);
		Thread.sleep(2000);
		passwordTextField.sendKeys(Keys.chord("Test@123"));
		Thread.sleep(2000);
		WebElement signinButton = driver.findElement(By.xpath("//button[text()='Sign in']"));
		signinButton.sendKeys(Keys.ENTER);
		Thread.sleep(2000);
		driver.manage().window().minimize();
		driver.quit();
		
	}

}
