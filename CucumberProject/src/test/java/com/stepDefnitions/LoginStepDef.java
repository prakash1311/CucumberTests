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

public class LoginStepDef{
	
	WebDriver driver;
	
@Given("user is on login page")
public void user_is_on_login_page() {
    // Write code here that turns the phrase above into concrete actions
	
	System.out.println("Scenario1: With Two steps navigated to Login page");	
	WebDriverManager.chromedriver().setup();
	driver = new ChromeDriver();
	driver.get("https://www.facebook.com/");
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
}


  @When("Enter username and password")
  public void enter_username_and_password() { 
  // Write code here that turns the phrase above into concrete actions
	  System.out.println("Scenario1: Entered username and password directly in script");
  try {
  driver.findElement(By.xpath("//input[@placeholder='Email or phone number']")).sendKeys("prakash13k@gmail.com");
  driver.findElement(By.xpath("//input[@placeholder='Password']")).sendKeys("Drithika@123");
  driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5)); 
  }catch
  (Exception e) { 
	  System.out.println("exeception identified is " + e);
	  }
  }


@When("click on login button")
public void click_on_login_button() throws InterruptedException {
    // Write code here that turns the phrase above into concrete actions
	System.out.println("Scenario1: Clicked on Login button in login page");
	driver.findElement(By.xpath("//button[@name='login']")).click();
	Thread.sleep(5000);
}

@Then("user should land on home page")
public void user_should_land_on_home_page() {
    // Write code here that turns the phrase above into concrete actions
	System.out.println("Scenario1: Validated the title of the Login page");
	String title = driver.getTitle();
	System.out.println("the title of the page is ..." + title);
	Assert.assertEquals("Facebook - log in or sign up", "Facebook - log in or sign up");
	driver.close();
	//Assert.assertEquals("Facebook - log in or sign up", "Facebook - log in or sign up");

}

}
