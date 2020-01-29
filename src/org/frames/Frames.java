package org.frames;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Frames {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\desk\\eclipse-selenium\\Selenium\\Driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.get("http://demo.guru99.com/test/guru99home/");
		driver.switchTo().frame("a077aa5e");
		
		WebElement img = driver.findElement(By.xpath("//img[@src='Jmeter720.png']"));
		img.click();
	}

}
