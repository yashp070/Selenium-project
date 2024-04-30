
import java.io.File;

import org.openqa.selenium.By;
import org.openqa.selenium.ElementClickInterceptedException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class PracticeFrame {
	public static void main(String[] args) throws Throwable, ElementClickInterceptedException {
		ChromeOptions opt = new ChromeOptions();
		opt.addExtensions(new File("./Extension/SelectorsHub.crx"),new File("./Extension/Ruto - XPath Finder.crx"),new File("./Extension/TestCase Studio.crx"));
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com/");
		Thread.sleep(2000);
		WebElement emailTextField = driver.findElement(By.id("email"));
		emailTextField.clear();
		emailTextField.sendKeys("9114122486");
		WebElement passwordTextField = driver.findElement(By.id("pass"));
		passwordTextField.clear();
		passwordTextField.sendKeys("Yashraj1@");
		WebElement loginButton = driver.findElement(By.name("login"));
		loginButton.submit();
		Thread.sleep(2000);
		WebElement myAccountOption = driver.findElement(By.xpath("//div[@class='x6s0dn4 x1q0q8m5 x1qhh985 xu3j5b3 xcfux6l x14yjl9h xudhj91 x18nykt9 xww2gxu x26u7qi xm0m39n x13fuv20 x972fbf x9f619 x78zum5 xdt5ytf x1iyjqo2 xs83m0k xl56j7k xat24cr x11i5rnm x1mh8g0r xdj266r x2lwn1j xeuugli x6ikm8r x10wlt62 x18d9i69 x4uap5 xkhd6sd xexx8yu x1n2onr6 x1ja2u2z']//*[name()='svg']"));
		myAccountOption.click();
		Thread.sleep(4000);
		WebElement logOutOption = driver.findElement(By.xpath("//span[normalize-space()='Log out']"));
		Thread.sleep(2000);
		logOutOption.click();
		Thread.sleep(2000);
		WebElement loginToAnotherAccount = driver.findElement(By.name("login"));
		loginToAnotherAccount.submit();
		Thread.sleep(2000);
		WebElement mailTextField = driver.findElement(By.id("email"));
		mailTextField.clear();
		mailTextField.sendKeys("35454545453");
		WebElement ipasswordTextField = driver.findElement(By.id("pass"));
		ipasswordTextField.clear();
		ipasswordTextField.sendKeys("djhfjkd");
		Thread.sleep(2000);
		WebElement aloginButton = driver.findElement(By.name("login"));
		aloginButton.submit();
		Thread.sleep(2000);
		WebElement gmailTextField = driver.findElement(By.id("email"));
		gmailTextField.clear();
		gmailTextField.sendKeys("9487585743");
		WebElement jpasswordTextField = driver.findElement(By.id("pass"));
		jpasswordTextField.clear();
		jpasswordTextField.sendKeys("jskfnrb234");
		Thread.sleep(2000);
		WebElement bloginButton = driver.findElement(By.name("login"));
		bloginButton.submit();
		Thread.sleep(2000);
		WebElement hmailTextField = driver.findElement(By.id("email"));
		hmailTextField.clear();
		hmailTextField.sendKeys("992126348362");
		WebElement kpasswordTextField = driver.findElement(By.id("pass"));
		kpasswordTextField.clear();
		kpasswordTextField.sendKeys("ksdhrtnt533");
		Thread.sleep(2000);
		WebElement cloginButton = driver.findElement(By.name("login"));
		cloginButton.submit();
		Thread.sleep(2000);
		driver.manage().window().minimize();
		driver.quit();
		
	}

}
