package Sikulii;

import java.io.File;
import org.sikuli.script.*;
import java.io.File;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.sikuli.script.FindFailed;
import org.sikuli.script.Pattern;
import org.sikuli.script.Screen;


public class imagetest {

	public static void main(String[] args) throws FindFailed {
		
		Screen s = new Screen();
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Admin\\Desktop\\Selenium Driver\\Chrome Driver\\Driver\\chromedriver-win64\\chromedriver.exe");

		WebDriver driver;
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demo.guru99.com/test/image_upload/index.php");
		
		String basePath = System.getProperty("User.dir");
		String extPath = basePath+File.separator+"screenshot";
		System.out.println(extPath);
		
		ImagePath.setBundlePath(extPath);
		String path = ImagePath.getBundlePath();
		
		System.out.println("Destination Path :"+path);
		s.find("OpenButton.png");
		s.click("OpenButton.png");
		
		Pattern fileInput = new Pattern(extPath +"\\"+"FileTextBox.png");
		//Pattern openButton = new Pattern(extPath + "\\" +"OpenButton.png");
		
		s.wait(fileInput, 20);
		s.type(fileInput,extPath + "\\" +"Test.docx");
		s.find("OpenButton.png");
		
		
		
		
		

	}

}
