package popups;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class HiddenDivisionPopup {
public static void main(String[] args) throws Throwable {
	WebDriver driver = new ChromeDriver();
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
	driver.get("https://www.flipkart.com/");
	Thread.sleep(3000);
	//Actions action = new Actions(driver);
	//action.click().perform();
	WebElement cacelOption = driver.findElement(By.xpath("//button[text()='✕']"));
	cacelOption.click();
}
}
