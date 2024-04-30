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

public class TakeElementScreenshot {
public static void main(String[] args) throws IOException {
WebDriver driver = new ChromeDriver();
driver.manage().window().maximize();
driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
String timeStamp = LocalDateTime.now().toString().replace(':', '-');
driver.get("https://www.flipkart.com/");
WebElement fashionimg = driver.findElement(By.xpath("//img[@alt='Fashion']"));
TakesScreenshot ts = (TakesScreenshot)fashionimg;
File tempFile = ts.getScreenshotAs(OutputType.FILE);
File permFile = new File("./errorshot/"+timeStamp+"fashionimg.png");
FileUtils.copyFile(tempFile, permFile);
}	
}
