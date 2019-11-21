package StepDefinitions;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import cucumber.api.PendingException;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import junit.framework.Assert;

// public class LoginStepDefinitions{
//
//	 WebDriver driver;
//
//	 @Given("^user is already on Login Page$")
//	 public void user_already_on_login_page() {
//	 System.setProperty("webdriver.chrome.driver", "/Users/amruthapenigalapati/Downloads/chromedriver");
//	 driver = new ChromeDriver();
//	 driver.get("https://www.freecrm.com");
//	 
// }
//	
//	
//	 @When("^title of login page is Free CRM$")
//	 public void title_of_login_page_is_free_CRM(){
//	 String title = driver.getTitle();
//	 System.out.println(title);
//	 Assert.assertEquals("Free CRM #1 cloud software for any business large or small", title);
//
//	 }
////	
////	 //Reg Exp:
////	 //1. \"([^\"]*)\"
////	 //2. \"(.*)\"
////	
//	 @Then("^user enters \"(.*)\" and \"(.*)\"$")
//	 public void user_enters_username_and_password(String username, String password){
//	 driver.findElement(By.xpath("/html/body/div[1]/header/div/nav/div[2]/div/div[2]/ul/a/span[2]")).click();
//	 driver.findElement(By.name("email")).sendKeys(username);
//     driver.findElement(By.name("password")).sendKeys(password);
//   
//	 }
//	
//	 @Then("^user clicks on login button$")
//	 public void user_clicks_on_login_button() {
//	 WebElement loginBtn =
//			 driver.findElement(By.xpath("//*[@id=\'ui\']/div/div/form/div/div[3]"));
//	 JavascriptExecutor js = (JavascriptExecutor)driver;
//	 js.executeScript("arguments[0].click();", loginBtn);
//	
//	 }
//	
//	 @Then("^user is on home page$")
//	 public void user_is_on_hopme_page(){
//	 String title = driver.getTitle();
//	 System.out.println("Home Page title ::"+ title);
//	 Assert.assertEquals("Cogmento CRM", title);
//	 
//	 }
//	 
//	 @Then("^user clicks on contact page clicks on new$")
//	 public void user_clicks_on_contact_page_clicks_on_new() {
//		driver.findElement(By.linkText("Contacts")).click();
//		 //driver.findElement(By.xpath("//*[@id=\'main-nav\']/a[3]/span")).click();
//		 //driver.findElement(By.cssSelector("#main-nav > a:nth-child(3)")).click();
//		 driver.findElement(By.xpath("//span[contains ='Contacts']")).click();
//		 //driver.findElement(By.("#main-nav > a:nth-child(3) > span")).click();
//	        driver.findElement(By.xpath("//*[@id=\'dashboard-toolbar\']/div[2]/div/a/button")).click();
//		 
//    }
//	 
//	 
//	 @Then("^user enters contact details \"(.*)\" and \"(.*)\" and \"(.*)\" and \"(.*)\"$")
//	 public void user_enters_contacts_details(String firstname, String lastname,String email, String position){
//		 driver.findElement(By.name("first_name")).sendKeys(firstname);
//	        driver.findElement(By.name("last_name")).sendKeys(lastname);
//	        driver.findElement(By.xpath("//*[@id='ui']/div/div[2]/div[2]/div/div[2]/form/div[4]/div/div/div/div/div[1]/input")).sendKeys(email);
//	        driver.findElement(By.name("position")).sendKeys(position);
//	        driver.findElement(By.xpath("//*[@id='dashboard-toolbar']/div[2]/div/button[2]")).click();
//
//	       
//	 }
//	 
//	 
//	 @Then("^Close the browser$")
//	 public void close_the_browser(){
//		 driver.quit();
//		 
//	 }
//	
//
//	 }
