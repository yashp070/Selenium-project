package webdrivermethods;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class NavigateMethod {

	public static void main(String[] args)throws Throwable{
		// Instantiate the browser specific class
		WebDriver driver = new ChromeDriver();
		// Pre-condition
		driver.manage().window().maximize();
		Thread.sleep(2000);
		// trigger the main url of the web appln
		driver.get("https://www.dassault-aviation.com/en/");
		Thread.sleep(2000);
		driver.navigate().to("https://www.dassault-aviation.com/en/group/");
		Thread.sleep(2000);
		driver.navigate().to("https://www.dassault-aviation.com/en/passion/");
		Thread.sleep(2000);
		driver.navigate().to("https://www.dassault-aviation.com/en/civil/");
		Thread.sleep(2000);
		driver.navigate().back();
		Thread.sleep(2000);
		driver.navigate().forward();
		Thread.sleep(2000);
		driver.navigate().to("https://www.dassault-aviation.com/en/space/");
		Thread.sleep(2000);
		driver.navigate().to("https://www.dassault-aviation.com/en/defense/");
		Thread.sleep(2000);
		driver.navigate().refresh();
		// post-condition
		driver.manage().window().minimize();
		Thread.sleep(2000);
		driver.manage().window().maximize();
		//closing the browser
		driver.close();
		
	}

}
