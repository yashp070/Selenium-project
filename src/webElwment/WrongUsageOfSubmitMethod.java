package webElwment;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WrongUsageOfSubmitMethod {
	public static void main(String[] args) throws Throwable {
		//java.lang.UnsupportedOperationException --- java --- run --- unchecked
		//condition -> enclosed within the tag=  <form>
		//written within tag = <button> or <input>
		// type="submit"
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demo.actitime.com/login.do");
		Thread.sleep(2000);
		WebElement loginOption = driver.findElement(By.id("loginButton"));
		//loginOption.submit();
		loginOption.click();
		Thread.sleep(2000);
		driver.manage().window().minimize();
		driver.quit();
		
	}

}
