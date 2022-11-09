package com.toolsQA.listners;

import org.apache.log4j.Logger;
import org.testng.ITestListener;
import org.testng.ITestResult;

public class testnglistners implements ITestListener {

	static Logger Log = Logger.getLogger(testnglistners.class.getName());

	public void onStart(ITestResult result) {
		// TODO Auto-generated method stub
		System.out.println("onStart :" + result.getMethod().getMethodName());
		Log.info("onStart :" + result.getMethod().getMethodName());
	}

	public void onFinish(ITestResult result) {
		// TODO Auto-generated method stub
		System.out.println("onFinish :" + result.getMethod().getMethodName());
		Log.info("onFinish :" + result.getMethod().getMethodName());
	}

	public void onTestStart(ITestResult result) {
		// TODO Auto-generated method stub
		System.out.println("onTestStart :" + result.getMethod().getMethodName());
		Log.info("onTestStart :" + result.getMethod().getMethodName());
	}

	public void onTestSuccess(ITestResult result) {
		// TODO Auto-generated method stub
		System.out.println("onTestSuccess :" + result.getMethod().getMethodName());
		Log.info("onTestSuccess :" + result.getMethod().getMethodName());
	}

	public void onTestFailure(ITestResult result) {
		// TODO Auto-generated method stub
		System.out.println("onTestFailure :" + result.getMethod().getMethodName());
		Log.info("onTestFailure :" + result.getMethod().getMethodName());
	}

	public void onTestSkipped(ITestResult result) {
		// TODO Auto-generated method stub
		System.out.println("onTestSkipped :" + result.getMethod().getMethodName());
		Log.info("onTestSkipped :" + result.getMethod().getMethodName());
	}

	public void onTestFailedButWithinSuccessPercentage(ITestResult result) {
		// TODO Auto-generated method stub
		System.out.println("onTestFailedButWithinSuccessPercentage :" + result.getMethod().getMethodName());
		Log.info("onTestFailedButWithinSuccessPercentage :" + result.getMethod().getMethodName());
	}

	public void onTestFailedWithTimeout(ITestResult result) {
		// TODO Auto-generated method stub
		System.out.println("onTestFailedButWithinSuccessPercentage :" + result.getMethod().getMethodName());
		Log.info("onTestFailedButWithinSuccessPercentage :" + result.getMethod().getMethodName());
	}
}
