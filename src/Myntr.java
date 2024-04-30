import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Myntr {
public static void main(String[] args) throws Throwable {
	WebDriver driver = new ChromeDriver();
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
	driver.get("https://www.myntra.com/");
	Thread.sleep(5000);
	Actions ac = new Actions(driver);
	WebElement men = driver.findElement(By.xpath("//div[@class='desktop-navLink']/a[text()='Men']"));
	ac.moveToElement(men).perform();
	WebElement tshirt = driver.findElement(By.xpath("//li[@class='desktop-oddColumnContent']/ul/li/a[@href='/men-tshirts']"));
	tshirt.click();
	//WebElement shirt = driver.findElement(By.xpath("//li[text()='Shirts Men Formal']"));
	//shirt.click();
	
	
	
}
}
