package pageobjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class LoginPageObjects extends BaseClass {

	public LoginPageObjects(WebDriver driver) {
		super(driver);
	}
	
	@FindBy(css = "i[class*=ham-Icon]")
	public static WebElement ham_icon;
	
	@FindBy(css = ".mmWrap")
	public static WebElement login;
	
	@FindBy(css = "input[name='username']")
	public static WebElement uname;
	
	@FindBy(xpath="//a[text()='Continue']")
	public static WebElement continueBtn;
	
	@FindBy(css = "input[name='password']")
	public static WebElement pwd;

   @FindBy(xpath = "//a[text()='Login' and @id='loginSubmit']")
	public static WebElement login_Btn;
	
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
