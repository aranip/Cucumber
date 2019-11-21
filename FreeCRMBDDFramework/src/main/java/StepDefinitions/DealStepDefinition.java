package StepDefinitions;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import java.util.Map;

import cucumber.api.DataTable;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import junit.framework.Assert;

public class DealStepDefinition {
	
	WebDriver driver;

	 @Given("^user is on Login Page$")
	 public void user_is_on_login_page() {
	 System.setProperty("webdriver.chrome.driver", "/Users/amruthapenigalapati/Downloads/chromedriver");
	 driver = new ChromeDriver();
	 driver.get("https://www.freecrm.com");
	 
}
	
	 @When("^title of login page free_crm$")
	 public void title_of_login_page_free_crm(){
	 String title = driver.getTitle();
	 System.out.println(title);
	 Assert.assertEquals("Free CRM #1 cloud software for any business large or small", title);

	 }

	 @Then("^user enters username and password$")
	 public void user_enters_username_and_password(DataTable credentials){
	 driver.findElement(By.xpath("/html/body/div[1]/header/div/nav/div[2]/div/div[2]/ul/a/span[2]")).click();
//	 List<String> data = credentials.asList(String.class);
//		System.out.println("username - " + data.get(0));
//		System.out.println("password - " + data.get(1));
	 for (Map<String, String> data : credentials.asMaps(String.class, String.class)) {
		 
		 			driver.findElement(By.name("username")).sendKeys(data.get("username"));
		 			driver.findElement(By.name("password")).sendKeys(data.get("password"));
	 }	 
	 }
	 @Then("^user click on login button$")
	 public void user_click_on_login_button() {
	 WebElement loginBtn =
			 driver.findElement(By.xpath("//*[@id=\'ui\']/div/div/form/div/div[3]"));
	 JavascriptExecutor js = (JavascriptExecutor)driver;
	 js.executeScript("arguments[0].click();", loginBtn);
	
	 }
	
	 @Then("^user on home page$")
	 public void user_on_hopme_page(){
	 String title = driver.getTitle();
	 System.out.println("Home Page title ::"+ title);
	 Assert.assertEquals("Cogmento CRM", title);
	 
	 }
	 
	 @Then("^user moves to new deal page$")
	 public void user_moves_to_new_contact_page() {
		 driver.findElement(By.linkText("Deals")).click();
		Actions action = new Actions(driver);
		action.moveToElement(driver.findElement(By.xpath("//a[contains(text(),'Deals')]"))).build().perform();
		driver.findElement(By.xpath("//a[contains(text(),'New Deal')]")).click();
		
		}
	 
		@Then("^user enters deal details$")
		public void user_enters_contacts_details(DataTable dealData) {
	
			for (Map<String, String> data : dealData.asMaps(String.class, String.class)) {
	
				driver.findElement(By.id("title")).sendKeys(data.get("title"));
				driver.findElement(By.id("amount")).sendKeys(data.get("amount"));
				driver.findElement(By.id("probability")).sendKeys(data.get("probability"));
				driver.findElement(By.id("commission")).sendKeys(data.get("commission"));
				
				driver.findElement(By.xpath("//input[@type='submit' and @value='Save']")).click(); //save button
				
				//move to new deal page:
				Actions action = new Actions(driver);
				action.moveToElement(driver.findElement(By.xpath("//a[contains(text(),'Deals')]"))).build().perform();
				driver.findElement(By.xpath("//a[contains(text(),'New Deal')]")).click();
	
			}
	
			
		}
	 @Then("^browser close$")
	 public void browser_close(){
		 driver.quit();
	 }
	
	
	
	

}