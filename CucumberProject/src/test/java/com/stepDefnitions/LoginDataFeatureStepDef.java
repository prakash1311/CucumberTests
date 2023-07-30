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

public class LoginDataFeatureStepDef{
	
	WebDriver driver;

@Given("user is on login page1")
public void user_is_on_login_page1() {
    // Write code here that turns the phrase above into concrete actions
	
	System.out.println("Scenario2: With Two steps navigated to Login page");
	
	WebDriverManager.chromedriver().setup();
	driver = new ChromeDriver();
	driver.get("https://www.facebook.com/");
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
}

@When("Enter1 \"(.*)\" and \"(.*)\"$")
public void enter1_username_and_password(String username,String password) { 
  // Write code here that turns the phrase above into concrete actions
	System.out.println("Scenario2: Entered username and password from feature file");
  try {
  driver.findElement(By.xpath("//input[@placeholder='Email or phone number']")).sendKeys(username);
  driver.findElement(By.xpath("//input[@placeholder='Password']")).sendKeys(password);
  driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5)); 
  }catch
  (Exception e) { 
	  System.out.println("exeception identified is " + e);
	  }
  }

@When("click on login button1")
public void click_on_login_button1() throws InterruptedException {
    // Write code here that turns the phrase above into concrete actions
	System.out.println("Scenario2: Clicked on Login button in login page");
	driver.findElement(By.xpath("//button[@name='login']")).click();
	Thread.sleep(5000);
}

@Then("user should land on home page1")
public void user_should_land_on_home_page1() {
    // Write code here that turns the phrase above into concrete actions
	System.out.println("Scenario2: Validated the title of the Login page");
	String title = driver.getTitle();
	System.out.println("the title of the page is ..." + title);
	Assert.assertEquals("Facebook - log in or sign up", "Facebook - log in or sign up");
	driver.close();
	//Assert.assertEquals("Facebook - log in or sign up", "Facebook - log in or sign up");

}

}