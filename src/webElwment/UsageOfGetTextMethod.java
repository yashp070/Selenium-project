package webElwment;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class UsageOfGetTextMethod {
	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demo.actitime.com/login.do");
		String expectedText = "Keep me logged in";
		System.out.println("expectedText = " +expectedText);
		WebElement emailTextField = driver.findElement(By.id("keepLoggedInLabel"));
		String actualText = emailTextField.getText();
		System.out.println("actualText =" +actualText);
		if (actualText.equals(expectedText)) {
			System.out.println("Pass: The tagText verified and found correct");
			
		}else {
			System.out.println("Fail: The tagText verified and found incorrect");
		}
		driver.manage().window().minimize();
		driver.quit();
	}

}
