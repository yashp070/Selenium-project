package popups;

import java.util.Set;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.chrome.ChromeDriver;

public class ChildBrowserPopups {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.google.com");
		driver.switchTo().newWindow(WindowType.TAB);
		driver.get("https://www.facebook.com");
		driver.switchTo().newWindow(WindowType.TAB);
		driver.get("https://www.flipkart.com");
		Set<String> allwindowId = driver.getWindowHandles();
		System.out.println(allwindowId);
		for (String str : allwindowId) {
			System.out.println(str);
			
		}
		
	}
}
