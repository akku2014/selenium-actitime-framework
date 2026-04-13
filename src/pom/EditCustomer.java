package pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class EditCustomer {

	@FindBy(xpath = "//a[.='Tasks']")
	private WebElement task;

	@FindBy(xpath = "(//div[.='Ambi'])[1]")
	private WebElement customerName;

	@FindBy(xpath = "(//div[@class=\"editButton\"])[18]")
	private WebElement customerSettings;

	@FindBy(xpath = "//textarea[@placeholder=\"Enter customer description...\"]")
	private WebElement description;

	public EditCustomer(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}

	public void editcustomerMethod() throws InterruptedException {
		task.click();
		customerName.click();
		customerSettings.click();
		description.sendKeys("Ambi is a sincere student");
	}

}
