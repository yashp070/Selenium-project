package frame;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class NestedFrameTest {
public static void main(String[] args) {
	WebDriver driver = new ChromeDriver();
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
	driver.get("https://demo.automationtesting.in/Frames.html");
	driver.findElement(By.linkText("Iframe with in an Iframe")).click();
	WebElement outerFrame = driver.findElement(By.xpath("//iframe[@src='MultipleFrames.html']"));
	driver.switchTo().frame(outerFrame);
	WebElement innerFrame = driver.findElement(By.xpath("//div[@class='iframe-container']/iframe"));
	driver.switchTo().frame(innerFrame);
	driver.findElement(By.xpath("//input[@type='text']")).sendKeys("sgdhf");
	driver.manage().window().minimize();
	driver.quit();
	
	
}
}
