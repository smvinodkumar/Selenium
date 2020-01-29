package org.Sample;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Employe {

	public static void main(String[] args) {
System.setProperty("webdriver.chrome.driver", "C:\\Users\\desk\\eclipse-selenium\\Selenium\\Driver\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		driver.get("http://demo.automationtesting.in/Alerts.html");
		
		WebElement Simple = driver.findElement(By.xpath("//button[@class='btn btn-danger']"));
		Simple.click();
		Alert a = driver.switchTo().alert();
		a.accept();
	}

}
