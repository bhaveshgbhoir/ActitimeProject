package com.actitime.GenericLiabrary;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.testng.ITestListener;
import org.testng.ITestResult;

import com.google.common.io.Files;

public class Listnerimplementation extends Baseclass implements ITestListener {
	@Override
	public void onTestStart(ITestResult result) {
		// TODO Auto-generated method stub
		ITestListener.super.onTestStart(result);
	}

	@Override
	public void onTestSuccess(ITestResult result) {
		// TODO Auto-generated method stub
		
		ITestListener.super.onTestSuccess(result);
	}

	@Override
	public void onTestFailure(ITestResult result) {
	String name = result.getName();
	TakesScreenshot t= (TakesScreenshot) driver;
	File src=t.getScreenshotAs(OutputType.FILE);
	File desc= new File("./Screenshot/"+name+".png");
	try {
		Files.copy(src, desc);
		
	}catch (IOException e) {
		e.printStackTrace();
		
		
	}}


}
