package pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ActitimeHomePage {

	/*@FindBy(xpath = "//a[.='Tasks']")
	private WebElement task;*/

	@FindBy(xpath = "(//div[.='AG'])[2]")
	private WebElement profileButton;

	@FindBy(xpath = "//div[.='Logout']")
	private WebElement logoutButton;

	public ActitimeHomePage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}

	public void logoutMethod() {
		profileButton.click();
		logoutButton.click();
	}

}
