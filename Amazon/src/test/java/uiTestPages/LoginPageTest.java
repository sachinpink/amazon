package uiTestPages;


import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import base.TestBase;
import uiPages.HomePage;
import uiPages.LoginPage;

public class LoginPageTest extends TestBase
{
	LoginPage page;
	HomePage hpage;
	@Test(dataProvider="loginData")
	public void login(String userName,String pass) throws InterruptedException
	{
		page=new LoginPage(driver);
		page.movetoAccountLink();
		page.clickOnSiginIn();
	}
	
	@DataProvider(name="loginData")
	public Object[][] getData()
	{
		Object data[][]=new Object[1][2];
		data[0][0]="sachinzagade59@gmail.com";
		data[0][1]="9172362161";
		return data;
		
	}

}
