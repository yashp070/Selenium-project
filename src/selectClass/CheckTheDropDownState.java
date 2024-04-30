package selectClass;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class CheckTheDropDownState {
public static void main(String[] args) {
	WebDriver driver = new ChromeDriver();
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
	driver.get("https://facebook.com/signup");
	WebElement dayDropdown = driver.findElement(By.id("day"));
	Select daySelect = new Select(dayDropdown);
	if (daySelect.isMultiple()) {
		System.out.println("The day drop down is Multi select drop down");
	}else {
		System.out.println("The day drop down is Sigle select drop down");
	}
	driver.manage().window().minimize();
	driver.quit();
}
}
