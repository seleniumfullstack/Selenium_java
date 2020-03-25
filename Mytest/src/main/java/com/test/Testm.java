package com.test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Testm {
	
	public WebDriver driver;
	
	@BeforeTest
	public void setup()
	{
		System.setProperty("webdriver.chrome.driver", "D:/projects/chromedriver.exe");
        driver = new ChromeDriver();
       driver.get("http://shop.demoqa.com/");
	}
	@Test(priority=2)
	public void test()
	{
		
       driver.findElement(By.xpath("//*[@id=\"noo-site\"]/header/div[2]/div/div/div/div/a/img")).click();
       
	}
	@Test(priority=2)
	public void testshopping()
	{
		driver.findElement(By.xpath("//*[@id=\"nav-menu-item-cart\"]/a/span/span[2]/span")).click();
	}

	@AfterTest
	public void cleanup()
	{
		 driver.quit();
	}
}
