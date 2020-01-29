package org.Sample;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Debug {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\desk\\eclipse-selenium\\Selenium\\Driver\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		driver.get("https://adactin.com/HotelApp/");
		
		WebElement txtUser = driver.findElement (By.id("username"));
		txtUser.sendKeys("vinod@gmail.com");
		
		WebElement txtpass = driver.findElement (By.xpath("(//input[@name='password'])"));
		txtpass.sendKeys("smvinod123");

		WebElement btnlogin = driver.findElement(By.xpath("(//input[@class='login_button'])"));
		btnlogin.click();
	
	}

}
