package com.toolsQA.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class TextBoxPage {
	WebDriver driver;

	public TextBoxPage(WebDriver driver) {
		this.driver = driver;
	}

	By fullname = By.xpath("//input[@id='userName']");

	By email = By.xpath("//input[@id='userEmail']");

	By currentaddress = By.xpath("//textarea[@id='currentAddress']");

	By permenentaddress = By.xpath("//textarea[@id='permanentAddress']");

	public String enterFullname(String name) {
		WebElement ele = driver.findElement(fullname);
		ele.sendKeys(name);
		return ele.getAttribute("value");
	}

	public String enterEmail(String email1) {
		WebElement ele = driver.findElement(email);
		ele.sendKeys(email1);
		return ele.getAttribute("value");
	}

	public String entercurrentaddress(String currentaddress1) {
		WebElement ele = driver.findElement(currentaddress);
		ele.clear();
		ele.sendKeys(currentaddress1);
		return ele.getAttribute("value");
	}

	public String enterpermrenentaddress(String permenentaddress1) {
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0,200)", "");
		WebElement ele3 = driver.findElement(permenentaddress);
		ele3.sendKeys(permenentaddress1);
		return ele3.getAttribute("value");
	}
}
