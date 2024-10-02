package com.stepdefinition.RLL_240Testing_FirstCry_Login;
 
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
 
import com.pages.RLL_240Testing_FirstCry_Login.HomePage;
import io.cucumber.java.Before;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
 
 
public class StepDefinition_Home {
	WebDriver driver;
	HomePage home;
 
	@Before
	public void init() {
		driver = new ChromeDriver();
		home = new HomePage(driver);
	}
	
	@Given("The user is to enter the FirstCry Home Page")
	public void The_user_is_to_enter_the_FirstCry_Home_Page() throws InterruptedException {
		home.LaunchFirstCry();
		driver.manage().window().maximize();
		Thread.sleep(1000);
	}
 
	@When("The_user_then_clicks_on_login_button")
	public void The_user_then_clicks_on_login_button() throws InterruptedException {
		home.loginbuttonclick();
		Thread.sleep(1000);
	}
	
	@Then("The user enters the login page of firstcry app")
	public void The_user_enters_the_login_page_of_firstcry_app() {
		WebElement exp4 = driver.findElement(By.xpath("//p[contains(text(),'Log In/Register')]"));
		Assert.assertEquals(exp4, "Log In/Register");
		
	}
	
 
}