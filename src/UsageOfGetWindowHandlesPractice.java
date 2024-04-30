import java.util.Set;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.chrome.ChromeDriver;

public class UsageOfGetWindowHandlesPractice {
public static void main(String[] args) throws Throwable {
	WebDriver driver = new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("https://www.wallpaperflare.com/gradient-abstract-hd-4k-5k-8k-blur-wallpaper-bdtlk");
	driver.switchTo().newWindow(WindowType.WINDOW);
	driver.get("https://chat.openai.com/");
	driver.switchTo().newWindow(WindowType.WINDOW);
	driver.get("https://petstore.swagger.io/");
	Set<String> allWindow = driver.getWindowHandles();
	for(String wid : allWindow) {
		String widTitle = driver.switchTo().window(wid).getTitle();
		System.out.println(widTitle);
		if(widTitle.equals("HD wallpaper: gradient, abstract, hd, 4k, 5k, 8k, blur | Wallpaper Flare")) {
			
		}
		else if (widTitle.equals("ChatGPT")) {
			
		}
		else if (widTitle.equals("Swagger UI")) {
			Dimension sizeOfWindow = driver.manage().window().getSize();
			int heightOFWindow = sizeOfWindow.getHeight();
			System.out.println(heightOFWindow);
			int widthOfWindow = sizeOfWindow.getWidth();
			System.out.println(widthOfWindow);
			Point positionOfWindow = driver.manage().window().getPosition();
			int startXOfWIndow = positionOfWindow.getX();
			System.out.println(startXOfWIndow);
			int startYWindow = positionOfWindow.getY();
			System.err.println(startYWindow);
			Dimension windowSize = new Dimension(400, 500);
			driver.manage().window().setSize(windowSize);
			Point windowPosition = new Point(40, 45);
			driver.manage().window().setPosition(windowPosition);
			Thread.sleep(2000);
			
		}
	}
	driver.manage().window().minimize();
	driver.quit();
}
}
