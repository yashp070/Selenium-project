package webElwment;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class UsageOfIsDisplayedMethod {
public static void main(String[] args) {
	WebDriver driver = new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("https://www.facebook.com/");
	WebElement emailTextField = driver.findElement(By.id("email"));
	if(emailTextField.isDisplayed()) {
		System.out.println("Method: True");
		System.out.println("Appln: True: The emailTextfield should be visible in the web page.");
		emailTextField.sendKeys("fgfdhdf");
	}else {
		System.out.println("Method: False");
		System.out.println("Appln: False: The emailTextfield should not be visible in the web page.");
	}
	driver.manage().window().minimize();
	driver.quit();
}
}
