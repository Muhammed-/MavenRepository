package com.yaseenkhan.automation.Maven;

import java.sql.DriverManager;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class MavenTest {
	@Test
	public void Testone() throws InterruptedException {
	WebDriverManager.chromedriver().setup();
	WebDriver driver = new ChromeDriver();
	driver.get("https://www.youtube.com");
	System.out.println("youtube is launched sucessfully");
	Thread.sleep(3000);
	driver.close();
	System.out.println("YouTube Is Closingg");
	
}
}
