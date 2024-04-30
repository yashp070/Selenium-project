import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class UseOfScrollToNscrollBy {
public static void main(String[] args) throws Throwable {
	WebDriver driver = new ChromeDriver();
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(2));
	driver.get("https://www.google.com/doodles");
	JavascriptExecutor jse = (JavascriptExecutor)driver;
	jse.executeScript("window.scrollBy(0,400)");
	WebElement lenkaFranulic = driver.findElement(By.xpath("//a[@title=\"Lenka Franulic's 115th Birthday\"]"));
	lenkaFranulic.click();
	Thread.sleep(2000);
	driver.navigate().back();
	Thread.sleep(2000);
	jse.executeScript("window.scrollTo(0,-400)");
	Thread.sleep(2000);
	driver.navigate().refresh();
	for (; ; ) {
		try {
			WebElement naiheriaIndependenceday = driver.findElement(By.xpath("//a[normalize-space()='Nigeria Independence Day 2022']"));
			naiheriaIndependenceday.click();
			break;
		} catch (NoSuchElementException e) {
			jse.executeScript("window.scrollBy(0,400)");
		}
	}
	driver.manage().window().maximize();
	driver.quit();
	
}
}
