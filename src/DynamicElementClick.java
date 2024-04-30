import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class DynamicElementClick {
	
	public static void main(String[] args) {
		
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(4));
		
		driver.get("https://www.google.com/doodles");
		JavascriptExecutor jse = (JavascriptExecutor)driver;
		for(; ;) {
			try {
				WebElement clickOnMothersDay = driver.findElement(By.xpath("//div[@class='title']/../..//a[text()='Mother’s Day (May 07)']"));
				clickOnMothersDay.click();
				break;
			} catch (NoSuchElementException e) {
				jse.executeScript("window.scrollBy(0,500)");
			}
		}
	}

}
