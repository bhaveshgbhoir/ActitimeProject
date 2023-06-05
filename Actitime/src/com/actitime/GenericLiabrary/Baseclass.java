
package com.actitime.GenericLiabrary;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Reporter;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;

public class Baseclass {

	public static WebDriver driver;
	@BeforeSuite
	public void databaseconnection() {
		Reporter.log("Database connected",true);
	}

	@BeforeClass
	public void launchBrowser() {
		driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		driver.get("https://demo.actitime.com");
		Reporter.log("Browser launched",true);
	}
	@BeforeMethod
	public void login() {
		driver.findElement(By.id("username")).sendKeys("admin");
		driver.findElement(By.name("pwd")).sendKeys("manager");
		driver.findElement(By.xpath("//div[.='Login ']")).click();
		
		
	}


	@AfterMethod
	public void closebrowser() {
		driver.findElement(By.id("logoutLink")).click();
		Reporter.log("Logged out successfully",true);
		
	}
	@AfterClass
	public void Closebrowser() {
		driver.close();
		Reporter.log("browser closed",true);
		
		
	}
	@AfterSuite
	public void closedatabaseConnection() {
		Reporter.log("database disconnected",true);
	}
	
	
}

