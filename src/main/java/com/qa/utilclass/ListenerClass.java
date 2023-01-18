package com.qa.utilclass;

import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

public class ListenerClass implements ITestListener{
	@Override
	public void onTestStart(ITestResult result) {
		System.out.println("Test case execution started :- " +result.getName());
	}

	@Override
	public void onTestSuccess(ITestResult result) {
		System.out.println("Test case execution passed :- " +result.getName());
	}

	@Override
	public void onTestFailure(ITestResult result) {
		System.out.println("Test case execution failed :- " +result.getName());
		UtilClass.takeScreenshotMethod(result.getName());
		System.out.println("Screenshot taken");
	}

	@Override
	public void onTestSkipped(ITestResult result) {
		System.out.println("Test case execution skiped :- " +result.getName());
	}

	@Override
	public void onTestFailedButWithinSuccessPercentage(ITestResult result) {
		
	}

	@Override
	public void onTestFailedWithTimeout(ITestResult result) {
		
	}

	@Override
	public void onStart(ITestContext context) {
		
	}

	@Override
	public void onFinish(ITestContext context) {
		
	}

}
