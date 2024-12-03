package ChromeDriver;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class Facebook {

    public static void main(String[] args) {
        
        // Set the path for the ChromeDriver
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\Admin\\Desktop\\Selenium Driver\\Chrome Driver\\chromedriver-win64\\chromedriver.exe");
        
        // Set Chrome options to disable notifications
        ChromeOptions options = new ChromeOptions();
        options.addArguments("--disable-notifications"); // Disable notifications
        
        WebDriver driver = new ChromeDriver(options);
        
        String URL ="https://www.facebook.com/";
        
        driver.get(URL);
        
        // Login with first set of credentials
        driver.findElement(By.id("email")).sendKeys("seyondigitalmarketingservices@gmail.com");
        driver.findElement(By.name("pass")).sendKeys("Abhishek@1223");
        driver.findElement(By.name("login")).click();
        driver.findElement(By.name("login")).click();
        
        System.out.println("Valid Credentials Login to Home Page");

        // Navigate back to Facebook login page for second login attempt
        driver.get(URL);
        
        // Login with second set of credentials
        driver.findElement(By.id("email")).sendKeys("Abhishek");
        driver.findElement(By.name("pass")).sendKeys("69"); // Incorrect password
        driver.findElement(By.name("login")).click();
        
        System.out.println("User Name & Password is incorrect");

        // Close the driver after all operations
        driver.quit();
    }
}