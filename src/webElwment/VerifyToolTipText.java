package webElwment;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class VerifyToolTipText {
public static void main(String[] args) {
	WebDriver driver = new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("https://www.flipkart.com/");
	WebElement titleText = driver.findElement(By.xpath("//img[@title='Flipkart']"));
	String titleOfTitletext = titleText.getAttribute("title");
	System.out.println("titleOfTitletext = "+ titleOfTitletext);
	driver.manage().window().minimize();
	driver.quit();
}
}
