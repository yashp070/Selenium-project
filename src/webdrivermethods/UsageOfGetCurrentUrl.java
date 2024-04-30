package webdrivermethods;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class UsageOfGetCurrentUrl 
{
	public static void main(String[] args) {
		// Instantiate the browser specific class
		WebDriver driver = new ChromeDriver();
		// Trigger the main url of the application
		driver.get("https://www.facebook.com");
		String expectedUrl = "https://www.facebook.com/";
		System.out.println("expectedUrl =" + expectedUrl);
		String actualUrl = driver.getCurrentUrl();
		System.out.println("actualUrl =" + actualUrl);
		if(actualUrl.equals(expectedUrl)) {
			System.out.println("Pass : The actualUrl has been verified and found correct");
		}
		else {
			System.out.println("Fail : The actualUrl has been verified and  found incorrect");
		}
	}

}
