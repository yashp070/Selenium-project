package actionsClass;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class UseOfMoveToElementsAndPause {
public static void main(String[] args) throws InterruptedException {
	WebDriver driver = new ChromeDriver();
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
	driver.get("https://www.myntra.com/");
	WebElement menSection = driver.findElement(By.xpath("//div[@class='desktop-navLink']/a[text()='Men']"));
	WebElement WomenSection = driver.findElement(By.xpath("//div[@class='desktop-navLink']/a[text()='Women']"));
	WebElement KidsSection = driver.findElement(By.xpath("//div[@class='desktop-navLink']/a[text()='Kids']"));
	WebElement HomeAndLivingSection = driver.findElement(By.xpath("//div[@class='desktop-navLink']/a[text()='Home & Living']"));
	WebElement BeautySection = driver.findElement(By.xpath("//div[@class='desktop-navLink']/a[text()='Beauty']"));
	WebElement StudioSection = driver.findElement(By.xpath("//div[@class='desktop-navLink']/a[text()='Studio']"));
	Actions actions = new Actions(driver);
	//actions.moveToElement(menSection).pause(2000).moveToElement(WomenSection).pause(2000).moveToElement(KidsSection).pause(2000).moveToElement(HomeAndLivingSection).pause(2000).moveToElement(BeautySection).pause(2000).moveToElement(StudioSection).pause(2000).perform();
	//actions.moveToElement(menSection, 0, 0).pause(1000).moveToElement(menSection, 75, 0).pause(1000).moveToElement(WomenSection, 76, 0).pause(1000).moveToElement(KidsSection, 99, 0).pause(1000).moveToElement(HomeAndLivingSection, 108, 0).pause(1000).moveToElement(BeautySection, 84, 0).perform();
	//actions.moveToElement(menSection, 0, 0).pause(1000).moveToElement(menSection, 75, 0).pause(1000).moveToElement(menSection, 150, 0).pause(1000).moveToElement(menSection, 248, 0).pause(1000).moveToElement(menSection, 356, 0).pause(1000).moveToElement(menSection, 440, 0).perform();
	//actions.moveToElement(menSection).pause(1000).moveToElement(WomenSection).pause(1000).moveToElement(KidsSection).pause(1000).moveToElement(HomeAndLivingSection).pause(1000).moveToElement(BeautySection).pause(1000).moveToElement(StudioSection).pause(1000).moveToElement(BeautySection).pause(1000).moveToElement(HomeAndLivingSection).pause(1000).moveToElement(KidsSection).pause(1000).moveToElement(WomenSection).pause(1000).moveToElement(menSection).perform();
	actions.moveToElement(menSection, 0, 0).pause(1000).moveToElement(menSection, 75, 0).pause(1000).moveToElement(WomenSection, 76, 0).pause(1000).moveToElement(KidsSection, 99, 0).pause(1000).moveToElement(HomeAndLivingSection, 108, 0).pause(1000).moveToElement(BeautySection, 84, 0).pause(1000)
	.moveToElement(StudioSection, -84, 0).pause(1000).moveToElement(BeautySection, -108, 0).pause(1000).moveToElement(HomeAndLivingSection, -99, 0).pause(1000).moveToElement(KidsSection, -76, 0).pause(1000).moveToElement(WomenSection, -75, 0).perform();
	Thread.sleep(4000);
	driver.manage().window().minimize();
	driver.quit();
}
}
