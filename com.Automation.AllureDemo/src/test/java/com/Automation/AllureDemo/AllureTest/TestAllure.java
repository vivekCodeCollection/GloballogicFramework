package com.Automation.AllureDemo.AllureTest;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class TestAllure {
	
protected WebDriver driver;
	
	@Test(description="To Test GoogleTitle")
	public void TestGoogle() {
		 System.setProperty("webdriver.chrome.driver",System.getProperty("user.dir")+"\\Exe\\chromedriver.exe");
		 driver=new ChromeDriver();	
	    driver.get("https://www.google.com");
		driver.quit();
								
			}
	

}
