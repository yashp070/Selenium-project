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

public class Scrtake {
public static void main(String[] args) throws IOException, Throwable {
	WebDriver driver = new ChromeDriver();
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(6));
	WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
	String timeStamp = LocalDateTime.now().toString().replace(':', '-');
	driver.get("https://www.facebook.com");
	TakesScreenshot ts = (TakesScreenshot)driver;
	File tempFile = ts.getScreenshotAs(OutputType.FILE);
	File permFile = new File("./errorshot/"+timeStamp+"fb.png");
	FileUtils.copyFile(tempFile, permFile);
	wait.until(ExpectedConditions.urlToBe("https://www.facebook.com/"));
	WebElement textFields = driver.findElement(By.id("email"));
	File tFile = textFields.getScreenshotAs(OutputType.FILE);
	File pFile = new File("./errorshot/"+timeStamp+"textfiled.png");
	FileUtils.copyFile(tFile, pFile);
	String systemPath = tFile.getAbsolutePath();
	System.out.println(systemPath);
	Thread.sleep(20000);
	//driver.manage().window().minimize();
	//driver.quit();
}
}
