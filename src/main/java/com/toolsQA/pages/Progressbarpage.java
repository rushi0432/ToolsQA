package com.toolsQA.pages;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Wait;

public class Progressbarpage {

	WebDriver driver;

	public Progressbarpage(WebDriver driver) {
		this.driver = driver;
	}

	By progressbarpagetitle = By
			.xpath("//div[@class='pattern-backgound playgound-header']//div[text()='Progress Bar']");

	By startstopbutton = By.xpath("//button[@id='startStopButton']");

	By progressbar = By.xpath("//div[@id='progressBar']");

	public String pagetite() {
		return driver.findElement(progressbarpagetitle).getText();
	}

	public String handleProgressBar(String text) {
		WebElement startbtn = driver.findElement(startstopbutton);
		startbtn.click();
		WebElement progress = driver.findElement(progressbar);
		Wait<WebDriver> wait = new FluentWait<WebDriver>(driver)
				.withTimeout(10, TimeUnit.SECONDS)
				.pollingEvery(5,TimeUnit.MILLISECONDS);
		
		wait.until(ExpectedConditions.textToBePresentInElement(progress, text));
		startbtn.click();
		return driver.findElement(progressbar).getText();
	}
}
