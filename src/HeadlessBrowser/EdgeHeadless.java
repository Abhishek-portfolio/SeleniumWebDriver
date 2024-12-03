package HeadlessBrowser;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.edge.EdgeOptions;


public class EdgeHeadless {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.edge.driver","C:\\Users\\Admin\\Desktop\\Selenium Driver\\Edge Driver\\msedgedriver.exe");
		
		EdgeOptions edgeoptions = new EdgeOptions();
		
		edgeoptions.addArguments("headless");
		
		WebDriver driver = new EdgeDriver(edgeoptions);
		
		driver.get("https://sites.google.com/view/seyondigitalmarketingservices/about?authuser=0");
		
		System.out.println("Title of the Page :"+driver.getTitle());
		
		System.out.println("URL of the Page :"+driver.getCurrentUrl());
		
		driver.close();
		
		
	}

}
