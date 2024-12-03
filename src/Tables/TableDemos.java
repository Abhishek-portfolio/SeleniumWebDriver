package Tables;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
public class TableDemos {

	public static void main(String[] args) {
		
		WebDriver wd;
		
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Admin\\Desktop\\Selenium Driver\\Chrome Driver\\Driver\\chromedriver-win64\\chromedriver.exe");		
		wd = new ChromeDriver();
		
		wd.get("https://demo.guru99.com//test/web-table-element.php");
		
		List<WebElement> Column = wd.findElements(By.xpath("//*[@id=\"leftcontainer\"]/table/thead/tr"));
		
		System.out.println("Number of Column =" +Column.size());
		
		List<WebElement> Rows = wd.findElements(By.xpath("//*[@id=\"leftcontainer\"]/table/tbody/tr[1]"));
		
		System.out.println("Number of Rows =" +Rows.size());
		
		wd.close();		
	}

}
