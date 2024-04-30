import org.openqa.selenium.By;
import org.openqa.selenium.Rectangle;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class TopAllignment {
public static void main(String[] args) {
	// Pre-condition
	WebDriver driver = new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("https://vahan.parivahan.gov.in/npermit/");
	// All over India 
	WebElement allOverIndiaDropDown = driver.findElement(By.xpath("//body[1]/form[2]/div[2]/div[1]/div[2]/div[1]"));
	Rectangle allOverIndiaDropDownRect = allOverIndiaDropDown.getRect();
	int allOverIndiaStartY = allOverIndiaDropDownRect.getY();
	System.out.println("allOverIndiaStartY = " +allOverIndiaStartY);
	//Till Yesterday
	WebElement tillYesterDayDropDown = driver.findElement(By.xpath("//body[1]/form[2]/div[2]/div[1]/div[3]/div[1]"));
	Rectangle tillYesterDayRect = tillYesterDayDropDown.getRect();
	int tillYesterDayStartY = tillYesterDayRect.getY();
	System.out.println("tillYesterDayStartY = " +tillYesterDayStartY);
	// verification and validation
	if(allOverIndiaStartY==tillYesterDayStartY) {
		System.out.println("Pass: The top allignment of allOverIndiaDropDown and tillYesterDayDropDown are verified and found correct.");
	}else {
		System.out.println("Fail: The top allignment of allOverIndiaDropDown and tillYesterDayDropDown are verified and found incorrect.");
	}
	// Post-condition
	driver.manage().window().minimize();
	driver.quit();
}
}
