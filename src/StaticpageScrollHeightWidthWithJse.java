import java.time.Duration;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class StaticpageScrollHeightWidthWithJse {
public static void main(String[] args) {
	WebDriver driver = new ChromeDriver();
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
	driver.get("https://facebook.com/");
	JavascriptExecutor jse = (JavascriptExecutor)driver;
	Long facebookWebPageHeight = (Long)jse.executeScript("return document.body.scrollHeight");
	System.out.println("facebookWebPageHeight =" + facebookWebPageHeight);
	Long facebookWebPageWidth = (Long)jse.executeScript("return document.body.scrollWidth");
	System.out.println("facebookWebPageWidth =" + facebookWebPageWidth);
	
}
}
