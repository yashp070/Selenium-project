package popups.JavaScript_Popups;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class ConfirmationPopups {
public static void main(String[] args) throws Throwable {
	WebDriver driver = new FirefoxDriver();
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
	driver.get("C:\\Users\\jashobanta pradhan\\Desktop\\jsepopup2.html");
	Thread.sleep(2000);
	String confText = driver.switchTo().alert().getText();
	System.out.println("confText = "+confText);
	driver.switchTo().alert().dismiss();
}
}
