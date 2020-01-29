package org.Sample;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

public class IEDLaunch {
	public static void main(String[] args) {
		System.setProperty("webdriver.ie.driver", "C:\\Users\\desk\\eclipse-selenium\\Selenium\\Driver\\IEDriverServer.exe");
		
		WebDriver driver = new InternetExplorerDriver ();
		driver.get("https://www.amazon.in");
		
		String ti = driver.getTitle();
		System.out.println(ti);
		String Url = driver.getCurrentUrl();
		System.out.println(Url);
				
				
		
	}

}
