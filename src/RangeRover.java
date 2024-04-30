import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class RangeRover {
public static void main(String[] args) throws InterruptedException {
	WebDriver driver = new ChromeDriver();
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
	driver.get("https://www.landrover.in/range-rover/index.html?utm_source=Google&utm_medium=CPC&utm_campaign=IN_Jul23_LR_PRD_XCL_SEM_DX&utm_content=Sitelink_Homepage_Always_On_Range_Rover&gclid=CjwKCAjww7KmBhAyEiwA5-PUSmtiGdc7VJ7ven3wOoZMnySro6g8pdfl3kk7k-RWDco9xoKtTde4kxoCPrsQAvD_BwE&gclsrc=aw.ds");
	WebElement vehicleSection = driver.findElement(By.xpath("//a/span[text()='VEHICLES']"));
	vehicleSection.click();
	Thread.sleep(2000);
	WebElement ele1 = driver.findElement(By.xpath("//a[@class='dxnav-vehicle-nav__item dxnav-vehicle-nav__item--active']//div[@class='dxnav-vehicle-nav__details']"));
	Actions actions = new Actions(driver);
	actions.moveToElement(ele1, 0, 0).pause(1000).moveToElement(ele1, 0, 56).pause(1000).moveToElement(ele1, 0, 112).pause(1000).moveToElement(ele1, 0, 168).pause(1000).moveToElement(ele1, 0, 256).pause(1000).moveToElement(ele1, 0, 312).pause(1000).moveToElement(ele1, 0, 368).pause(1000).moveToElement(ele1, 0, 424).pause(1000).moveToElement(ele1, 0, 0).pause(1000).moveToElement(ele1, 0, 624).build().perform();
}
}
