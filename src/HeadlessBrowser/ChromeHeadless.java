package HeadlessBrowser;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class ChromeHeadless {
	
	public static void main (String [] agrs) {
		
		System.setProperty("webdriver.chrome.driver", "C:\\\\Users\\\\Admin\\\\Desktop\\\\Selenium Driver\\\\Chrome Driver\\\\Driver\\\\chromedriver-win64\\\\chromedriver.exe");
		
		ChromeOptions Options = new ChromeOptions();
		
		Options.addArguments("--headless=new");
		
		WebDriver driver = new ChromeDriver(Options);
		
		driver.get("https://www.youtube.com/");
		
		String PageTitle = driver.getTitle();
		
		String PageURL = driver.getCurrentUrl();
		
		System.out.println("Page Title :"+PageTitle);
		
		System.out.println("Page URL :"+PageURL);
		
		
	}
	
}
