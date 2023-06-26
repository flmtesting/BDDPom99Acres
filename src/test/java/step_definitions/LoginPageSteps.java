package step_definitions;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

import helpers.Hooks;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pageobjects.LoginPageObjects;


import utility.TestBase;

public class LoginPageSteps {
	
	public WebDriver driver;
	public TestBase configFileReader;

	public LoginPageSteps() {
		driver = Hooks.driver;
		PageFactory.initElements(driver, LoginPageObjects.class);
	}


	@When("user enter {string} in input box")
	public void user_enter_in_input_box(String uname) throws Throwable {
		LoginPageObjects.uname.sendKeys(uname);
		//LoginPageObjects.pwd.sendKeys(pwd);
	}
	
	@When("user enter {string} in input password textbox")
	public void user_enter_in_input_box2(String pwd) throws Throwable {
	
		LoginPageObjects.pwd.sendKeys(pwd);
	}
	
	

	@When("^user click on Login button$")
	public void user_click_on_Login_button() throws Throwable {
		LoginPageObjects.login_Btn.click();

	}
	
	@Then("validate user icon is present in page")
	public void validate_user_icon_is_present_in_page() {
	    
		Assert.assertTrue(driver.findElement(By.xpath("//div[@data-label='USER_PROFILE_DROPDOWN']/i")).isDisplayed());
	}

}
