package com.stepdefinition.RLL_240Testing_FirstCry_Login;
 
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import com.pages.RLL_240Testing_FirstCry_Login.LoginPage;
import io.cucumber.java.Before;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
 
public class StepDefinition_Login {
	WebDriver driver;
	LoginPage login;
 
	@Before
	public void init() {
		driver = new ChromeDriver();
		login = new LoginPage(driver);
	}
 
	@Given("The user navigates to FirstCry Home Page")
	public void The_user_navigates_to_FirstCry_Home_Page() throws InterruptedException {
		login.LaunchFirstCry();
		driver.manage().window().maximize();
		Thread.sleep(1000);
	}
 
	@When("The user clicks on login")
	public void The_user_clicks_on_login() throws InterruptedException {
		login.loginbuttonclick();
		Thread.sleep(1000);
	}
 
	@And("^The user enters the (.*) or mobile no.$")
	public void The_user_enters_the_email_id_or_mobile_no(String EmailID) throws InterruptedException {
		login.enterUserName(EmailID);
		Thread.sleep(1000);
	}
 
	@Then("The user clicks on Continue")
	public void the_user_clicks_on_continue() throws InterruptedException {
		login.clickContinueButton();
		Thread.sleep(31000);
	}
	
	@And("^The user gets a (.*) message$")
	public void The_user_gets_a_message() {
		
	}
 
//	@And("The user enters the OTP sent to his registered email ID or mobile no.")
//	public void The_user_enters_the_OTP_sent_to_his_registered_email_ID_or_mobile_no() throws InterruptedException {
//		login.clickOTPBox();
//		Thread.sleep(1000);
//	}
 
	@And("Click on Submit")
	public void Click_on_Submit() {
		login.clickSubmitButton();
	}
 
	@Then("The user should be redirected to the Home Page")
	public void The_user_should_be_redirected_to_the_Home_Page() {
		WebElement exp = driver.findElement(By.xpath("//span[contains(text(),'My Account')]"));
		Assert.assertEquals(exp.getText(), "My Account");
	}
 
//	@Given("The user opens the FirstCry Home Page")
//	public void The_user_opens_the_FirstCry_Home_Page() throws InterruptedException {
//		login.LaunchFirstCry();
//		driver.manage().window().maximize();
//		Thread.sleep(1000);
//	}
// 
//	@When("The user clicks on login button")
//	public void The_user_clicks_on_login_button() throws InterruptedException {
//		login.loginbuttonclick();
//		Thread.sleep(1000);
//	}
// 
//	@And("^The user enters a wrong (.*) or mobile number$")
//	public void The_user_enters_a_wrong_email_id_or_mobile_number(String EmailID_1) throws InterruptedException {
//		login.enterUserName(EmailID_1);
//		Thread.sleep(1000);
//	}
// 
//	@And("The user clicks on Continue button")
//	public void The_user_clicks_on_Continue_button() throws InterruptedException {
//		login.clickContinueButton();
//		Thread.sleep(1000);
//	}
// 
//	@Then("The user should not be able to login and should be redirected to the registration page")
//	public void The_user_should_not_be_able_to_login_and_should_be_redirected_to_the_registration_page() {
//		WebElement exp1 = driver.findElement(By.xpath("//p[contains(text(),'Register')]"));
//		Assert.assertEquals(exp1.getText(), "Register");
//	}
// 
//	@Given("The user enters the FirstCry Home Page")
//	public void The_user_enters_the_FirstCry_Home_Page() throws InterruptedException {
//		login.LaunchFirstCry();
//		driver.manage().window().maximize();
//		Thread.sleep(1000);
//	}
// 
//	@When("The user clicks on the login icon")
//	public void The_user_clicks_on_the_login_icon() throws InterruptedException {
//		login.loginbuttonclick();
//		Thread.sleep(1000);
//	}
// 
////	@And("The user do not enter any credentials")
////	public void The_user_do_not_enter_any_credentials() {
////	}
// 
//	@And("The user clicks on Continue icon")
//	public void The_user_clicks_on_Continue_icon() throws InterruptedException {
//		login.clickContinueButton();
//		Thread.sleep(1000);
//	}
// 
//	@Then("the user should not be able to login and should see the message Please enter email ID or mobile no.")
//	public void the_user_should_not_be_able_to_login_and_should_see_the_message_please_enter_email_ID_or_mobile_no() {
//		WebElement exp2 = driver.findElement(By.xpath("//p[contains(text(),'Please enter Email-Id or Mobile No.')]"));
//		Assert.assertEquals(exp2.getText(), "Please enter Email-Id or Mobile No.");
//	}
// 
//	@Given("The user open the browser and navigates to the FirstCry Home Page")
//	public void The_user_open_the_browser_and_navigates_to_the_FirstCry_Home_Page() throws InterruptedException {
//		login.LaunchFirstCry();
//		driver.manage().window().maximize();
//		Thread.sleep(1000);
//	}
// 
//	@When("User clicks on login button")
//	public void User_clicks_on_login_button() throws InterruptedException {
//		login.loginbuttonclick();
//		Thread.sleep(1000);
//	}
// 
//	@Then("^The user enter the (.*) or mobile number$")
//	public void The_user_enter_the_email_ID_or_mobile_number(String EmailID_2) throws InterruptedException {
//		login.enterUserName(EmailID_2);
//		Thread.sleep(1000);
//	}
// 
//	@And("User clicks on Continue")
//	public void user_clicks_on_continue() throws InterruptedException {
//		login.clickContinueButton();
//		Thread.sleep(31000);
//	}
// 
////	@And("The user enters the wrong OTP sent on the registered email ID or mobile number")
////	public void The_user_enters_the_wrong_OTP_sent_on_the_registered_email_ID_or_mobile_number() {
////	}
////
//	@And("Click on Submit icon")
//	public void Click_on_Submit_icon() {
//		login.clickSubmitButton();
//	}
//	@Then("the user should not be able to login and should see the message Invalid OTP. Please try again.")
//	public void the_user_should_not_be_able_to_login_and_should_see_the_message_Invalid_OTP_Please_try_again() {
//		WebElement exp3 = driver.findElement(By.xpath("//p[contains(text(),'Invalid OTP. Please try again.')]"));
//		Assert.assertEquals(exp3.getText(), "Invalid OTP. Please try again.");
//	}
}