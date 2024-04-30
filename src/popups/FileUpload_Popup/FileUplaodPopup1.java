package popups.FileUpload_Popup;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class FileUplaodPopup1 {

	public static void main(String[] args) throws AWTException, Throwable {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		driver.get("https://demo.guru99.com/test/upload/");
		
		Thread.sleep(2000);
		WebElement UploadBox = driver.findElement(By.id("uploadfile_0"));
		Actions action = new Actions(driver);
		Thread.sleep(1000);
		action.moveToElement(UploadBox).click().perform();
		Thread.sleep(4000);
		Robot robot = new Robot();
		robot.keyPress(KeyEvent.VK_CONTROL);
		robot.keyPress(KeyEvent.VK_V);
		robot.keyRelease(KeyEvent.VK_CONTROL);
		robot.keyRelease(KeyEvent.VK_V);
		robot.delay(2000);
		robot.keyPress(KeyEvent.VK_TAB);
		robot.keyPress(KeyEvent.VK_TAB);
		robot.delay(2000);
		robot.keyPress(KeyEvent.VK_ENTER);
		robot.delay(2000);
		
		driver.findElement(By.id("terms")).click();
		
		robot.delay(2000);
		driver.findElement(By.id("submitbutton")).click();
		
		

	}
}
