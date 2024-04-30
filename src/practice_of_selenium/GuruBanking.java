package practice_of_selenium;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class GuruBanking {
	
public static void main(String[] args) {
	String username;
	String password;
	WebDriver driver = new ChromeDriver();
	driver.manage().window().maximize();
	WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(5));
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
	driver.get("https://demo.guru99.com/");
	driver.findElement(By.name("emailid")).sendKeys("dansanasubhagya2626@gmail.com");
	driver.findElement(By.name("btnLogin")).click();
	username = driver.findElement(By.xpath("(//td[@align='center'])[3]")).getText();
	System.out.println("username = " +username);
	password = driver.findElement(By.xpath("//td[text()='Password :']/following-sibling::td")).getText();
	System.out.println("password = " +password);
	driver.findElement(By.linkText("Bank Project")).click();
	try {
		driver.switchTo().frame(8);
		driver.findElement(By.xpath("//div[@id='dismiss-button']//div//*[name()='svg']")).click();
		try {
			driver.findElement(By.xpath("//*[name()='path' and contains(@d,'M38 12.83L')]")).click();
		} catch (Exception e) {
			driver.findElement(By.xpath("//*[local-name()='svg' and @fill='#5F6368']/*[local-name()='path']")).click();
		}		
	} catch (Exception e) {
		// TODO: handle exception
	}
	WebElement UNTextField = driver.findElement(By.xpath("//input[@name='uid']"));
	wait.until(ExpectedConditions.visibilityOfAllElements(UNTextField));
	UNTextField.sendKeys(username);
	driver.findElement(By.xpath("//input[@name='password']")).sendKeys(password);
	driver.findElement(By.xpath("//input[@name='btnLogin']")).click();
	driver.findElement(By.linkText("New Customer")).click();
}
}
