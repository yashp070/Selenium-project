import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class checkDropdown {
public static void main(String[] args) {
	WebDriver driver = new FirefoxDriver();
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
	driver.get("https://facebook.com/signup/");
	WebElement monthDropDown = driver.findElement(By.id("month"));
	Select monthSelect = new Select(monthDropDown);
	List<WebElement> allMonthOpt = monthSelect.getOptions();
	for (WebElement monthOpt : allMonthOpt) {
		String monthText = monthOpt.getText();
		System.out.println(monthText);
		monthSelect.selectByVisibleText(monthText);
		if (monthOpt.isSelected()) {
			System.out.println("the month options is getting selected");
		}else {
			System.out.println("the month options is not selected");
		}
	}
}
}
