package cssSelector;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class CSSDemo_02 {
	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com/signup/");
		//WebElement mobileNumberTextField = driver.findElement(By.cssSelector("input[name = 'reg_email__']"));
		//mobileNumberTextField.sendKeys("64657738383");
		WebElement mobileNumberTextField = driver.findElement(By.cssSelector("input[aria-label = 'Mobile number or email address']"));
		mobileNumberTextField.sendKeys("9384584774");
	}

}
