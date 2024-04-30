package Locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class UsageOfLinkText {
public static void main(String[] args) {
	WebDriver driver = new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("https://www.facebook.com/");
	//WebElement forgottenPwdLinkText = driver.findElement(By.linkText("Forgotten password?"));
	//forgottenPwdLinkText.click();
	WebElement loginButton = driver.findElement(By.linkText("Log in"));
	loginButton.click();
}
}