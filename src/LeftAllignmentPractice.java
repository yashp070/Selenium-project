import org.openqa.selenium.By;
import org.openqa.selenium.Rectangle;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LeftAllignmentPractice {
public static void main(String[] args) {
	// Pre-condition
	WebDriver driver = new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("https://vahan.parivahan.gov.in/npermit/");
	// All over India 
	WebElement allOverIndiaDropDown = driver.findElement(By.xpath("//body[1]/form[2]/div[2]/div[1]/div[2]/div[1]"));
	Rectangle allOverIndiaDropDownRect = allOverIndiaDropDown.getRect();
	int allOverIndiaStartX = allOverIndiaDropDownRect.getX();
	System.out.println("allOverIndiaStartX = " +allOverIndiaStartX);
	int allOverIndiaWidth = allOverIndiaDropDownRect.getWidth();
	System.out.println("allOverIndiaWidth = " +allOverIndiaWidth);
	int allOverIndiaEndX = allOverIndiaStartX+allOverIndiaWidth;
	System.out.println("allOverIndiaEndX = " +allOverIndiaEndX);
	//Till Yesterday
	WebElement tillYesterDayDropDown = driver.findElement(By.xpath("//body[1]/form[2]/div[2]/div[1]/div[3]/div[1]"));
	Rectangle tillYesterDayRect = tillYesterDayDropDown.getRect();
	int tillYesterDayStartX = tillYesterDayRect.getX();
	System.out.println("tillYesterDayStartX = " +tillYesterDayStartX);
	int tillYesterDayWidth = tillYesterDayRect.getWidth();
	System.out.println("tillYesterDayWidth = " +tillYesterDayWidth);
	int tillYesterDayEndY = tillYesterDayStartX+tillYesterDayWidth;
	System.out.println("tillYesterDayEndY = " +tillYesterDayEndY);
	// verification and validation
	if(allOverIndiaEndX==tillYesterDayEndY) {
		System.out.println("Pass: The Left allignment of allOverIndiaDropDown and tillYesterDayDropDown are verified and found correct.");
	}else {
		System.out.println("Fail: The Left allignment of allOverIndiaDropDown and tillYesterDayDropDown are verified and found incorrect.");
	}
	// Post-condition
	driver.manage().window().minimize();
	driver.quit();
}
}
