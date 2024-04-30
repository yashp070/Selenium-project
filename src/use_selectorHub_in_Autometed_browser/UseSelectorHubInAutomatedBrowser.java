package use_selectorHub_in_Autometed_browser;

import java.io.File;
import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class UseSelectorHubInAutomatedBrowser {
	public static void main(String[] args) {
		
		//WebDriver driver = new ChromeDriver();
		ChromeOptions options = new ChromeOptions();      
		options.addExtensions(new File("C:\\Users\\jashobanta pradhan\\eclipse-workspace\\NewSeleniumProject\\SelectorsHub 5.1.6.0.crx"));   
		WebDriver driver = new ChromeDriver(options);
		driver.manage().window().maximize();
		//WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(5));
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		driver.get("https://demo.guru99.com/");
}
}


// code of selector hub run in automated browser.

//ChromeOptions options = new ChromeOptions();      
	//options.addExtensions(new File("C:\\Users\\jashobanta pradhan\\eclipse-workspace\\NewSeleniumProject\\SelectorsHub 5.1.6.0.crx"));   
	//WebDriver driver = new ChromeDriver(options);
