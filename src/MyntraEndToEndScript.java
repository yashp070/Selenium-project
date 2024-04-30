import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;



public class MyntraEndToEndScript {
public static void main(String[] args) throws Throwable {
	WebDriver driver = new ChromeDriver();
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
	WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
	driver.get("https://www.myntra.com/");
	Actions ac = new Actions(driver);
	WebElement accountOption = driver.findElement(By.xpath("//div[@class='desktop-userIconsContainer']"));
	ac.moveToElement(accountOption).perform();
	WebElement loginOption = driver.findElement(By.xpath("//a[text()='login / Signup']"));
	loginOption.click();
	wait.until(ExpectedConditions.urlToBe("https://www.myntra.com/login?referer=https://www.myntra.com/"));
	WebElement phoneNumberTextField = driver.findElement(By.xpath("//input[@type='tel']"));
	phoneNumberTextField.sendKeys("8249606399");
	WebElement continueOption = driver.findElement(By.xpath("//div[@class='submitBottomOption']"));
	continueOption.click();
	wait.until(ExpectedConditions.urlToBe("https://www.myntra.com/shop/men"));
	WebElement searchBox = driver.findElement(By.xpath("//input[@placeholder='Search for products, brands and more']"));
	searchBox.sendKeys("roadster shirt");
	WebElement searchOption = driver.findElement(By.xpath("//a[@class='desktop-submit']"));
	searchOption.click();
	wait.until(ExpectedConditions.urlToBe("https://www.myntra.com/roadster-shirt?rawQuery=roadster%20shirt"));
	WebElement shirtname = driver.findElement(By.xpath("//h4[normalize-space()='Slim Fit Arona Formal Shirt']"));
	shirtname.click();
	driver.switchTo().newWindow(WindowType.WINDOW);
	driver.get("https://www.myntra.com/shirts/roadster/roadster-men-arona-slim-fit-opaque-formal-shirt/14641382/buy");
	WebElement addToCart = driver.findElement(By.xpath("//body/div[@id='mountRoot']/div/div/main[@class='pdp-pdp-container']/div[@class='pdp-details common-clearfix']/div[@class='pdp-description-container']/div/div[2]/div[1]/div[1]"));
	addToCart.click();
	WebElement goToBag = driver.findElement(By.xpath("//a[contains(@class,'pdp-goToCart pdp-add-to-bag pdp-button pdp-flex pdp-center')]"));
	goToBag.click();
	wait.until(ExpectedConditions.urlToBe("https://www.myntra.com/checkout/cart"));
	WebElement placeOrder = driver.findElement(By.xpath("//div[contains(text(),'PLACE ORDER')]"));
	placeOrder.click();
	wait.until(ExpectedConditions.urlToBe("https://www.myntra.com/checkout/address#disableBack"));
	WebElement continuelink = driver.findElement(By.xpath("//div[@id='placeOrderButton']"));
	continuelink.click();
	
	
}
}
