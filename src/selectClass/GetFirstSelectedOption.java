package selectClass;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class GetFirstSelectedOption {
public static void main(String[] args) {
	WebDriver driver = new ChromeDriver();
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
	driver.get("https://www.facebook.com/signup");
	WebElement monthDropdown = driver.findElement(By.id("month"));
	Select monthSelect = new Select(monthDropdown);
	String defaultMonthOption = monthSelect.getFirstSelectedOption().getText();
	System.out.println("defaultMonthOption = "+defaultMonthOption);
	driver.manage().window().maximize();
	driver.quit();
}
}
