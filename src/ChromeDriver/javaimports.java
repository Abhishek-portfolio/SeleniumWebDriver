package ChromeDriver;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class javaimports {

    public static void main(String[] args) {
        
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\Admin\\Desktop\\Selenium Driver\\Chrome Driver\\Driver\\chromedriver-win64\\chromedriver.exe");
        
        WebDriver driver = new ChromeDriver();
        
        String baseUrl = "https://demo.guru99.com/test/login.html";
        
        driver.get(baseUrl);
        
        // 1st Person Login
        WebElement email = driver.findElement(By.id("email"));
        WebElement pass = driver.findElement(By.name("passwd"));
        WebElement login = driver.findElement(By.id("SubmitLogin"));
        
        email.sendKeys("Abhishek");
        pass.sendKeys("123");
        System.out.println("1st Person Login Successfully");
        login.click();
        
        
        driver.get(baseUrl);
        
        // 2nd Person Login
         email = driver.findElement(By.id("email")); 
         pass = driver.findElement(By.name("passwd"));
         login = driver.findElement(By.id("SubmitLogin"));
        
        email.sendKeys("Prince");
        pass.sendKeys("Abc");
        
        login.click();
        System.out.println("2nd Person Login Successfully");
        
        
        driver.get(baseUrl);
        
        // 3rd Person Login
        email = driver.findElement(By.id("email")); // Re-locate elements after page load
        pass = driver.findElement(By.name("passwd"));
        login = driver.findElement(By.id("SubmitLogin"));
        
        email.sendKeys("Akash");
        pass.sendKeys("123456789");
        System.out.println("3rd Person Login Successfully");
        
        
        login.click();

        
        driver.quit();
    }
}