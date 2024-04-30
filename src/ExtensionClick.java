import java.io.File;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class ExtensionClick {
	public static void main(String[] args) {
		ChromeOptions opt = new ChromeOptions();
		opt.addExtensions(new File("./Extension/SelectorsHub.crx"));
		WebDriver driver = new ChromeDriver();
		driver.get("https://google.com/");
	}

}
