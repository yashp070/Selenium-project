package webElwment;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class UsageOfSendKeys {
	public static void main(String[] args) throws Throwable {
		WebDriver driver =new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demo.actitime.com/login.do");
		Thread.sleep(2000);
		WebElement userName = driver.findElement(By.id("username"));
		userName.sendKeys("admin");
		Thread.sleep(2000);
		WebElement password = driver.findElement(By.xpath("//input[@class='textField pwdfield']"));
		password.sendKeys("manager");
		Thread.sleep(2000);
		WebElement loginOption = driver.findElement(By.id("loginButton"));
		loginOption.click();
		Thread.sleep(2000);
		driver.manage().window().minimize();
		driver.quit();
	}

}
