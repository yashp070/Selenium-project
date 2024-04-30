package synchronization;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class PageLoadTimeOut {
public static void main(String[] args) {
	WebDriver driver = new ChromeDriver();
	driver.manage().window().maximize();
	driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(2));
	try {
		driver.get("https://www.myntra.com/");
	} catch (Exception e)  {
		System.out.println("Fail: The Application is not having the capacity to load within the specified time.");
	}
	driver.manage().window().minimize();
	driver.quit();
}
}
