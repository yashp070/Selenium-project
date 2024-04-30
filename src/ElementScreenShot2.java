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

public class ElementScreenShot2 {
public static void main(String[] args) throws IOException {
	WebDriver driver = new ChromeDriver();
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
	String timeStamp = LocalDateTime.now().toString().replace(':', '-');
	driver.get("https://www.amazon.com/");
	WebElement searchBox = driver.findElement(By.id("nav-search-bar-form"));
	TakesScreenshot ts = (TakesScreenshot)searchBox;
	File tempF = ts.getScreenshotAs(OutputType.FILE);
	File permF = new File("./errorshot/"+timeStamp+"searchbox.png");
	FileUtils.copyFile(tempF, permF);
	driver.manage().window().minimize();
	driver.quit();
}
}
