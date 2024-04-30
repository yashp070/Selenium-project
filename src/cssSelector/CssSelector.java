package cssSelector;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class CssSelector {
	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://en-gb.facebook.com/reg/");
		//WebElement mobileNumberTextField = driver.findElement(By.cssSelector("input[name = 'reg_email__']"));
		WebElement mobileNumberTextField = driver.findElement(By.cssSelector("input[aria-label = 'Mobile number or email address']"));
		mobileNumberTextField.sendKeys("876873464836");
		//WebElement firstNameTextField = driver.findElement(By.cssSelector("input[name = 'firstname']"));
		//firstNameTextField.sendKeys("yashraj");

		
	}

}
