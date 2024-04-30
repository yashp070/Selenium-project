package webElwment;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.Color;

public class VerifyTheColor {
	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com/");
		WebElement loginButton = driver.findElement(By.name("login"));
		String bgcolorOfLoginButton = loginButton.getCssValue("background-color");
		System.out.println("bgcolorOfLoginButton = "+ bgcolorOfLoginButton);
		String hexadecimalValue = Color.fromString(bgcolorOfLoginButton).asHex();
		System.err.println("hexadecimalValue = "+ hexadecimalValue);
driver.manage().window().minimize();
driver.quit();
}
}
