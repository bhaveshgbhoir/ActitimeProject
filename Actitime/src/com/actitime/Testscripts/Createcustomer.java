package com.actitime.Testscripts;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import com.actitime.GenericLiabrary.Baseclass;
import com.actitime.GenericLiabrary.Fileliabrary;
import com.actitme.POM.Homepage;
import com.actitme.POM.Taskpage;

public class Createcustomer extends Baseclass{
	
	@Test
	public void Createcustomer () throws IOException {
		Homepage hp=new  Homepage(driver);
				hp.getTasktab().click();
		
			Taskpage tp=new Taskpage(driver);
			tp.getAddnew().click();
			tp.getNewcust().click();
			Fileliabrary f1=new Fileliabrary ();
			String customer = f1.readDataFromExcel("Data", 3, 1);
			tp.getCustname().sendKeys(customer);
			String description = f1.readDataFromExcel("Data", 3, 2);
			tp.getCustdesp().sendKeys(description);
			tp.getCreatebtn().click();
			String expectedresult = customer;
		    String actualresult = driver.findElement(By.xpath("(//div[.='"+customer+"'])[2])")).getText();
			SoftAssert s=new SoftAssert ();
		    s.assertEquals(actualresult, expectedresult);
				
				
				
				
	}

}
