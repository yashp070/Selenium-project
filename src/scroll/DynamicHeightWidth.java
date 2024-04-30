package scroll;

import java.time.Duration;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class DynamicHeightWidth {
public static void main(String[] args) {
	WebDriver driver = new ChromeDriver();
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
	driver.get("https://www.google.com/doodles/");
	JavascriptExecutor jse = (JavascriptExecutor)driver;
	Long doodlesPageHeight = (Long)jse.executeScript("return document.body.scrollHeight");
	System.out.println("doodlesPageHeight =" + doodlesPageHeight);
	Long doodlesPageWidth = (Long)jse.executeScript("return document.body.scrollWidth");
	System.out.println("doodlesPageWidth =" + doodlesPageWidth);
	driver.navigate().refresh();
	Long doodlesPageHeight01 = (Long)jse.executeScript("return document.body.scrollHeight");
	System.out.println("doodlesPageHeight01 =" + doodlesPageHeight01);
	
}
}
