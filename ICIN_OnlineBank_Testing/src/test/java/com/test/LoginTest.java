package com.test;

import org.testng.annotations.Test;
import org.testng.annotations.Test;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
//import org.testng.annotations.Test;

public class LoginTest {
  @Test
  public void loginTest() {
	  
	  System.setProperty("webdriver.chrome.driver", "C:\\Users\\HP-PC\\Desktop\\Tools\\chromedriver_win32/chromedriver.exe");
		 WebDriver driver= new ChromeDriver();
		 driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		 driver.get("localhost:4200/icin-bank");
		 driver.findElement(By.xpath("/html/body/app-root/html/body/div/div/app-icin-bank/div/header/div/div/div[1]/div/div/div/div/form/div[2]/span/button")).click();
		 driver.findElement(By.xpath("//*[@id=\"home\"]/div[1]/div/div[1]/input")).sendKeys("dhwani");
		 driver.findElement(By.xpath("//*[@id=\"home\"]/div[1]/div/div[2]/input")).sendKeys("dhwani");
		 try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	    driver.findElement(By.xpath("//*[@id=\"home\"]/div[1]/div/input")).click();
	    driver.findElement(By.xpath("/html/body/app-root/html/body/div/div/app-home/div/nav[2]/ul/li[3]/a")).click();
	    driver.findElement(By.xpath("//*[@id=\"home\"]/div/div[1]/div/div[1]/div/input")).sendKeys("1004");
	    driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	    driver.findElement(By.xpath("//*[@id=\"deposit\"]")).click(); 
	    
	    driver.findElement(By.linkText("Saving Account Details")).click();
//	    driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	    driver.findElement(By.linkText("My Profile")).click();
	   
	    driver.close();
	    driver.quit();		 
		
  }
}
