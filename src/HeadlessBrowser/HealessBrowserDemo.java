package HeadlessBrowser;

import org.openqa.selenium.htmlunit.HtmlUnitDriver;

public class HealessBrowserDemo {

	public static void main(String[] args) {
		
		HtmlUnitDriver Driver = new HtmlUnitDriver();
		
		Driver.get("https://www.ilovepdf.com/pdf_to_word");
		
		System.out.println("Page Title:"+Driver.getTitle());
		
		System.out.println("Page URL:"+Driver.getCurrentUrl());

	}

}
