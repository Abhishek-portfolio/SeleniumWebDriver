package MouseAction;

import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.*;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.interactions.Action;

public class mouseaction {

	public static void main(String[] args) {
		String url = "https://demo.guru99.com/test/newtours";
		System.setProperty("webdriver.gecko.driver","C:\\Users\\Admin\\Desktop\\Selenium Driver\\FireFox Driver\\geckodriver.exe");
		
		WebDriver driver =new FirefoxDriver();
		
		driver.get(url);
		
		WebElement linkHome = driver.findElement(By.linkText("Home"));
		WebElement home = driver.findElement(By.xpath("/html/body/div[2]/table/tbody/tr/td[1]/table/tbody/tr/td/table/tbody/tr/td/table/tbody/tr[1]/td[2]"));
		
		Actions builder = new Actions(driver);
		Action MouseOverHome = builder.moveToElement(linkHome).build();
		
		String colour = home .getCssValue("background-color");
		System.out.println("Before Background Colour:"+colour);
			
		MouseOverHome.perform();
		
		colour =home.getCssValue("background-color");
		System.out.println("After Background Colour:"+colour);
		
		
		
	}

}
