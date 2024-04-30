package Locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class NotToGoForId {
	// When not to go
	
	// When id is dynamic
	// when id attribute is not there
	// when id attribute is lengthy
	// id attribute will never be duplicate
	// but id attribute will be dynamic
	// if the address is miss match
	// NoSuchElementException----run--unchecked---sel
	
	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com/");
		WebElement loginButton=driver.findElement(By.id("u_0_9_Ks"));
		loginButton.click();
		
	}
     
}
