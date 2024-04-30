package webdrivermethods;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class PreAndPostCondition 
{
	public static void main(String[] args)throws Throwable {
		// Instantiate the browser specific class
		WebDriver driver =new ChromeDriver();
		Thread.sleep(2000);
		// Pre-Condition  
		driver.manage().window().maximize();
		//Trigger main url of the application
		driver.get("https://www.dassault-aviation.com/en/");
		Thread.sleep(2000);
		driver.manage().window().fullscreen();
		Thread.sleep(2000);
		// Post-Condition
		driver.manage().window().minimize();
		Thread.sleep(2000);
		driver.manage().window().maximize();
		Thread.sleep(2000);
		driver.close();

		
	}

}
