package pageobjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class RegisterPageObjects extends BaseClass {

	public RegisterPageObjects(WebDriver driver) {
		super(driver);
	}
	
	@FindBy(xpath = "//div[@data-label='HAMBURGER']/div/i")
	public static WebElement ham_icon;
	
	@FindBy(xpath = "//i/following-sibling::div[text()='LOGIN / REGISTER']")
	public static WebElement login;
	
	@FindBy(css = "input[valtype='name']")
	public static WebElement name;
	
	@FindBy(css = "input[valtype='email']")
	public static WebElement email;

	@FindBy(css = "input[valtype='password']")
	public static WebElement pwd;
	
	@FindBy(css = " input[valtype='mobile']")
	public static WebElement ph_no; 

	@FindBy(css = "input[id='submitform1']")
	public static WebElement reg_Btn;
	
	@FindBy(xpath = "(//span[contains(@class,'passShow')])[1]")
	public static WebElement show_Btn;
	
	@FindBy(xpath = "(//span[contains(@class,'passShow')])[1]")
	public static WebElement hide_Btn;

	
	
}






	/*@FindBys(@FindBy(css = ".cc03-primary-navigation li"))
	public static List<WebElement> verifyMenuLinks;
	
	
	@FindBy(how = How.CSS, using = ".cc03-primary-navigation__search-btn")
	public static WebElement search_btn;
	
	@FindBy(how = How.CSS, using = "input[name='q']")
	public static WebElement text_box;

	@FindBys(@FindBy(css = ".uc02-footer li a"))
	public static List<WebElement> footerLinks;
	
	@FindBys(@FindBy(css = ".cm13-industry-segmentation__list li"))
	public static List<WebElement> header_Links;
	
	@FindBys(@FindBy(css = ".uc02-footer__links--sublist"))
	public static List<WebElement> entertainment_subLinks;
	
	
	
	@FindBy(how = How.CSS, using = ".cc37-offcanvas-toggle")
	public static WebElement toggle_btn;
	
	@FindBy(how = How.CSS, using = ".cc24-hamburger-btn")
	public static WebElement mobiletoggle_btn;
	
	
	
	

	@FindBy(how = How.XPATH, using = "//a[contains(text(),'FAQs ')]")
	public static WebElement faqsDropDown;

	@FindBys(@FindBy(xpath = "//a[contains(text(),'FAQs ')]/following-sibling::ul[1]/li"))
	public static List<WebElement> verifyFaqLinks;

	@FindBy(how = How.CLASS_NAME, using = "navbar-toggle")
	public static WebElement mobilemenu;

}*/
