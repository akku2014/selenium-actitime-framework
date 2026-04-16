package test;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

import pom.ActitimeHomePage;
import pom.ActitimeLoginPage;
import pom.CreateNewCustomer;

public class CreateNewCustomerTest {

	@Test
	public void createnewcustomerTest() throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "E:/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		driver.get("https://online.actitime.com/rategain/login.do");

		ActitimeLoginPage login = new ActitimeLoginPage(driver);
		login.loginMethod();

		CreateNewCustomer customer = new CreateNewCustomer(driver);
		customer.createMethod(driver);

		ActitimeHomePage logout = new ActitimeHomePage(driver);
		logout.logoutMethod();

	}

}
