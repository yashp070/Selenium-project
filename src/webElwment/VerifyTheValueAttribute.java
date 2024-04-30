package webElwment;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class VerifyTheValueAttribute {
public static void main(String[] args) throws Throwable {
	WebDriver driver = new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("https://demo.vtiger.com/vtigercrm/");
	Thread.sleep(2000);
	WebElement usernameTextField = driver.findElement(By.id("username"));
	String valueOfUsernameTextField = usernameTextField.getAttribute("value");
	if(valueOfUsernameTextField.isEmpty()) {
		System.out.println("method: true, the data should not be present in the text field");
		System.out.println("the data is not present in the text field");
		usernameTextField.sendKeys("admin");
	}else {
		System.out.println("method: False, the data is present in the text field");
		Thread.sleep(2000);
		System.out.println("the data is present in the text field");
		Thread.sleep(2000);
		usernameTextField.sendKeys(Keys.CONTROL+"a");
		Thread.sleep(2000);
		usernameTextField.sendKeys(Keys.DELETE);
		Thread.sleep(2000);
		usernameTextField.sendKeys(Keys.chord("ADMIN"));
		Thread.sleep(2000);
	}
	driver.manage().window().minimize();
	driver.quit();
}
}
