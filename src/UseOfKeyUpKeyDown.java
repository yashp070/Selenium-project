import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class UseOfKeyUpKeyDown {
public static void main(String[] args) {
	WebDriver driver = new ChromeDriver();
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
	driver.get("https://demo.vtiger.com/vtigercrm/");
	WebElement usernameTextField = driver.findElement(By.id("username"));
	WebElement passwordTextField = driver.findElement(By.id("password"));
	WebElement signinButton = driver.findElement(By.xpath("//button[text()='Sign in']"));
	Actions actions = new Actions(driver);
	actions.keyDown(usernameTextField, Keys.CONTROL).pause(1000).sendKeys("a").pause(1000).keyUp(usernameTextField, Keys.CONTROL).sendKeys(usernameTextField, Keys.BACK_SPACE).pause(1000).keyDown(usernameTextField, Keys.SHIFT).pause(1000).sendKeys(usernameTextField, "admin").pause(1000).keyUp(usernameTextField, Keys.SHIFT).build().perform();
	actions.keyDown(passwordTextField, Keys.CONTROL).pause(1000).sendKeys("a").pause(1000).keyUp(passwordTextField, Keys.CONTROL).sendKeys(passwordTextField, Keys.BACK_SPACE).pause(1000).keyDown(passwordTextField, Keys.SHIFT).pause(1000).sendKeys(passwordTextField, "manager").pause(1000).keyUp(passwordTextField, Keys.SHIFT).build().perform();
	actions.click(signinButton).perform();
	driver.manage().window().minimize();
	driver.quit();
	
}
}
