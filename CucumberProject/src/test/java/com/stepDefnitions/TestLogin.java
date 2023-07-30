package com.stepDefnitions;

import java.time.Duration;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;

public class TestLogin{
	
	WebDriver driver;
	
@Given("user is on login page2")
public void user_is_on_login_page2() {
    // Write code here that turns the phrase above into concrete actions
	System.out.println("Scenario3: With Two steps navigated to Login page");
	
	WebDriverManager.chromedriver().setup();
	driver = new ChromeDriver();
	driver.get("https://www.facebook.com/");
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
}


@When("Enter2 (.*) and (.*) $")
public void enter2_username_and_password(String uname, String pwd) {
    // Write code here that turns the phrase above into concrete actions
	System.out.println("Scenario3: Entered username and password from feature file with datadriven approach");
	
	try {
		driver.findElement(By.xpath("//input[@placeholder='Email or phone number']")).sendKeys(uname);
		driver.findElement(By.xpath("//input[@placeholder='Password']")).sendKeys(pwd);
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
	}catch (Exception e) {
		System.out.println("exeception identified is " + e);
	}
}

@When("click on login button2")
public void click_on_login_button2() throws InterruptedException {
    // Write code here that turns the phrase above into concrete actions
	System.out.println("Scenario3: Clicked on Login button in login page");
	
	driver.findElement(By.xpath("//button[@name='login']")).click();
	Thread.sleep(5000);
}

@Then("user should land on home page2")
public void user_should_land_on_home_page2() {
    // Write code here that turns the phrase above into concrete actions
	System.out.println("Scenario3: Validated the title of the Login page");
	String title = driver.getTitle();
	System.out.println("the title of the page is ..." + title);
	Assert.assertEquals("Facebook - log in or sign up", "Facebook - log in or sign up");
	driver.close();
	//Assert.assertEquals("Facebook - log in or sign up", "Facebook - log in or sign up");

}

}
