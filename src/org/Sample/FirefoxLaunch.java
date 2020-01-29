package org.Sample;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class FirefoxLaunch {
	public static void main(String[] args) {
		System.setProperty("webdriver.gecko.driver", "C:\\Users\\desk\\eclipse-selenium\\Selenium\\Driver\\geckodriver.exe");
		
		WebDriver driver = new FirefoxDriver();
		driver.get("https://www.amazon.in");
		
		String Url = driver.getCurrentUrl();
		System.out.println(Url);
	}

}
