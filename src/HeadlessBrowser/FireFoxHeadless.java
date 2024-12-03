package HeadlessBrowser;

import org.openqa.selenium.firefox.FirefoxOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.WebDriver;


public class FireFoxHeadless {

	public static void main(String[] args) {
		System.setProperty("webdriver.gecko.driver", "C:\\Users\\Admin\\Desktop\\Selenium Driver\\Chrome Driver\\Driver\\chromedriver-win64\\chromedriver.exe");
		
		FirefoxOptions options = new FirefoxOptions();
		
		options.addArguments("-headless");
		
		WebDriver driver = new FirefoxDriver(options);
		
		driver.get("https://sites.google.com/view/seyondigitalmarketingservices/home");
		
		System.out.println("Page Title:"+driver.getTitle());
		
		System.out.println("Page URL:"+driver.getCurrentUrl());
		
	}

}
