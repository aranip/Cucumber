
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import org.testng.Assert;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
public class LoginStepDefinition{

	 WebDriver driver;

	 @Given("^user is already on Login Page$")
	 public void user_already_on_login_page() {
// 	 System.setProperty("webdriver.chrome.driver", "/Users/amruthapenigalapati/Downloads/chromedriver");
	 driver = new ChromeDriver();
	 driver.get("https://www.freecrm.com");
	 
}
	
	
	 @When("^title of login page is Free CRM$")
	 public void title_of_login_page_is_free_CRM(){
	 String title = driver.getTitle();
	 System.out.println(title);
	 Assert.assertEquals("Free CRM #1 cloud software for any business large or small", title);

	 }
//	
//	 //Reg Exp:
//	 //1. \"([^\"]*)\"
//	 //2. \"(.*)\"
//	
	 @Then("^user enters \"(.*)\" and \"(.*)\"$")
	 public void user_enters_username_and_password(String username, String password){
	 driver.findElement(By.xpath("/html/body/div[1]/header/div/nav/div[2]/div/div[2]/ul/a/span[2]")).click();
	 driver.findElement(By.name("email")).sendKeys(username);
  driver.findElement(By.name("password")).sendKeys(password);

	 }
	
	 @Then("^user clicks on login button$")
	 public void user_clicks_on_login_button() {
	 WebElement loginBtn =
			 driver.findElement(By.xpath("//*[@id=\'ui\']/div/div/form/div/div[3]"));
	 JavascriptExecutor js = (JavascriptExecutor)driver;
	 js.executeScript("arguments[0].click();", loginBtn);
	
	 }
	
	 @Then("^user is on home page$")
	 public void user_is_on_hopme_page(){
	 String title = driver.getTitle();
	 System.out.println("Home Page title ::"+ title);
	 Assert.assertEquals("Cogmento CRM", title);
	 
	 }
	 	 
	 @Then("^Close the browser$")
	 public void close_the_browser(){
		 driver.quit();
		 
	 }
	

	 }
