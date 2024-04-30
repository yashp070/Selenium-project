package Locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class UsageOfPartialLinkText {
	public static void main(String[] args) {
        WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com/");
		//WebElement partialLinkTextForgottenPwd = driver.findElement(By.partialLinkText("Forgotten password"));
		//partialLinkTextForgottenPwd.click();
		WebElement forgottenPwdText = driver.findElement(By.linkText("Forgotten password"));
		forgottenPwdText.click();
	}
}