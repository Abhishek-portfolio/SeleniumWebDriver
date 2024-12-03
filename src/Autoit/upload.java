package Autoit;

import java.io.IOException;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class upload {

	public static void main(String[] args) throws InterruptedException, IOException {
		
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Admin\\Desktop\\Selenium Driver\\Chrome Driver\\Driver\\chromedriver-win64\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.ilovepdf.com/pdf_to_word");
		driver.manage().window().maximize();
		
		driver.findElement(By.id("pickfiles"));
		
		Thread.sleep(3000);
		
		Runtime.getRuntime().exec("C:\\Users\\Admin\\Desktop\\Selenium Driver\\Autoit");
		
	}

}
