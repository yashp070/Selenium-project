import java.io.File;
import java.io.IOException;
import java.time.Duration;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class TakeWebSS {
public static void main(String[] args) throws IOException {
	WebDriver driver = new ChromeDriver();
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(7));
	WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(5));
	driver.get("https://www.ajio.com/");
	TakesScreenshot ts = (TakesScreenshot)driver;
	File tempSS = ts.getScreenshotAs(OutputType.FILE);
	File permSS = new File("./errorshot/ajio.png");
	FileUtils.copyFile(tempSS, permSS);
	WebElement menSection = driver.findElement(By.xpath("//a[text()='MEN']"));
	menSection.click();
	wait.until(ExpectedConditions.urlToBe("https://www.ajio.com/shop/men"));
	WebElement subsection = driver.findElement(By.xpath("//div[22]//div[1]//div[1]//div[1]//div[1]//div[1]//div[1]//div[1]//div[1]//div[2]//div[1]//div[1]//a[2]"));
	subsection.click();
	wait.until(ExpectedConditions.urlToBe("https://www.ajio.com/s/up-to-70-percent-off-5105-48811"));
	WebElement trauser = driver.findElement(By.xpath("//div[text()='Straight Fit Flat-Front Trousers']"));
	trauser.click();
	wait.until(ExpectedConditions.urlContains("https://www.ajio.com/netplay-straigh"));
}
}
