import java.io.File;
import java.io.IOException;
import java.time.Duration;
import java.time.LocalDateTime;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class SsTake {
public static void main(String[] args) throws IOException {
	WebDriver driver = new ChromeDriver();
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(6));
	String timeStamp = LocalDateTime.now().toString().replace(':', '-');
	driver.get("https://www.google.com");
	WebElement searchBox = driver.findElement(By.xpath("//div[@class='RNNXgb']"));
	File tempFile = searchBox.getScreenshotAs(OutputType.FILE);
	File permFile = new File("./errorshot/"+timeStamp+"googlesearch.png");
	FileUtils.copyFile(tempFile, permFile);
	driver.manage().window().minimize();
	driver.quit();
	
}
}
