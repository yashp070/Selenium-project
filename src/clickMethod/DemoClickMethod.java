package clickMethod;

import java.io.File;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class DemoClickMethod {
	public static void main(String[] args) throws Throwable {
		ChromeOptions opt = new ChromeOptions();
		opt.addExtensions(new File("./Extension/SelectorsHub.crx"),new File("./Extension/Ruto - XPath Finder.crx"),new File("./Extension/TestCase Studio.crx"));
		// ElementClickInterceptedException --- run ---unchecked --- sel
		// when abscured Element is present
		WebDriver driver = new ChromeDriver(opt);
		driver.manage().window().maximize();
		driver.get("https://www.amazon.com/International-Shipping-Direct/b?ie=UTF8&node=230659011");
		Thread.sleep(3000);
		WebElement dontChangeOption = driver.findElement(By.xpath("(//span[@class='a-button a-spacing-top-base a-button-base glow-toaster-button glow-toaster-button-dismiss'])[1]"));
		dontChangeOption.click();
		Thread.sleep(2000);
		WebElement customerServiceButton = driver.findElement(By.xpath("//div/a[text()='Customer Service']"));
		customerServiceButton.click();
		Thread.sleep(3000);
		driver.manage().window().minimize();
		driver.quit();
	}

}
