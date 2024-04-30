package popups.JavaScript_Popups;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class PromptPopup {
public static void main(String[] args) throws Throwable {
	WebDriver driver = new FirefoxDriver();
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
	driver.get("C:\\Users\\jashobanta pradhan\\Desktop\\jsepopup3.html");
	Thread.sleep(2000);
	String promptText = driver.switchTo().alert().getText();
	System.out.println("promptText = "+promptText);
	driver.switchTo().alert().accept();
}
}
