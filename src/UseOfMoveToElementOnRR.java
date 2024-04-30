import java.time.Duration;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class UseOfMoveToElementOnRR {
public static void main(String[] args) throws Throwable {
	WebDriver driver = new ChromeDriver();
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
	driver.get("https://www.landrover.in/range-rover/range-rover/index.html");
	WebElement vehiclesOption = driver.findElement(By.xpath("//span[text()='VEHICLES']"));
	WebElement purchaseOption = driver.findElement(By.xpath("//a/span[text()='PURCHASE']"));
	WebElement ownersOption = driver.findElement(By.xpath("//a/span[text()='OWNERS']"));
	WebElement xploreOption = driver.findElement(By.xpath("//li/a[@aria-label='EXPLORE LAND ROVER']/span[text()='EXPLORE']"));
	Actions actions = new Actions(driver);
	actions.moveToElement(vehiclesOption).pause(1000).moveToElement(purchaseOption).pause(1000).moveToElement(ownersOption).pause(1000).moveToElement(xploreOption).pause(1000).moveToElement(ownersOption).pause(1000).moveToElement(purchaseOption).pause(1000).moveToElement(vehiclesOption).perform();
	actions.click(vehiclesOption).perform();
	WebElement rangeRoverEvoque = driver.findElement(By.xpath("//div[@class='dxnav-vehicle-menu__categories']//p[contains(text(),'RANGE ROVER EVOQUE')]"));
	WebElement NEWRANGEROVERVELAR = driver.findElement(By.xpath("//div[@class='dxnav-vehicle-menu__categories']//p[contains(text(),'NEW RANGE ROVER VELAR')]"));
	WebElement RANGEROVERSPORT = driver.findElement(By.xpath("(//span[@class='dxnav-vehicle-nav__title']//p)[3]"));
	WebElement RANGEROVER = driver.findElement(By.xpath("//div[@id='NaasTabs_vehicle-dropdown_panel_0']/div[1]/div[1]/div[1]/div[1]/div[5]/div[1]/div[1]/div[1]/a[1]/div[1]/div[1]/span[1]/p[1]"));
	WebElement DEFENDER130 = driver.findElement(By.xpath("//div[@class='dxnav-vehicle-menu__categories']//p[contains(text(),'DEFENDER 130')]"));
	WebElement DEFENDER110 = driver.findElement(By.xpath("//div[@class='dxnav-vehicle-menu__categories']//p[contains(text(),'DEFENDER 110')]"));
	WebElement DEFENDER90 = driver.findElement(By.xpath("//div[@class='dxnav-vehicle-menu__categories']//p[contains(text(),'DEFENDER 90')]"));
	WebElement DISCOVERYSPORT = driver.findElement(By.xpath("(//p[contains(text(),'DISCOVERY SPORT')])[1]"));
	WebElement DISCOVERY = driver.findElement(By.xpath("(//p[contains(text(),'DISCOVERY')])[2]"));
	//actions.moveToElement(rangeRoverEvoque).pause(1000).moveToElement(NEWRANGEROVERVELAR).pause(1000).moveToElement(RANGEROVERSPORT).pause(1000).moveToElement(RANGEROVER).pause(1000).moveToElement(DEFENDER130).pause(1000).moveToElement(DEFENDER110).pause(1000).moveToElement(DEFENDER90).pause(1000).moveToElement(DISCOVERYSPORT).pause(1000).moveToElement(DISCOVERY).perform();
	actions.moveToElement(rangeRoverEvoque, 0, 0).pause(1000).moveToElement(rangeRoverEvoque, 0, 56).pause(1000).moveToElement(NEWRANGEROVERVELAR, 0, 56).pause(1000).moveToElement(RANGEROVERSPORT, 0, 56).pause(1000).moveToElement(RANGEROVER, 0, 88).pause(1000).moveToElement(DEFENDER130, 0, 56).pause(1000).moveToElement(DEFENDER110, 0, 56).pause(1000).moveToElement(DEFENDER90, 0, 88).pause(1000).moveToElement(DISCOVERYSPORT, 0, 56).build().perform();
	//actions.scrollToElement(DISCOVERYSPORT).perform();
	//actions.moveToElement(DEFENDER110, 0, 0).moveToElement(DEFENDER90, 0, 88).pause(1000).moveToElement(DISCOVERYSPORT, 0, 56).perform();
	//Thread.sleep(3000);
	//driver.manage().window().minimize();
	//driver.quit();
}
}
