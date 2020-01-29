package org.Select;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;


public class dropDown {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\desk\\eclipse-selenium\\Selenium\\Driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.facebook.com/");
		Thread.sleep(3000);
		WebElement day = driver.findElement(By.id("day"));
		Select s = new Select(day);
		s.selectByValue("24");
		WebElement month = driver.findElement(By.id("month"));
		Select s1 = new Select(month);
		Select s2 = new Select(month);
		Select s3 = new Select(month);

		
	}

}
