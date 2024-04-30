package selectClass;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class GetAllOptions {
public static void main(String[] args) {
	WebDriver driver = new FirefoxDriver();
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
	driver.get("https://www.facebook.com/signup");
	//Day
	WebElement dayDropDown = driver.findElement(By.id("day"));
	Select allDaySelect = new Select(dayDropDown);
	List<WebElement> allDayOptions = allDaySelect.getOptions();
	for (WebElement dayOpt : allDayOptions) {
		String dayoptText = dayOpt.getText();
		System.out.println(dayoptText);
		allDaySelect.selectByVisibleText(dayoptText);
		if(dayOpt.isSelected()) {
			System.out.println("the day options is getting selected");
		}else {
			System.out.println("the day options is not selected");
		}
	}
	//Month
	WebElement monthDropDown = driver.findElement(By.id("month"));
	Select monthSelect = new Select(monthDropDown);
	List<WebElement> allMonthOpt = monthSelect.getOptions();
	for (WebElement monthOpt : allMonthOpt) {
		String monthoptText = monthOpt.getText();
		System.out.println(monthoptText);
		monthSelect.selectByVisibleText(monthoptText);
		if(monthOpt.isSelected()) {
			System.out.println("the month options is getting selected");
		}else {
			System.out.println("the month options is not selected");
		}
	}
	//year
	//identify the element
	WebElement yearDropDown = driver.findElement(By.id("year"));
	Select yearSelect = new Select(yearDropDown);
	//it will store all the options in the form list
	List<WebElement> allYearOpt = yearSelect.getOptions();
	for (WebElement yearOpt : allYearOpt) {
		//which opt you have taken
		//that options tag text getText() will capture.
		String yearOptText = yearOpt.getText();
		System.out.println(yearOptText);
		// the option which you are printing the opt
		//you need to select in the drop down
		yearSelect.selectByVisibleText(yearOptText);
		//we are checking whatever the opts are getting selected or not
		if(yearOpt.isSelected()) {
			System.out.println("the year options is getting selected");
		}else {
			System.out.println("the year options is not selected");
		}
	}
	
}
}
