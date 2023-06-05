package com.actitme.POM;

import org.openqa.selenium.SearchContext;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Taskpage {
//decleration
	@FindBy(xpath = "//div[.='Add New']")
	private WebElement addnew;
	
	@FindBy(xpath ="//div[.='+ New Customer']")
	private WebElement newcust;
	
	@FindBy(xpath = "//input[@placeholder='Enter Customer Name']")
	private WebElement custname;
	
	@FindBy (xpath = "//textarea[@placeholder='Enter Customer Description']")
    private WebElement custdesp;
	
	@FindBy (xpath = "//div[.='Create Customer']")
	private WebElement createbtn;
	
	//initialization
	public Taskpage (WebDriver driver) {
		
		PageFactory.initElements(driver,this);
	}
	//utilization
	
	public WebElement getAddnew() {
		return addnew;
	}

	public WebElement getNewcust() {
		return newcust;
	}

	public WebElement getCustname() {
		return custname;
	}

	public WebElement getCustdesp() {
		return custdesp;
	}

	public WebElement getCreatebtn() {
		return createbtn;
	}
	

	



}
