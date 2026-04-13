package pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ActitimeLoginPage {

	@FindBy(id="username")
	private WebElement usernameTextfield;

	@FindBy(xpath="//input[@name=\"pwd\"]")
	private WebElement passwordTextfield;

	@FindBy(id="keepLoggedInCheckBox")
	private WebElement keepLoggedInCheckBox;

	@FindBy(xpath="//div[.='Login ']")
	private WebElement loginButton;

	@FindBy(xpath = "//a[.='Forgot your password?']")
	private WebElement forgotyourPassword;
	
	@FindBy(xpath="//a[.='actiTIME Inc.']")
	private WebElement actitimeLink;

	public ActitimeLoginPage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}

	public void loginMethod() throws InterruptedException {
		usernameTextfield.sendKeys("badalgautam86@gmail.com");
		passwordTextfield.sendKeys("!Akajyo@1");
		keepLoggedInCheckBox.click();
		loginButton.click();
	}
	
	public void forgotyourpasswordMethod() {
		forgotyourPassword.click();
	}

	public void actitimelinkMethod() {
		actitimeLink.click();
	}
}
