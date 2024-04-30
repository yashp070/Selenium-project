package activeElement;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandleAutoSuggestion {
public static void main(String[] args) {
	WebDriver driver = new ChromeDriver();
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
	driver.get("https://google.com/");
	driver.switchTo().activeElement().sendKeys("selenium");
	List<WebElement> autoSugg = driver.findElements(By.xpath("//div[@role='presentation']/ul/li"));
	for (WebElement sugg : autoSugg) {
		String suggText = sugg.getText();
		System.out.println("suggText = "+suggText);
		if (suggText.contains("tutorial")) {
			sugg.click();
			break;
		}
	}
}
}
