package webElwment;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class UsageOfIsSelectedMethod {
	public static void main(String[] args) throws Throwable {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demo.actitime.com/login.do");
		Thread.sleep(2000);
		WebElement keepLoggedInCheckBox = driver.findElement(By.id("keepLoggedInCheckBox"));
		if(keepLoggedInCheckBox.isSelected()) {
			System.out.println("Method: True");
			System.out.println("Appln: False the keepLoggedInCheckBox should be in the selected format.");
			keepLoggedInCheckBox.click();
		}else {
			System.out.println("Method: False");
			System.out.println("Appln: True: the keepLoggedInCheckBox should not be in the selected format.");
			keepLoggedInCheckBox.click();
			Thread.sleep(2000);
		}
		driver.manage().window().minimize();
		driver.quit();
	}

}
