package test;

import java.awt.AWTException;
import java.awt.Robot;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

import pom.ActitimeHomePage;
import pom.ActitimeLoginPage;
import pom.EditCustomer;

public class ActitimeEditCustomerTest {

	@Test
	public void editcustomerMethod() throws InterruptedException, AWTException {
		System.setProperty("webdriver.chrome.driver", "E:/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://online.actitime.com/rategain");

		ActitimeLoginPage login = new ActitimeLoginPage(driver);
		login.loginMethod();

		EditCustomer customer = new EditCustomer(driver);
		customer.editcustomerMethod(driver);

		ActitimeHomePage logout = new ActitimeHomePage(driver);
		logout.logoutMethod();
	}
}
