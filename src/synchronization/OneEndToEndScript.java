package synchronization;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class OneEndToEndScript {
public static void main(String[] args) throws Throwable {
	WebDriver driver = new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("https://demo.actitime.com/login.do");
	WebElement usernameTextfield = driver.findElement(By.id("username"));
	usernameTextfield.sendKeys("admin");
	WebElement passwordTextField = driver.findElement(By.name("pwd"));
	passwordTextField.sendKeys("manager");
	WebElement loginOptin = driver.findElement(By.xpath("//a[@id='loginButton']"));
	loginOptin.click();
	Thread.sleep(2000);
	String actualHomePageURL = driver.getCurrentUrl();
	if(actualHomePageURL.equals("https://demo.actitime.com/user/submit_tt.do")) {
		WebElement logoutLink = driver.findElement(By.id("logoutLink"));
		System.out.println("actualHomePageURL is as per expected");
		if(logoutLink.isDisplayed()) {
			logoutLink.click();
			System.out.println("logoutLink is displayed");
		}else {
			System.out.println("logoutLink is not displayed");
		}
	}else {
		System.out.println("actualHomePageURL is not as per expected");
	}
	driver.manage().window().minimize();
	driver.quit();
}
}
