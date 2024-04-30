import java.time.Duration;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Scrolling {
public static void main(String[] args) throws Throwable {
	WebDriver driver = new ChromeDriver();
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
	driver.get("https://www.google.com/doodles/");
	Thread.sleep(5000);
	JavascriptExecutor jse = (JavascriptExecutor)driver;
	//jse.executeScript("window.scrollBy(0,4000)");
	jse.executeScript("window.scrollTo(0,4000)");
	Thread.sleep(3000);
	//jse.executeScript("window.scrollBy(0,-4500)");
	jse.executeScript("window.scrollBy(0,-4500)");
	Thread.sleep(3000);
	driver.manage().window().minimize();
	driver.quit();
}
}
