package com.toolsQA.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class practiseFormpage {

	WebDriver driver;

	public practiseFormpage(WebDriver driver) {
		this.driver = driver;
	}

	By firstname = By.xpath("//input[@id='firstName']");

	By lastname = By.xpath("//input[@id='lastName']");

	By email = By.xpath("//input[@id='lastName']");

	By gender = By.xpath("//label[text()='Male']");

	By male = By.xpath("//input[@id='gender-radio-1']");

	By mobile = By.xpath("//input[@id='userNumber']");

	By subject = By.xpath("//input[@id='subjectsInput']");

	By hobbies = By.xpath("//label[text()='Sports']");

	By sport = By.xpath("//input[@id='hobbies-checkbox-1']");

	By address = By.xpath("//textarea[@id='currentAddress']");

	public String enterfirstname(String fname) {
		WebElement ele = driver.findElement(firstname);
		ele.sendKeys(fname);
		return ele.getAttribute("value");
	}

	public String enterlastname(String lname) {
		WebElement ele = driver.findElement(lastname);
		ele.sendKeys(lname);
		return ele.getAttribute("value");
	}

	public String enteremail(String mail) {
		WebElement ele = driver.findElement(email);
		ele.clear();
		ele.sendKeys(mail);
		return ele.getAttribute("value");
	}

	public boolean entergender() {
		driver.findElement(gender).click();
		return driver.findElement(male).isSelected();
	}

	public String entermobilenumber(String mob) {
		WebElement ele = driver.findElement(mobile);
		ele.sendKeys(mob);
		return ele.getAttribute("value");
	}

	public String entersubject(String sub) {
		WebElement ele = driver.findElement(subject);
		ele.sendKeys(sub);
		return ele.getAttribute("value");
	}

	public boolean enterhobbies() {
		driver.findElement(hobbies).click();
		return driver.findElement(sport).isSelected();
	}

	public String enteraddress(String address1) {
		WebElement ele = driver.findElement(address);
		ele.sendKeys(address1);
		return ele.getAttribute("value");
	}
}
