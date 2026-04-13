package test;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import pom.ActitimeHomePage;
import pom.ActitimeLoginPage;

public class ActitimeTest {
      @Test
      public void loginMethod() throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "E:/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
        driver.manage().window().maximize();
        driver.get("https://online.actitime.com/rategain/login.do");
        
        ActitimeLoginPage login=new ActitimeLoginPage(driver);
        login.loginMethod();
        
        ActitimeHomePage logout=new ActitimeHomePage(driver);
        logout.logoutMethod();
	}
}
