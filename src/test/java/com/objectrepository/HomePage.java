package com.objectrepository;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.resources.FunctionalLibrary;

public class HomePage extends FunctionalLibrary {
public HomePage() {
	PageFactory.initElements(driver, this);
}



@FindBy(xpath="//span[text()='Log In']")
private WebElement loginButton;



public WebElement getLoginButton() {
	return loginButton;
}
}
