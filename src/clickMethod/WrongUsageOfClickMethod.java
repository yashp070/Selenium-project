package clickMethod;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WrongUsageOfClickMethod {
	public static void main(String[] args) throws Throwable {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.google.com/doodles#archive");
		Thread.sleep(2000);
		WebElement fatherDayDoodle = driver.findElement(By.linkText("Father's Day 2023 (Jun 23)"));
		fatherDayDoodle.click();
		Thread.sleep(2000);
		driver.navigate().back();
		Thread.sleep(2000);
		WebElement birthDayDoodle = driver.findElement(By.linkText("//a[@href='/doodles/hamed-gohars-115th-birthday']"));
		birthDayDoodle.click();
		driver.manage().window().minimize();
		driver.quit();
		
	}

}
