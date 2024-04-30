package synchronization;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class OneEndToEnd {
	public static void main(String[] args) throws Throwable {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demo.actitime.com/login.do");
		Thread.sleep(2000);
		WebElement usernameTextField = driver.findElement(By.id("username"));
		usernameTextField.sendKeys("admin");
		WebElement passwordTextField = driver.findElement(By.name("pwd"));
		passwordTextField.sendKeys("manager");
		Thread.sleep(2000);
		WebElement loginOption = driver.findElement(By.id("loginButton"));
		loginOption.click();
		Thread.sleep(500);
		String actualHomepageUrl = driver.getCurrentUrl();
		System.out.println("actualHomepageUrl = " + actualHomepageUrl);
		if(actualHomepageUrl.equals("https://demo.actitime.com/user/submit_tt.do")) {
			WebElement logoutLink = driver.findElement(By.id("logoutLink"));
			System.out.println("The Url is of Home page.");
			if(logoutLink.isDisplayed()) {
				logoutLink.click();
				System.out.println("The logout link is displayed.");
			}else {
				System.out.println("The logout link is not displayed.");
			}
		}else {
			System.out.println("The Url id not Home Page Url.");
		}
		driver.manage().window().minimize();
		driver.quit();
	}

}
