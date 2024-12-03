package Upload;

import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;


public class uploading {
    public static void main(String[] args) {
    	
    	
    	System.setProperty("webdriver.chrome.driver","C:\\Users\\Admin\\Desktop\\Selenium Driver\\Chrome Driver\\Driver\\chromedriver-win64\\chromedriver.exe");    	
        String baseUrl = "https://demo.guru99.com/test/upload/";
        
        WebDriver driver = new ChromeDriver();
        driver.get(baseUrl);
        
        
        WebElement uploadElement = driver.findElement(By.id("uploadfile_0"));

        // enter the file path onto the file-selection input field
        uploadElement.sendKeys("C:\\Users\\Admin\\Desktop\\screenshot\\Test.docx");

        // check the "I accept the terms of service" check box
        driver.findElement(By.id("terms")).click();

        // click the "UploadFile" button
        driver.findElement(By.name("send")).click();
        
        System.out.println("File Uploaded Successfully");
        
        driver.close();
        }
}