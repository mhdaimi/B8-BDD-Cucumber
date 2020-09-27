package stepDefinition;

import java.util.concurrent.TimeUnit;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class Facebook {
	
	WebDriver browser;
	
	@Given("User is at facebook login page")
	public void user_is_at_facebook_login_page() {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\mhdai\\Downloads\\chromedriver_win32_85\\chromedriver.exe"); //
		browser = new ChromeDriver();
		browser.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		browser.get("http://www.facebook.com/");	
	}

	@When("User enters valid username")
	public void user_enters_valid_username() {
	    browser.findElement(By.id("email")).sendKeys("mhdaimi@gmx.com");
	}

	@When("User enters invalid password")
	public void user_enters_invalid_password() {
	    browser.findElement(By.id("pass")).sendKeys("123456789");
	}

	@When("User clicks on signin button")
	public void user_clicks_on_signin_button() {
	    browser.findElement(By.name("login")).click();
	}

	@When("User enters valid username {string}")
	public void user_enters_username(String userName) {
		browser.findElement(By.id("email")).sendKeys(userName);
	}

	@When("User enters invalid password {string}")
	public void user_enters_password(String password) {
		browser.findElement(By.id("pass")).sendKeys(password);
	}

	@Then("Login is unsuccessful with text {string} displayed on page")
	public void login_is_unsuccessful_with_title(String text) {
		String pageText = browser.findElement(By.id("header_block")).getText();
		System.out.println(text);
		Assert.assertEquals(text, pageText);
	}
	
	@Then("Login should not be successful")
	public void login_should_not_be_successful() {
	    Assert.assertEquals("Facebook – log in or sign up", browser.getTitle());
	}

}
