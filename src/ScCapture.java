import java.io.File;
import java.io.IOException;
import java.time.Duration;
import java.time.LocalDateTime;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ScCapture {
public static void main(String[] args) throws IOException {
	WebDriver driver = new ChromeDriver();
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
	String timeStamp = LocalDateTime.now().toString().replace(':', '-');
	driver.get("https://www.youtube.com/");
	wait.until(ExpectedConditions.urlToBe("https://www.youtube.com/"));
	TakesScreenshot ts = (TakesScreenshot)driver;
	File tempFile = ts.getScreenshotAs(OutputType.FILE);
	File permFile = new File("./errorshot/"+timeStamp+"youtube.png");
	FileUtils.copyFile(tempFile, permFile);
	WebElement searchBox = driver.findElement(By.name("search_query"));
	searchBox.sendKeys("hjsgfjh");
	TakesScreenshot ss = (TakesScreenshot)searchBox;
	File TempSc = ss.getScreenshotAs(OutputType.FILE);
	File permSc = new File("./errorshot/"+timeStamp+"search.png");
	FileUtils.copyFile(TempSc, permSc);
	driver.manage().window().minimize();
	driver.quit();
	
	
}
}
