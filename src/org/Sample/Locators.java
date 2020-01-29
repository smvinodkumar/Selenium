package org.Sample;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Locators {

	public static void main(String[] args) {
System.setProperty("webdriver.chrome.driver", "C:\\Users\\desk\\eclipse-selenium\\Selenium\\Driver\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.facebook.com/");
		
		WebElement txtuser = driver.findElement (By.id("email"));
		txtuser.sendKeys("8500624372");
		WebElement txtpass = driver.findElement (By.id("pass"));
		txtpass.sendKeys("12345");
		WebElement click = driver.findElement(By.id("loginbutton"));
		click.click();
	}

}
