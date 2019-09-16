package com.objectrepository;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.resources.FunctionalLibrary;

public class RegisterPage extends FunctionalLibrary {
	public  RegisterPage() {
		PageFactory.initElements(driver, this);
	}
	

	@FindBy(id="RegistrationForm_gender")
	private WebElement gender;
	
	@FindBy(id="RegistrationForm_email")
	private WebElement email;
	
	@FindBy(id="RegistrationForm_first_name")
	private WebElement fname;
	
	@FindBy(id="RegistrationForm_last_name")
	private WebElement lname;
	
	@FindBy(id="RegistrationForm_password")
	private WebElement pswd;
	
	@FindBy(id="RegistrationForm_password2")
	private WebElement conpswd;
	
	@FindBy(xpath="//button[text()='Register']")
	private WebElement registerbtn;
	

	public WebElement getGender() {
		return gender;
	}

	public WebElement getEmail() {
		return email;
	}

	public WebElement getFname() {
		return fname;
	}

	public WebElement getLname() {
		return lname;
	}

	public WebElement getPswd() {
		return pswd;
	}

	public WebElement getConpswd() {
		return conpswd;
	}

	public WebElement getRegisterbtn() {
		return registerbtn;
	}

	
	
}
