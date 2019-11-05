package uiTestPages;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

import base.TestBase;
import uiPages.HomePage;

public class RegistrationPageTest extends TestBase
{
	public WebDriver driver;
	HomePage page;
	@Test
	public void registration() throws InterruptedException
	{
		page=new HomePage(driver);
		Thread.sleep(5000);
		page.clickOnSignIn();
		
	}

}
