package frame;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class frameNonNested {
public static void main(String[] args) {
	WebDriver driver = new FirefoxDriver();
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
	driver.get("https://demo.automationtesting.in/Frames.html");
	driver.switchTo().frame("singleframe");
	WebElement textBox = driver.findElement(By.xpath("//input[@type='text']"));
	textBox.sendKeys("fdgafadhfg");
	driver.manage().window().minimize();
	driver.quit();
}
}
