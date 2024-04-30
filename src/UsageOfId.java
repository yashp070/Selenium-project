import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class UsageOfId {
public static void main(String[] args) throws Throwable {
	WebDriver driver = new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("https://www.youtube.com/");
	Thread.sleep(5000);
	WebElement electronicsModule = driver.findElement(By.xpath("//yt-chip-cloud-chip-renderer[3]//yt-formatted-string[1]"));
	Thread.sleep(5000);
	electronicsModule.click();
	driver.manage().window().minimize();
	driver.quit();
}
}
