package webElwment;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class SizeCheck {
public static void main(String[] args) {
	// Pre-Condition
	WebDriver driver = new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("https://www.facebook.com/");
	// Email
	WebElement emailTextField = driver.findElement(By.id("email"));
	Dimension sizeOfEmailTextField = emailTextField.getSize();
	int heigthofEmailTextField = sizeOfEmailTextField.getHeight();
	System.out.println("heigthofEmailTextField = " + heigthofEmailTextField);
	int widthOfEmailTextField = sizeOfEmailTextField.getWidth();
	System.out.println("widthOfEmailTextField = " + widthOfEmailTextField);
	// Password
	WebElement passwordTextField = driver.findElement(By.id("passContainer"));
	Dimension sizeOfPasswordTextField = passwordTextField.getSize();
	int heightOfPasswordTextField = sizeOfPasswordTextField.getHeight();
	System.out.println("heightOfPasswordTextField = " + heightOfPasswordTextField);
	int widthOfPasswordTextField = sizeOfEmailTextField.getWidth();
	System.out.println("widthOfPasswordTextField = " + widthOfPasswordTextField);
	// verify and validation
	if(heigthofEmailTextField==heightOfPasswordTextField && widthOfEmailTextField==widthOfPasswordTextField) {
		System.out.println("Pass: the heigthofEmailTextField and PasswordTextField and also widthOfEmailTextField and PasswordTextField is verified and found correct.");
	}else {		
		System.out.println("Fail: the heigthofEmailTextField and PasswordTextField and also widthOfEmailTextField and PasswordTextField is verified and found incorrect.");

	}
	// Post-Condition
	driver.manage().window().minimize();
	driver.quit();
}
}
