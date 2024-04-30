package webElwment;

import org.openqa.selenium.By;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class RightAllignmentCheck {
public static void main(String[] args) {
	// Pre-Condition
	WebDriver driver = new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("https://www.facebook.com/");
	// Email 
	WebElement emailTextField = driver.findElement(By.id("email"));
	Point locationOfemailTextField = emailTextField.getLocation();
	int emailStartX = locationOfemailTextField.getX();
	System.out.println("emailStartX = " + emailStartX);
	// Password
	WebElement passwordTextField = driver.findElement(By.id("passContainer"));
	Point locationOfpasswordTextField = passwordTextField.getLocation();
	int passwordStartX = locationOfpasswordTextField.getX();
	System.out.println("passwordStartX = " + passwordStartX);
	// verification and validation
	if(emailStartX==passwordStartX) {
		System.out.println("Pass: The right allignment is verifyed and found correct.");
	}else {
		System.out.println("Fail: The right allignment is verifyed and found incorrect.");
	}
	// post-condition
	driver.manage().window().minimize();
	driver.quit();
}
}
