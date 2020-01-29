package org.Sample;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Company {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\desk\\eclipse-selenium\\Selenium\\Driver\\chromedriver.exe");
				
				WebDriver driver = new ChromeDriver();
				driver.get("http://demo.automationtesting.in/Alerts.html");
				
				WebElement confirm = driver.findElement(By.xpath("//a[text()='Alert with OK & Cancel ']"));
				confirm.click();
				WebElement click = driver.findElement(By.xpath("//button[@class='btn btn-primary']"));
				click.click();
				Alert a = driver.switchTo().alert();
				a.accept();
			}

}
