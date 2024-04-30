package scroll;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class DynamicEcementClick {
public static void main(String[] args) {
	WebDriver driver = new ChromeDriver();
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
	driver.get("https://www.google.com/doodles");
	JavascriptExecutor jse = (JavascriptExecutor)driver;
	for (; ; ) {
		try {
			WebElement fathersDay = driver.findElement(By.xpath("//a[@title=\"Father's Day 2023 (Jun 11)\"]"));
			fathersDay.click();
			break;
		} catch (NoSuchElementException e) {
			jse.executeScript("window.scrollBy(0,500)");
		}
	}
}
}
