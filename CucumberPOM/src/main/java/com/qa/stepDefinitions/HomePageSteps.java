package com.qa.stepDefinitions;

import org.junit.Assert;

import com.qa.pages.HomePage;
import com.qa.pages.LoginPage;
import com.qa.util.TestBase;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;

public class HomePageSteps extends TestBase{
   LoginPage loginpage;
   HomePage homepage;	

@Given("^user opens browser$")
public void user_opens_browser() throws Throwable {
   TestBase.initialization(); 
}

@Then("^user is on login Page$")
public void user_is_on_login_Page() throws Throwable {
	loginpage = new LoginPage();
   String title = loginpage.validateLoginPageTitle();
   Assert.assertEquals("Free CRM #1 cloud software for any business large or small" , title);
}

@Then("^user logs into app$")
public void user_logs_into_app() throws Throwable {
 homepage = loginpage.login(prop.getProperty("username"), prop.getProperty("password"));
}

@Then("^validate home page title$")
public void validate_home_page_title() throws Throwable {
	String homeTitle = homepage.verifyHomePageTitle();
	   Assert.assertEquals("Cogmento CRM", homeTitle);
}

@Then("^validate logged in username$")
public void validate_logged_in_username() throws Throwable {
    boolean flag = homepage.verifyCorrectUserName();
    Assert.assertTrue(flag);
}

}
