import java.time.Duration;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class DynamicWebPageScrollHeightWidth {
public static void main(String[] args) throws Throwable {
	WebDriver driver = new ChromeDriver();
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
	driver.get("https://www.google.com/doodles");
	JavascriptExecutor jse = (JavascriptExecutor)driver;
	Long dynamicWebpageHeight = (Long)jse.executeScript("return document.body.scrollHeight");
	System.out.println("dynamicWebpageHeight = " + dynamicWebpageHeight);
	Long dynamicWebpageWidth = (Long)jse.executeScript("return document.body.scrollWidth");
	System.out.println("dynamicWebpageWidth = " + dynamicWebpageWidth);
	driver.navigate().refresh();
	Thread.sleep(2000);
	Long dynamicWebpageHeight01 = (Long)jse.executeScript("return document.body.scrollHeight");
	System.out.println("dynamicWebpageHeight01 = " + dynamicWebpageHeight01);
	Long dynamicWebpageWidth01 = (Long)jse.executeScript("return document.body.scrollWidth");
	System.out.println("dynamicWebpageWidth01 = " + dynamicWebpageWidth01);
	driver.manage().window().minimize();
	driver.quit();
}
}
