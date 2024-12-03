package ChromeDriver;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;


public class Google {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Admin\\Desktop\\Selenium Driver\\Chrome Driver\\chromedriver-win64\\chromedriver.exe");
		
		WebDriver Subject = new ChromeDriver();
		
		Subject.get("https://www.youtube.com/");
		
		Subject.findElement(By.name("search_query")).sendKeys("VjSidhuVlogs");
		
		Subject.findElement(By.name("search_query")).sendKeys(Keys.ENTER);
		
		
		
		// Subject.findElement(By.id("text")).click();
	}

}