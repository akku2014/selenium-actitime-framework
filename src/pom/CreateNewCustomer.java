package pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class CreateNewCustomer {

	@FindBy(xpath = "(//span[.='Tasks'])[2]")
	private WebElement task;

	@FindBy(xpath = "//div[@class=\"addNewButton\"]")
	private WebElement addnewButton;

	@FindBy(xpath = "//div[.='New Customer']")
	private WebElement newCustomer;

	@FindBy(xpath = "(//input[@placeholder=\"Enter Customer Name\"])[2]")
	private WebElement entercustomerName;

	@FindBy(xpath = "//div[.='Create Customer']")
	private WebElement createCustomer;

	public CreateNewCustomer(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}

	public void createMethod(WebDriver driver) {
		WebDriverWait wait = new WebDriverWait(driver, 10);
		wait.until(ExpectedConditions.elementToBeClickable(task)).click();

		addnewButton.click();
		newCustomer.click();
		entercustomerName.sendKeys("anisha");
		createCustomer.click();
	}
}
