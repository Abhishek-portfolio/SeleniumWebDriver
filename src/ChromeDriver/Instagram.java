package ChromeDriver;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Instagram {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Admin\\Desktop\\Selenium Driver\\Chrome Driver\\chromedriver-win64\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		String URL ="https://www.instagram.com/";
		
		driver.get(URL);
		
		//1st Person
		
		WebElement Email = driver.findElement(By.xpath("//*[@id=\"loginForm\"]/div/div[1]/div/label/input"));
		WebElement Pass = driver.findElement(By.name("password"));
		WebElement Login = driver.findElement(By.xpath("//*[@id=\"loginForm\"]/div/div[3]"));
		
		Email.sendKeys("_.abhi_.___");
		Pass.sendKeys("Abhishek@2312");
		Login.click();
		System.out.println("Valid Credential Login to Home Page");
		
//		driver.get(URL);
//		
//		//2nd Person
//		
//		Email = driver.findElement(By.xpath("//*[@id=\"loginForm\"]/div/div[1]/div/label/input"));
//		Pass = driver.findElement(By.name("password"));
//		Login = driver.findElement(By.xpath("//*[@id=\"loginForm\"]/div/div[3]"));
//		
//		Email.sendKeys("Abhishek");
//		Pass.sendKeys("987543210");
//		Login.click();
//		System.out.println("InValid Credential - Error Message Shows");
	}

}
