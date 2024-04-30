import java.io.File;
import java.io.IOException;
import java.time.Duration;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class FbAutomate {
public static void main(String[] args) throws IOException {
	WebDriver driver = new ChromeDriver();
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
	WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(5));
	TakesScreenshot ts = (TakesScreenshot)driver;
	File tempSS = ts.getScreenshotAs(OutputType.FILE);
	File permSS = new File("./errorshot/facebook.png");
	FileUtils.copyFile(tempSS, permSS);
	driver.get("https://www.facebook.com/login/");
	WebElement emailTextField = driver.findElement(By.id("email"));
	emailTextField.sendKeys("9114122486");
	WebElement passwordTextField = driver.findElement(By.id("pass"));
	passwordTextField.sendKeys("Yashraj1@");
	WebElement loginButton = driver.findElement(By.id("loginbutton"));
	loginButton.submit();
	wait.until(ExpectedConditions.urlToBe("https://www.facebook.com/"));
	WebElement accountsOption = driver.findElement(By.xpath("//*[name()='g' and contains(@mask,'url(#:Rd9d')]//*[name()='image' and contains(@x,'0')]"));
	accountsOption.click();
	WebElement logoutOption = driver.findElement(By.xpath("//div[@data-nocookies='true']//div[@role='button']//div[@class='x6s0dn4 x1q0q8m5 x1qhh985 xu3j5b3 xcfux6l x26u7qi xm0m39n x13fuv20 x972fbf x9f619 x78zum5 x1q0g3np x1iyjqo2 xs83m0k x1qughib xat24cr x11i5rnm x1mh8g0r xdj266r xeuugli x18d9i69 x1sxyh0 xurb0ha xexx8yu x1n2onr6 x1ja2u2z x1gg8mnh']//div[@class='x6s0dn4 xkh2ocl x1q0q8m5 x1qhh985 xu3j5b3 xcfux6l x26u7qi xm0m39n x13fuv20 x972fbf x9f619 x78zum5 x1q0g3np x1iyjqo2 xs83m0k x1qughib xat24cr x11i5rnm x1mh8g0r xdj266r x2lwn1j xeuugli x18d9i69 x4uap5 xkhd6sd xexx8yu x1n2onr6 x1ja2u2z']//div[@class='x1qjc9v5 x1q0q8m5 x1qhh985 xu3j5b3 xcfux6l x26u7qi xm0m39n x13fuv20 x972fbf x9f619 x78zum5 x1r8uery xdt5ytf x1iyjqo2 xs83m0k x1qughib xat24cr x11i5rnm x1mh8g0r xdj266r x2lwn1j xeuugli x4uap5 xkhd6sd xz9dl7a xsag5q8 x1n2onr6 x1ja2u2z']//div//div[@class='x78zum5 xdt5ytf xz62fqu x16ldp7u']"));
	logoutOption.click();
	driver.manage().window().minimize();
	driver.quit();
	
}
}
