package basics;

import org.openqa.selenium.chrome.ChromeDriver;

public class LaunchEmptyChromeBrowser {
	public static void main(String[] args) {
		//instantiate the browser specific class
		ChromeDriver driver=new ChromeDriver();
		driver.get("http://www.google.com");
	}
}
