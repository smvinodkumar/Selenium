package org.Sample.WindowsHandling;

import java.io.File;
import java.io.IOException;
import java.util.*;
import java.util.Set;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Employee {
	public static void main(String[] args) throws InterruptedException, IOException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\desk\\eclipse-selenium\\Selenium\\Driver\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.flipkart.com/");
		driver.manage().window().maximize();
		
		WebElement f1 = driver.findElement(By.xpath("//button[@class='_2AkmmA _29YdH8']"));
		f1.click();
		WebElement sch = driver.findElement(By.xpath("//input[@class='LM6RPg']"));
		sch.sendKeys("iphonex");
		WebElement btn = driver.findElement(By.xpath("//button[@class='vh79eN']"));
		btn.click();
		Thread.sleep(5000);
		WebElement f2 = driver.findElement(By.xpath("//div[text()='Apple iPhone X (Silver, 64 GB)']"));
		f2.click();
		String parentid = driver.getWindowHandle();
		System.out.println(parentid);
		Set<String> allid = driver.getWindowHandles();
		System.out.println(allid);
		//for (String x : allid) {
		//	if (!parentid.equals(x)) {
		//		driver.switchTo().window(x);
		//	}
		//	}
		List<String> li = new ArrayList<>();
		li.addAll(allid);
		driver.switchTo().window(li.get(1));
		WebElement addcart = driver.findElement(By.xpath("//button[@class='_2AkmmA _2Npkh4 _2MWPVK']"));
		addcart.click();
		//to get screenshot
		TakesScreenshot tk = (TakesScreenshot)driver;
		File src = tk.getScreenshotAs(OutputType.FILE);
		File Dsc = new File("C:\\Users\\desk\\eclipse-selenium\\Selenium\\Screenshot\\cart.png");
		FileUtils.copyFile(src, Dsc);
		
		
		
	}

}
