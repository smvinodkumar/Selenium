package org.Webtable;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Table {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\desk\\eclipse-selenium\\Selenium\\Driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.toolsqa.com/automation-practice-table/");
		
		List<WebElement> tablerow = driver.findElements(By.tagName("tr"));
		
		//for rows
		for (int i = 0; i < tablerow.size(); i++) {
			WebElement r = tablerow.get(i);
			String row = r.getText();
			System.out.println(row);
			}
		//for table Data
		List<WebElement> tabledata = driver.findElements(By.tagName("td"));
		for (int j = 0; j < tabledata.size(); j++) {
			WebElement d = tabledata.get(j);
			String data = d.getText();
			if (data.equals("Dubai")) {
				System.out.println(data);
				
			}
		}
		
		
		
		
		
	}

}
