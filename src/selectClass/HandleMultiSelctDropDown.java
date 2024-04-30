package selectClass;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class HandleMultiSelctDropDown {
public static void main(String[] args) throws Throwable {
	WebDriver driver = new FirefoxDriver();
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
	driver.get("C:\\Users\\jashobanta pradhan\\Desktop\\multiselect.html");
	WebElement carDropDown = driver.findElement(By.id("cars"));
	Select carSelect = new Select(carDropDown);
	Thread.sleep(1000);
	carSelect.selectByIndex(0);
	Thread.sleep(1000);
	carSelect.selectByIndex(1);
	Thread.sleep(1000);
	carSelect.selectByIndex(2);
	Thread.sleep(1000);
	carSelect.selectByIndex(3);
	
}
}
