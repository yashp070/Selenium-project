import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class UseOfIndexAndParentFrame {
public static void main(String[] args) {
	WebDriver driver = new ChromeDriver();
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
	driver.get("https://www.w3schools.com/sql/default.asp");
	WebElement oneFrame = driver.findElement(By.xpath("//div[@id='google_ads_iframe_/22152718,16833175/sws-hb//w3schools.com//wide_skyscraper_0__container__']"));
	driver.switchTo().frame(oneFrame);
	String oneFrameText = driver.findElement(By.xpath("//div/a[@class='ns-51add-e-9']")).getText();
	System.out.println("oneFrameText = " +oneFrameText);
	driver.switchTo().defaultContent();
	String outerText = driver.findElement(By.xpath("//div[@class='w3-panel w3-info intro']/p[1]")).getText();
	System.out.println("outerText = " +outerText);
	driver.manage().window().minimize();
	driver.quit();
	
}
}
