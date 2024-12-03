package Alert;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.Alert;

public class AlertDemo {

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Admin\\Desktop\\Selenium Driver\\Chrome Driver\\Driver\\chromedriver-win64\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		driver.get("https://demo.guru99.com//test/delete_customer.php");
		
		driver.findElement(By.name("cusid")).sendKeys("Abhishek");
		driver.findElement(By.name("submit")).submit();
		
		Alert alert = driver.switchTo().alert();
		
		driver.switchTo().alert().getText();
		
		 String alertMessage = alert.getText();
		
		System.out.println(alertMessage);
		
		Thread.sleep(5000);
		
		alert.accept();

	}

}
