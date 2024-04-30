import java.io.File;
import java.time.Duration;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class DynamicScrollNClink {
	public static void main(String[] args) throws Throwable {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(2));
		driver.get("https://www.google.com/doodles");
		JavascriptExecutor jse = (JavascriptExecutor)driver;
		for ( ; ; ) {
			try {
				WebElement naiheriaIndependenceday = driver.findElement(By.xpath("//ul[@id='archive-list']/li[257]/div[1]"));
				TakesScreenshot ts = (TakesScreenshot)naiheriaIndependenceday;
				File tempFile = ts.getScreenshotAs(OutputType.FILE);
				File permFile = new File("./errorshot/naiheriaIndependenceday.png");
				FileUtils.copyFile(tempFile, permFile);
				break;
			} catch (NoSuchElementException e) {
				jse.executeScript("window.scrollBy(0,400)");
			}
		}
		driver.manage().window().minimize();
		driver.quit();
}
}
