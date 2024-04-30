package webdrivermethods;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class UsageOfGetTitel {
	public static void main(String[] args) {
		//  Instantiate the browser specific class
		WebDriver driver=new ChromeDriver();
		//  Trigger the main url of the application
		driver.get("https://www.facebook.com");
		String expectedTitle = "Facebook – log in or sign up";
		System.out.println("expectedTitle =" + expectedTitle);
		String actualTitle = driver.getTitle();
		System.out.println("actualTitle =" + actualTitle);
		if(actualTitle.equals(expectedTitle)) {
			System.out.println("Pass : the actualTitle is verified and found correct.");
		}else {
			System.out.println("Fail : the actualTitle is verified and found incroct.");
		}
		
	}

}
