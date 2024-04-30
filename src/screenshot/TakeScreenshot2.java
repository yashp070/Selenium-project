package screenshot;

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


public class TakeScreenshot2 {
public static void main(String[] args) throws IOException {
	WebDriver driver = new ChromeDriver();
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
	String timeStamp = LocalDateTime.now().toString().replace(':', '-');
	driver.get("https://www.facebook.com/");
	TakesScreenshot ts = (TakesScreenshot)driver;
	File tempFile = ts.getScreenshotAs(OutputType.FILE);
	File permFile = new File("./errorshot/"+timeStamp+"facebook1.png");
	FileUtils.copyFile(tempFile, permFile);
	WebElement emailTextField = driver.findElement(By.id("email"));
	emailTextField.sendKeys("636536344");
	TakesScreenshot t = (TakesScreenshot)driver.findElement(By.id("email"));
	File tempF = t.getScreenshotAs(OutputType.FILE);
	File g = new File("./errorshot/"+timeStamp+"emailtextfield.png");
	FileUtils.copyFile(tempF, g);
	
}
}
