package actionsClass;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class UseOfDragAndDrop {
public static void main(String[] args) throws InterruptedException {
	WebDriver driver = new ChromeDriver();
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
	driver.get("https://jqueryui.com/draggable/");
	JavascriptExecutor jse = (JavascriptExecutor)driver;
	jse.executeScript("window.scrollBy(0,300)");
	Thread.sleep(2000);
	driver.switchTo().frame(0);
	WebElement dragableElement = driver.findElement(By.id("draggable"));
	Actions actions = new Actions(driver);
	actions.dragAndDropBy(dragableElement, 300, 250).perform();
}
}
