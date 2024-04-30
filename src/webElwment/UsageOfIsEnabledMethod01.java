package webElwment;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class UsageOfIsEnabledMethod01 {
	public static void main(String[] args) throws Throwable {
		WebDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://sandbox.abdm.gov.in/applications/cowin/Home/cowin_signup_form");
		WebElement submitOption = driver.findElement(By.name("submit"));
		if(submitOption.isEnabled()) {
			System.out.println("Method: True");
			System.out.println("Appln: False: The submitOption should be enabled");
			submitOption.click();
		}else {
			System.out.println("Method: False");
			System.out.println("Appln: True: The submitOption should not be enabled");
			WebElement acceptTermsofService = driver.findElement(By.xpath("//button[text()='Accept Terms of Service']"));
			acceptTermsofService.click();
			Thread.sleep(2000);
			WebElement acceptTermsofServiceCheckbox = driver.findElement(By.xpath("//input[@id='confbtn']"));
			acceptTermsofServiceCheckbox.click();
			Thread.sleep(2000);
			WebElement closeOption = driver.findElement(By.xpath("//button[text()='Close']"));
			closeOption.click();
			Thread.sleep(2000);
			submitOption.click();
		}
		driver.manage().window().minimize();
		driver.quit();
	}

}
