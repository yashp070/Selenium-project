package practice_of_selenium;

import java.io.File;
import java.io.IOException;
import java.time.Duration;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class AllMethodsUsed {
	public static void main(String[] args) throws IOException, Throwable {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		driver.get("https://doodles.google/search/");
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(15));;
		Thread.sleep(1000);
		JavascriptExecutor jse = (JavascriptExecutor)driver;
		jse.executeScript("window.scrollBy(0,300)");
		WebElement austriaNationalDay = driver.findElement(By.xpath("//p[normalize-space()='Austria National Day 2023']"));
		wait.until(ExpectedConditions.visibilityOf(austriaNationalDay));
		TakesScreenshot ts = (TakesScreenshot)driver;
		File temp = ts.getScreenshotAs(OutputType.FILE);
		File perm = new File("./errorshot/ts.png");
		FileUtils.copyFile(temp, perm);
		austriaNationalDay.click();
		
	}
}
