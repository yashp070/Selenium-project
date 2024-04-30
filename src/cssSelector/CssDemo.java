package cssSelector;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class CssDemo {
	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
	    driver.manage().window().maximize();
	    driver.get("https://www.facebook.com/signup/");
	    //WebElement firstNameTextField = driver.findElement(By.cssSelector("input[aria-label = 'First name']"));
	    //firstNameTextField.sendKeys("yashraj");
	    WebElement firstNameTextField = driver.findElement(By.cssSelector("input[name = 'firstname']"));
	    firstNameTextField.sendKeys("dhgfjdsh");
	}

}
