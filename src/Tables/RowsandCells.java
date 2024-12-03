package Tables;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class RowsandCells {

	public static void main(String[] args) {
		WebDriver wd;
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Admin\\Desktop\\Selenium Driver\\Chrome Driver\\Driver\\chromedriver-win64\\chromedriver.exe");
		
		wd = new ChromeDriver();
		
		wd.get("https://demo.guru99.com//test/web-table-element.php");
		
		wd.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
		
		WebElement table = wd.findElement(By.tagName("table"));
		
		System.out.println("Table Searched Successfully");
		
		// 1
		
		WebElement tableRow1 = table.findElement(By.xpath("//*[@id=\"leftcontainer\"]/table/tbody/tr[1]"));
		
		String rowtext = tableRow1.getText();
		
		// System.out.println("1.First Row Of Table:" +rowtext);
		
		WebElement CellsNeed = tableRow1.findElement(By.xpath("//*[@id=\"leftcontainer\"]/table/tbody/tr[1]/td[1]"));
		
		String valueneed = CellsNeed.getText();
		
		// System.out.println("1.Cells Value is :"+valueneed);
		
		System.out.println(valueneed + " "+":"+" "+rowtext);
		
		//2
		WebElement tableRow2 = table.findElement(By.xpath("//*[@id=\"leftcontainer\"]/table/tbody/tr[2]"));
		
		String rowtext2 = tableRow2.getText();
		
		// System.out.println("2.Second Row Of Table:"+rowtext2);
		
		WebElement CellsNeed2 = tableRow2.findElement(By.xpath("//*[@id=\"leftcontainer\"]/table/tbody/tr[2]/td[1]"));
		
		String Valueneed2 = CellsNeed2.getText();
		
		// System.out.println("2.Cells Value is :"+Valueneed2);
		
		System.out.println(Valueneed2 +" " + ":"+" "+rowtext2);
		
		
		
		//wd.close();		
		

	}

}
