import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class ClickActions {
public static void main(String[] args) throws Throwable {
	WebDriver driver = new ChromeDriver();
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
	driver.get("https://www.google.com/");
	WebElement searchbox = driver.findElement(By.xpath("//div[@class='SDkEP']/div[@class='a4bIc']"));
	Actions actions = new Actions(driver);
	actions.sendKeys(searchbox, "facebook").perform();
	WebElement outside = driver.findElement(By.xpath("//div[@class='o3j99 LLD4me yr19Zb LS8OJ']"));
	actions.click(outside).perform();
	Thread.sleep(2000);
	WebElement searchBtn = driver.findElement(By.xpath("//div[@class='FPdoLc lJ9FBc']//input[@name='btnK']"));
	actions.click(searchBtn).perform();
	Thread.sleep(2000);
	driver.manage().window().minimize();
	driver.quit();
}
}
