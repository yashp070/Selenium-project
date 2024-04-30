package selectClass;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class CheckTheState {
public static void main(String[] args) {
	WebDriver driver = new FirefoxDriver();
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
	driver.get("C:\\Users\\jashobanta pradhan\\Desktop\\multiselect.html");
	WebElement carDropDown = driver.findElement(By.id("cars"));
	Select carSelect = new Select(carDropDown);
	if(carSelect.isMultiple()) {
		System.out.println("the dropdown is multi select");
		carSelect.selectByIndex(0);
		carSelect.selectByIndex(1);
		carSelect.selectByIndex(2);
		carSelect.selectByIndex(3);
		//carSelect.deselectByIndex(2);
		carSelect.deselectAll();
	}else {
		System.out.println("the dropdown is single select");
	}
}
}
