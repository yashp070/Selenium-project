package webElwment;

import org.openqa.selenium.By;
import org.openqa.selenium.Rectangle;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LeftAllignmentCheck {
public static void main(String[] args) {
	// Pre-condition
	WebDriver driver = new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("https://www.facebook.com/");
	// email
	WebElement emailTextField = driver.findElement(By.id("email"));
	Rectangle emailRect = emailTextField.getRect();
	int emailStartX = emailRect.getX();
	System.out.println(emailStartX);
	int emailwidth = emailRect.getWidth();
	System.out.println(emailwidth);
	int emailEndX = emailStartX+emailwidth;
	System.err.println(emailEndX);
	// password
	WebElement passwordTextField = driver.findElement(By.id("passContainer"));
	Rectangle passwordRect = passwordTextField.getRect();
	int passwordStartX = passwordRect.getX();
	System.out.println(passwordStartX);
	int passwordWidth = passwordRect.getWidth();
	System.out.println(passwordWidth);
	int passwordEndX = passwordStartX+passwordWidth;
	System.out.println(passwordEndX);
	// verification and validation
	if(emailEndX==passwordEndX) {
		System.out.println("Pass: The left allignment of is verified and found correct.");
	}else {
		System.out.println("Pass: The left allignment of is verified and found correct.");
	}
	// Post-condition
	driver.manage().window().minimize();
	driver.quit();
}
}
