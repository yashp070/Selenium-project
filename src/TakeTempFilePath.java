import java.io.File;
import java.time.Duration;
import java.time.LocalDateTime;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TakeTempFilePath {
public static void main(String[] args) throws Throwable {
	WebDriver driver = new ChromeDriver();
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
	String timeStamp = LocalDateTime.now().toString().replace(':', '-');
	driver.get("https://www.facebook.com");
	
	 TakesScreenshot ts = (TakesScreenshot)driver;
	File tempFile = ts.getScreenshotAs(OutputType.FILE);
	File permFile = new File("./errorshot/"+timeStamp+"ambuj.png");
	String tempPath = tempFile.getAbsolutePath();
	System.out.println(tempPath);
	Thread.sleep(30000);
	driver.manage().window().minimize();
	driver.quit();
}
}
