package popups.FileUpload_Popup;

import java.time.Duration;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FileUploadPopup {
public static void main(String[] args) {
	WebDriver driver = new ChromeDriver();
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
	driver.get("https://demo.guru99.com/test/upload/");
	WebElement uploadFileOption = driver.findElement(By.id("uploadfile_0"));
	uploadFileOption.sendKeys("C:\\Users\\jashobanta pradhan\\Documents\\CampaignScenerio.pdf");
	WebElement iATC = driver.findElement(By.id("terms"));
	iATC.click();
	WebElement submitoption = driver.findElement(By.id("submitbutton"));
	submitoption.click();
}
}
