package org.Sample;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Vinod {
public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\desk\\eclipse-selenium\\Selenium\\Driver\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		driver.get("http://demo.guru99.com/test/drag_drop.html");
		
		WebElement src1 = driver.findElement(By.id("credit2"));
		WebElement des1 = driver.findElement(By.id("bank"));
		Actions acc1=new Actions(driver);
		acc1.dragAndDrop(src1, des1).perform();
		
		WebElement src2 = driver.findElement(By.id("fourth"));
		WebElement des2 = driver.findElement(By.id("amt7"));
		Actions acc2=new Actions(driver);
		acc2.dragAndDrop(src2, des2).perform();
		
		WebElement src3 = driver.findElement(By.id("credit1"));
		WebElement des3 = driver.findElement(By.id("loan"));
		Actions acc3=new Actions(driver);
		acc3.dragAndDrop(src3, des3).perform();
		
		WebElement src4 = driver.findElement(By.id("fourth"));
		WebElement des4 = driver.findElement(By.id("amt8"));
		Actions acc4=new Actions(driver);
		acc4.dragAndDrop(src4, des4).perform();
		
		WebElement txt= driver.findElement(By.xpath("//a[text()='Perfect!']"));
		String text = txt.getText();
		System.out.println(text);
		
		
	}
}
