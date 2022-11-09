package com.toolsQA.pages;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Alerts {

	WebDriver driver;

	public Alerts(WebDriver driver) {
		this.driver = driver;
	}

	By title = By.xpath("//div[text()='Alerts']");

	By alert = By.xpath("//button[@id='alertButton']");

	By timeralert = By.xpath("//button[@id='timerAlertButton']");

	By conformalert = By.xpath("//button[@id='confirmButton']");

	By promptalert = By.xpath("//button[@id='promtButton']");

	By confirmTextSuceesMsg = By.xpath("//span[@id='confirmResult']");

	By promptTextSuceesMsg = By.xpath("//span[@id='promptResult']");

	public String getTitle() {
		return driver.findElement(title).getText();
	}

	public String getalert() {
		return driver.findElement(alert).getText();

	}

	public String gettimeralert() {
		return driver.findElement(timeralert).getText();

	}

	public String getconformbuttonalert() {
		return driver.findElement(conformalert).getText();

	}

	public String getpromptalert() {
		return driver.findElement(promptalert).getText();
	}

	public boolean isAlertPresent() {

		try {
			WebDriverWait wait = new WebDriverWait(driver, 10);
			wait.until(ExpectedConditions.alertIsPresent());
			return true;
		} catch (Exception e) {
			e.printStackTrace();
			return false;
		}
	}

	public String getAlertPopupMsg() {
		Alert alert = driver.switchTo().alert();
		String text = alert.getText();
		alert.accept();
		return text;
	}

	public String getTimerAlertPopopMsg() {
		driver.switchTo().alert();
		Alert alert = driver.switchTo().alert();
		String text = alert.getText();
		alert.accept();
		return text;
	}

	public String getConfirmAlertPopopMsg() {
		driver.switchTo().alert();
		Alert alert = driver.switchTo().alert();
		String text = alert.getText();
		return text;
	}

	public String getConfirmAlertSuccesfullMsg() {
		Alert alert = driver.switchTo().alert();
		alert.accept();
		String msg = driver.findElement(confirmTextSuceesMsg).getText();
		return msg;
	}

	public String getPromptAlertPopopMsg() {
		Alert alert = driver.switchTo().alert();
		String text = alert.getText();
		return text;
	}

	public String getPromptAlertInputText() {
		Alert alert = driver.switchTo().alert();
		alert.sendKeys("hello everyone....");
		alert.accept();
		return driver.findElement(promptTextSuceesMsg).getText();
	}
}
