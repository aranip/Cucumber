package com.qa.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;



import com.qa.util.TestBase;

public class HomePage extends TestBase{
	@FindBy(xpath = "//*[@id='top-header-menu']/div[3]/span[2]")
	WebElement userNameLabel;
	
	@FindBy(linkText = "Contacts")
	WebElement contactsLink;
	
	@FindBy(xpath = "//*[@id='dashboard-toolbar']/div[2]/div/a/button")
	WebElement newContactLink;
	
	@FindBy(xpath = "//*[@id='main-nav']/a[5]/span")
	WebElement DealsLink;
	
	 @FindBy(linkText = "Tasks")
	WebElement TasksLink;
	 
	 //Initializing the Page Objects:
	 public	HomePage() {
			
			PageFactory.initElements(driver, this);
	 }
	 
	public String verifyHomePageTitle(){
		return driver.getTitle();
	}
	public boolean verifyCorrectUserName(){
		return userNameLabel.isDisplayed();
	}
	 
	 public void clickOnNewContactLink(){
		 //driver.findElement(By.xpath("//*[@id=\'dashboard-toolbar\']/div[2]/div/a/button")).click();
		 //driver.findElement(By.linkText("Contacts")).click();
		 newContactLink.click();	
	 }
}
