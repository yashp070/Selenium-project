package practice_of_selenium;


import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class SopraBanking {
	public static void main(String[] args) throws Throwable {
	WebDriver driver = new ChromeDriver();
	driver.manage().window().maximize();
	WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(5));
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	driver.get("https://www.soprabanking.com/");
	Thread.sleep(10000);
	WebElement popup = driver.findElement(By.xpath("//button[text()='Allow all cookies']"));
	System.out.println(popup.isEnabled());
	popup.click();
	driver.findElement(By.xpath("//button[@type='button']//span")).click();
	WebElement banking = driver.findElement(By.xpath("//span[text()='Banking']"));
	wait.until(ExpectedConditions.elementToBeClickable(banking));
	banking.click();
	driver.findElement(By.xpath("(//span[@class='title'])[2]")).click();
	WebElement openBanking = driver.findElement(By.xpath("(//span[@class='title gradient-text'])[3]"));
	wait.until(ExpectedConditions.elementToBeClickable(openBanking));
	openBanking.click();
	//driver.manage().window().minimize();
	//driver.quit();

	}
}
