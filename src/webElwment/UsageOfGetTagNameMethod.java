package webElwment;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class UsageOfGetTagNameMethod {
	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com/");
		String expectedTagName = "input";
		System.out.println("expectedTagName = " +expectedTagName);
		WebElement passwordTextField = driver.findElement(By.xpath("//input[@id='pass']"));
		String actualTagName = passwordTextField.getTagName();
		System.out.println("actualTagName = " + actualTagName);
		if(actualTagName.equals(expectedTagName)) {
			System.out.println("Pass: expectedTagName and ActualTagName is verified and found correct");
		}else {
			System.out.println("Fail: expectedTagName and ActualTagName is verified and found incorrect");
		}
		driver.manage().window().minimize();
		driver.quit();
	}

}
