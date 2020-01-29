package org.Sample;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Launch {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\desk\\eclipse-selenium\\Selenium\\Driver\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.facebook.com/");
		
		WebElement txtfrom = driver.findElement (By.xpath("(//input[@class='inputtext login_form_input_box'])[1]"));
		txtfrom.sendKeys("8500624372");
		
		WebElement txtto = driver.findElement (By.xpath("(//input[@data-testid='royal_pass'])"));
		txtto.sendKeys("12345");
		
		WebElement btnlogin = driver.findElement(By.xpath("(//input[@value='Log In'])"));
		btnlogin.click();
		
		
		
		
	}

}
