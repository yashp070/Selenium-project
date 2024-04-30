package webElwment;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class OneMoreForValueAttribute {
	public static void main(String[] args) throws Throwable {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demo.actitime.com/login.do");
		Thread.sleep(2000);
		WebElement userNameTextField = driver.findElement(By.id("username"));
		String valueOfUsernameTextField = userNameTextField.getAttribute("value");
		if(valueOfUsernameTextField.isEmpty()) {
			System.out.println("according to method : True ----- the data should not be present");
			System.out.println("according to the customer req: the data should not be present");
			userNameTextField.sendKeys("admin");
			Thread.sleep(2000);
		}else {
			System.out.println("according to method: False ---- The data should be present");
			Thread.sleep(2000);
			System.out.println("according to the customer req: the data should not be present");
			userNameTextField.clear();
			Thread.sleep(2000);
			userNameTextField.sendKeys("ADMIN");
			Thread.sleep(2000);
			
		}
		driver.manage().window().minimize();
		driver.quit();
	}

}
