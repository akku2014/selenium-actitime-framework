package pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CreateNewCustomer {

	@FindBy(xpath="//a[.='Tasks']")
	private WebElement task;

	@FindBy(xpath="//div[@class=\"addNewButton\"]")
	private WebElement addnewButton;

	@FindBy(xpath = "//div[.='New Customer']")
	private WebElement newCustomer;

	@FindBy(xpath="(//input[@placeholder=\"Enter Customer Name\"])[2]")
	private WebElement entercustomerName;

	@FindBy(xpath="//div[.='Create Customer']")
	private WebElement createCustomer;

	public CreateNewCustomer(WebDriver driver) {
		PageFactory.initElements(driver,this);
	}
	public void createMethod() {
		task.click();
		addnewButton.click();
		newCustomer.click();

		createCustomer.click();
	}
}


