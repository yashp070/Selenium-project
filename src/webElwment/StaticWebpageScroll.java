package webElwment;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class StaticWebpageScroll {
	public static void main(String[] args) throws Throwable {
		WebDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://sandbox.abdm.gov.in/applications/cowin/Home/cowin_signup_form");
		Thread.sleep(2000);
		WebElement atsButton = driver.findElement(By.xpath("//button[normalize-space()='Accept Terms of Service']"));
		atsButton.click();
		Thread.sleep(2000);
		WebElement cnfCheckBox = driver.findElement(By.xpath("//input[@id='confbtn']"));
		cnfCheckBox.click();
		Thread.sleep(2000);
		WebElement cnfButton = driver.findElement(By.xpath("//button[normalize-space()='Close']"));
		cnfButton.click();
		Thread.sleep(3000);
		WebElement mobileNumberTextField = driver.findElement(By.xpath("//input[@placeholder='Enter a valid Mobile Number']"));
		mobileNumberTextField.sendKeys("5645647657");
	}

}
