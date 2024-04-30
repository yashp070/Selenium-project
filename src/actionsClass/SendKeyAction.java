package actionsClass;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class SendKeyAction {
public static void main(String[] args) {
	WebDriver driver = new ChromeDriver();
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
	driver.get("https://www.facebook.com/");
	Actions actions = new Actions(driver);
	//WebElement emailTextField = driver.findElement(By.id("email"));
	WebElement passwordField = driver.findElement(By.id("passContainer"));
	//actions.sendKeys(emailTextField, "fghjdsfkhds").perform();
	//actions.sendKeys().perform();
	//actions.sendKeys("dsgfdstet").perform();
	actions.sendKeys(passwordField, "abc@123").perform();
	
}
}
