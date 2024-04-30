package webElwment;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class UsageOfIsEnableMethod {
	public static void main(String[] args) {
		//pre-condition
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com/");
		WebElement loginButton = driver.findElement(By.name("login"));
		if(loginButton.isEnabled()) {
			System.out.println("Method: True");
			System.out.println("Appln: The loginButton should be in the enabled state.");
			loginButton.submit();
		}else {
			System.out.println("Method: False");
			System.out.println("Appln: The loginButton should not be in the enabled state.");
		}
		driver.manage().window().minimize();
		driver.quit();
	}

}
