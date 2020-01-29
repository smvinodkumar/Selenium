package org.Sample;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Scshot {
	public static void main(String[] args) throws IOException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\desk\\eclipse-selenium\\Selenium\\Driver\\chromedriver.exe");
		
		
		WebDriver driver = new ChromeDriver();
		driver.get("https://snapdeal.com/");
		driver.manage().window().maximize();
		
		//type cast
		TakesScreenshot tk = (TakesScreenshot)driver;
		File src = tk.getScreenshotAs(OutputType.FILE);
		System.out.println(src);
		File desc = new File("C:\\Users\\desk\\eclipse-selenium\\Selenium\\Screenshot\\snapdeal.png");
		FileUtils.copyFile(src, desc);
		
	}
}
