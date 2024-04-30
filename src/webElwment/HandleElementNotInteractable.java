package webElwment;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandleElementNotInteractable {
	public static void main(String[] args) throws Throwable {
		// ElementNotInteractable --- runtime --- unchecked --- selenium
		// when the element is not there in the webpage
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.myntra.com/");
		Thread.sleep(5000);
		WebElement tshirtOption = driver.findElement(By.xpath(".desktop-categoryLink[href='/men-tshirts']"));
		tshirtOption.click();
		driver.manage().window().minimize();
		driver.quit();
	}

}
