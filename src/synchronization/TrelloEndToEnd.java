package synchronization;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class TrelloEndToEnd {
public static void main(String[] args) throws Throwable {
	WebDriver driver = new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("https:/trello.com");
	WebElement loginOption = driver.findElement(By.xpath("//a[@class='Buttonsstyles__Button-sc-1jwidxo-0 kTwZBr']"));
	loginOption.click();
	Thread.sleep(4000);
	String actualtrelloLoginUrl = driver.getCurrentUrl();
	if(actualtrelloLoginUrl.equals("https://trello.com/login")) {
	WebElement emailTextField = driver.findElement(By.id("user"));
	emailTextField.sendKeys("letsuccessmakesnoise@gmail.com");
	WebElement contonueButton = driver.findElement(By.id("login"));
	contonueButton.submit();
	Thread.sleep(4000);
	System.out.println("Pass: The actualtrelloLoginUrl as per expected");
	String actualLoginToContinuePageUrl = driver.getCurrentUrl();
	Thread.sleep(2000);
	if(actualLoginToContinuePageUrl.contains("https://id.atlassian.com/login?application=trello&continue")) {
	WebElement passwordTextField = driver.findElement(By.id("password"));
	passwordTextField.sendKeys("successisthekey");
	WebElement loginButton = driver.findElement(By.id("login-submit"));
	loginButton.submit();
	System.out.println("Pass: The actualLoginToContinuePageUrl as per expected");
	Thread.sleep(3000);
	String actualBoardsPageUrl = driver.getCurrentUrl();
	if(actualBoardsPageUrl.equals("https://trello.com/u/letsuccessmakesnoise/boards")) {
		WebElement profileIcon = driver.findElement(By.xpath("//span[@title='Navya (letsuccessmakesnoise)']"));
		Thread.sleep(2000);
		profileIcon.click();
		Thread.sleep(2000);
		WebElement LogoutOption = driver.findElement(By.xpath("//button[@data-testid='account-menu-logout']"));
		LogoutOption.click();
		Thread.sleep(2000);
		System.out.println("Pass: The actualBoardsPageUrl as per expected");
		String actualLogOutPageUrl = driver.getCurrentUrl();
		if(actualLogOutPageUrl.contains("https://id.atlassian.com/logout?continue=https")) {
			WebElement logoutButton = driver.findElement(By.id("logout-submit"));
			logoutButton.submit();
			Thread.sleep(2000);
			System.out.println("Pass: The actualLogOutPageUrl as per expected");
		}else {
			System.out.println("Fail: The actualLogOutPageUrl is not as per expected");
		}
	}else {
		System.out.println("Fail: The actualBoardsPageUrl is not as per expected");
	}
	}else {
		System.out.println("Fail: The actualLoginToContinuePageUrl is not as per expected");
	}
	}else {
		System.out.println("Fail: The actualtrelloLoginUrl is not as per expected");
	}
	driver.manage().window().minimize();
	driver.quit();
}
}
