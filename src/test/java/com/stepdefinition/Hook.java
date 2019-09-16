package com.stepdefinition;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import com.resources.FunctionalLibrary;

import cucumber.api.java.After;
import cucumber.api.java.Before;

public class Hook extends FunctionalLibrary {

	@Before
	public void beforeBackground() throws InterruptedException {
		launch("https://www.zando.co.za");
		Thread.sleep(2000);
		WebElement close = driver.findElement(By.xpath("//div[@class='dy-lb-close']"));
		close.click();
	}
	@After
	public void afterScenario() {
}
}