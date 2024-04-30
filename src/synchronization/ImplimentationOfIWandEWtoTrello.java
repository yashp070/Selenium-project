package synchronization;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ImplimentationOfIWandEWtoTrello {
public static void main(String[] args) {
	WebDriver driver = new ChromeDriver();
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
	WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
	driver.get("https://trello.com/");
	WebElement loginOption = driver.findElement(By.xpath("//a[text()='Get Trello for free']/preceding-sibling::a[text()='Log in']"));
	loginOption.click();
	wait.until(ExpectedConditions.urlToBe("https://trello.com/login"));
	WebElement emailTextField = driver.findElement(By.id("user"));
	emailTextField.sendKeys("letsuccessmakesnoise@gmail.com");
	WebElement continueButton = driver.findElement(By.id("login"));
	continueButton.submit();
	wait.until(ExpectedConditions.urlContains("https://id.atlassian.com/login?application=trello&continue"));
	WebElement passwordTextField = driver.findElement(By.id("password"));
	passwordTextField.sendKeys("successisthekey");
	WebElement loginButton = driver.findElement(By.id("login-submit"));
	loginButton.submit();
	wait.until(ExpectedConditions.urlToBe("https://trello.com/u/letsuccessmakesnoise/boards"));
	WebElement accountOption = driver.findElement(By.xpath("//button[@aria-label='Open member menu']"));
	accountOption.click();
	WebElement logoutOption = driver.findElement(By.xpath("//button/span[text()='Log out']"));
	logoutOption.click();
	wait.until(ExpectedConditions.urlContains("https://id.atlassian.com/logout?continue"));
	WebElement logoutButton = driver.findElement(By.id("logout-submit"));
	logoutButton.submit();
	wait.until(ExpectedConditions.urlToBe("https://trello.com/home"));
	driver.manage().window().minimize();
	driver.quit();
}
}
