package scroll;

import java.time.Duration;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ScrollingDemo {
public static void main(String[] args) throws Throwable {
	WebDriver driver = new ChromeDriver();
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(6));
	driver.get("https://www.google.com/doodles");
	Thread.sleep(5000);
	JavascriptExecutor jse = (JavascriptExecutor)driver;
	jse.executeScript("window.scrollBy(0,4500)");
	Thread.sleep(2000);
	jse.executeScript("window.scrollBy(0,1500)");
	//jse.executeScript("window.scrollTo(0,6000)");
	//jse.executeScript("window.scrollTo(0,3000)");
}
}
