	import java.time.Duration;
import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
	import org.openqa.selenium.WebDriver;
	import org.openqa.selenium.WebElement;
//import org.openqa.selenium.WindowType;
import org.openqa.selenium.chrome.ChromeDriver;
	import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Myntra_end_to_end_test {

	public static void main(String[] args) throws Throwable {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(8));
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(7));
		driver.get("https://www.myntra.com/");
		
		Actions ac = new Actions(driver);
		WebElement men = driver.findElement(By.xpath("//div[@class='desktop-navLink']/a[text()='Men']"));
		ac.moveToElement(men).perform();
		WebElement tshirt = driver.findElement(By.xpath("//li[@class='desktop-oddColumnContent']/ul/li/a[@href='/men-tshirts']"));
		tshirt.click();
		wait.until(ExpectedConditions.urlToBe("https://www.myntra.com/men-tshirts"));
		WebElement roadsterTshirt = driver.findElement(By.xpath("//*[@id=\"desktopSearchResults\"]/div[2]/section/ul/li[6]/a"));
		roadsterTshirt.click();
		Set<String> windowIds = driver.getWindowHandles();
		Iterator<String> itr = windowIds.iterator();
		String parentId = itr.next();
		System.out.println(parentId);
		String childId = itr.next();
		System.out.println(childId);
		driver.switchTo().window(childId);
		//wait.until(ExpectedConditions.urlContains("https://www.myntra.com/tshirts/peter-england/peter-england-polo-collar-slim-fit-t-shirt/23033828/buy"));
		WebElement Size = driver.findElement(By.xpath("//p[text()='S']"));
		Size.click();
		WebElement addToBag = driver.findElement(By.xpath("//div[text()='ADD TO BAG']"));
		addToBag.click();
		WebElement goToBag = driver.findElement(By.xpath("//a[@href='/checkout/cart']/span[text()='GO TO BAG']"));
		goToBag.click();
		wait.until(ExpectedConditions.urlToBe("https://www.myntra.com/checkout/cart"));
		driver.manage().window().minimize();
		driver.quit();
		
	}
	

}
