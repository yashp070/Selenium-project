package webdrivermethods;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class UsageOfGet {
	public static void main(String[] args) {
		// instantiate the browser specific class
		WebDriver driver = new ChromeDriver();
		// triggering the main url of the application
		driver.get("https://www.facebook.com");
	}

}
