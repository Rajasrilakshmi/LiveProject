package com.stepdefinition;

import org.openqa.selenium.support.ui.Select;

import com.objectrepository.HomePage;
import com.objectrepository.RegisterPage;
import com.resources.FunctionalLibrary;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class RegisterSteps extends FunctionalLibrary {
	  HomePage page = new HomePage();
	  RegisterPage p = new RegisterPage();
	  
	
	@Given("click on login button")
	public void click_on_login_button() throws InterruptedException {
		Thread.sleep(1000);
	  button(page.getLoginButton());
	}

@Given("choose the gender")
public void choose_the_gender() {
	Select s = new Select(p.getGender());
	s.selectByIndex(2);
}

@Given("enter the email address")
public void enter_the_email_address() {
	fill(p.getEmail(),"rajasri@gmail.com");
	
}

@When("enter first name")
public void enter_first_name() {
 fill(p.getFname(),"rajasri");
}

@When("enter last name")
public void enter_last_name() {
    fill(p.getLname(),"lakshmi");
}

@When("enter password")
public void enter_password() {
  fill(p.getPswd(),"Raja123");
}

@When("confirm the password")
public void confirm_the_password() {
	fill(p.getConpswd(),"Raja123");
}

@Then("click on the register button")
public void click_on_the_register_button() {
   button(p.getRegisterbtn());
}

}
