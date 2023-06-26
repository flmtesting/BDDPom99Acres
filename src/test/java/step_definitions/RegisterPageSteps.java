package step_definitions;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import helpers.Hooks;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pageobjects.LoginPageObjects;
import pageobjects.RegisterPageObjects;

import utility.TestBase;

public class RegisterPageSteps {
	public WebDriver driver;
	public TestBase configFileReader;

	public RegisterPageSteps() {
		driver = Hooks.driver;
		PageFactory.initElements(driver, RegisterPageObjects.class);
	}

	@When("user click on continue button")
	public void user_click_on_continue_button() {
	    
		LoginPageObjects.continueBtn.click();
	}

	@Given("^User open (\\d+)acres website$")
	public void user_open_acres_website(int arg1) throws Throwable {
		
		configFileReader = new TestBase();
		driver.get(configFileReader.getApplicationUrl());
	}

	@When("^user click on Hamburger icon$")
	public void user_click_on_Hamburger_icon() throws Throwable {
		
		RegisterPageObjects.ham_icon.click();

	}

	
	@When("^user click on register or login button$")
	public void user_click_on_register_button() throws Throwable {
		 Thread.sleep(3000);
		
		RegisterPageObjects.login.click();
		

	}

	@When("^user enter \"([^\"]*)\" \"([^\"]*)\" \"([^\"]*)\" \"([^\"]*)\" in input box$")
	public void user_enter_in_input_box(String name, String email, String pwd, String phone) throws Throwable {
		// Thread.sleep(3000);
		RegisterPageObjects.name.sendKeys(name);
		RegisterPageObjects.email.sendKeys(email);
		RegisterPageObjects.pwd.sendKeys(pwd);
		RegisterPageObjects.ph_no.sendKeys(phone);
	}

	@Then("^user click on Register Now button$")
	public void user_click_on_Register_Now_button() throws Throwable {
		RegisterPageObjects.reg_Btn.click();

	}

	// *********************************************************************//

	@When("^user enter \"([^\"]*)\" \"([^\"]*)\" \"([^\"]*)\" in input box$")
	public void user_enter_in_input_box(String name, String email, String pwd) throws Throwable {
		RegisterPageObjects.name.sendKeys(name);
		RegisterPageObjects.email.sendKeys(email);
		RegisterPageObjects.pwd.sendKeys(pwd);

	}

	@When("^user click on show button$")
	public void user_click_on_show_button() throws Throwable {
		Thread.sleep(3000);
		RegisterPageObjects.show_Btn.click();

	}

	@When("^user click on hide button$")
	public void user_click_on_hide_button() throws Throwable {
		Thread.sleep(3000);
		RegisterPageObjects.hide_Btn.click();

	}

}
