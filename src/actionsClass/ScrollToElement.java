package actionsClass;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class ScrollToElement {
public static void main(String[] args){
	WebDriver driver = new ChromeDriver();
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
	driver.get("https://www.cowin.gov.in/");
	WebElement searchOption = driver.findElement(By.xpath("//button[text()='Search']"));
	Actions actions = new Actions(driver);
	actions.scrollToElement(searchOption).perform();
	//actions.scrollByAmount(0, 700).perform();
	
}
}
