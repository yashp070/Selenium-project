package popups.JavaScript_Popups;

import java.time.Duration;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class AlertPopup {
public static void main(String[] args) throws Throwable {
	WebDriver driver = new FirefoxDriver();
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
	driver.get("C:\\Users\\jashobanta pradhan\\Desktop\\jsepopup1.html");
	Thread.sleep(3000);
	String alertText = driver.switchTo().alert().getText();
	System.out.println("alertText = "+alertText);
	driver.switchTo().alert().accept();
}
}
