package webdrivermethods;

import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ToURLUrlMethod {
	@SuppressWarnings("deprecation")
	public static void main(String[] args) throws MalformedURLException, InterruptedException  {
		// Instantiate the browser specific class
		WebDriver driver =new ChromeDriver();
		// pre condition
		driver.manage().window().maximize();
		// Trigger the main Url of the application
		driver.get("https://www.dassault-aviation.com/en/");
		Thread.sleep(2000);
		URL mainUrl= new URL("https://www.dassault-aviation.com/en/");
		Thread.sleep(1000);
		//URL(string spec)
		URL groupsPage = new URL(mainUrl, "group/");
		// URL(context, spec)
		driver.navigate().to(groupsPage);
		Thread.sleep(2000);
		URL spacePage = new URL(mainUrl,"space/");
		driver.navigate().to(spacePage);
		Thread.sleep(2000);
		URL passionPage =new URL(mainUrl, "passion/");
		driver.navigate().to(passionPage);
		Thread.sleep(2000);
		URL defencePage = new URL(mainUrl, "defense/");
		driver.navigate().to(defencePage);
		Thread.sleep(2000);
		// post condition
		driver.manage().window().minimize();
		Thread.sleep(1000);
		// close browser
		driver.close();
		
	}

}
