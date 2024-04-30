package selectClass;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class SelectBirthday {
public static void main(String[] args) throws Throwable {
	WebDriver driver = new ChromeDriver();
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
	driver.get("https://www.facebook.com/signup");
	Thread.sleep(2000);
	//day select
	WebElement dayDropDown = driver.findElement(By.id("day"));
	Select selectDay = new Select(dayDropDown);
	selectDay.selectByIndex(21);
	Thread.sleep(2000);
	//month select
	WebElement monthDropDown = driver.findElement(By.id("month"));
	Select selectMonth = new Select(monthDropDown);
	selectMonth.selectByValue("5");
	Thread.sleep(2000);
	//year select
	WebElement yearDropDown = driver.findElement(By.id("year"));
	Select selectYear = new Select(yearDropDown);
	selectYear.selectByVisibleText("1999");
	Thread.sleep(2000);
	driver.manage().window().maximize();
	driver.quit();
}
}
