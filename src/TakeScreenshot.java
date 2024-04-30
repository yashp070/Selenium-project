import java.io.File;
import java.io.IOException;
import java.time.Duration;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TakeScreenshot {
public static void main(String[] args) throws IOException {
	WebDriver driver = new ChromeDriver();
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
	driver.get("https://facebook.com/");
	TakesScreenshot ts = (TakesScreenshot)driver;
	File tempSS = ts.getScreenshotAs(OutputType.FILE);
	File permSS = new File("./errorshot/facebook.png");
	FileUtils.copyFile(tempSS, permSS);
}
}
