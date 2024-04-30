package synchronization;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class UseOfSynchronization {
public static void main(String[] args) {
	WebDriver driver = new ChromeDriver();
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
	WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(5));
	driver.get("https://demo.actitime.com/login.do");
	WebElement userNameTextField = driver.findElement(By.id("username"));
	userNameTextField.sendKeys("admin");
	WebElement passwordTextField = driver.findElement(By.name("pwd"));
	passwordTextField.sendKeys("manager");
	WebElement loginOption = driver.findElement(By.id("loginButton"));
	loginOption.click();
	String actualHomepage = driver.getCurrentUrl();
	System.out.println(actualHomepage);
	wait.until(ExpectedConditions.urlToBe("https://demo.actitime.com/user/submit_tt.do"));
	WebElement logoutLink = driver.findElement(By.id("logoutLink"));
	wait.until(ExpectedConditions.elementToBeClickable(logoutLink));
	logoutLink.click();
	driver.manage().window().minimize();
	driver.quit();
}
}
