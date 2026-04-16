package pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class EditCustomer {

	@FindBy(xpath = "(//span[.='Tasks'])[2]")
	private WebElement task;

	@FindBy(xpath = "//div[@class='text' and text()='manish']/ancestor::div[contains(@class,'customerNode')]//div[@class='editButton']")
	private WebElement customerSettings;

	@FindBy(xpath = "//textarea[@placeholder='Enter customer description...']")
	private WebElement element;

	public EditCustomer(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}

	public void editcustomerMethod(WebDriver driver) {
		WebDriverWait wait = new WebDriverWait(driver, 20);
		Actions act = new Actions(driver);
	

		wait.until(ExpectedConditions.elementToBeClickable(task)).click();
		act.moveToElement(customerSettings).perform();

		wait.until(ExpectedConditions.elementToBeClickable(customerSettings)).click();

		WebElement desc = wait.until(ExpectedConditions.visibilityOf(element));
		desc.sendKeys("source of income");

	}

}
