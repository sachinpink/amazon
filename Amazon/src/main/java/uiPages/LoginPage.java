package uiPages;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import base.TestBase;

public class LoginPage extends TestBase
{
    WebDriver driver;
	public LoginPage(WebDriver driver)
	{
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath="//*[contains(text(),'Account & Lists')]")
	WebElement AccountLink;
	
	@FindBy(xpath="//*[@id='nav-link-accountList']")
	WebElement siginInLink;
	
	@FindBy(xpath="//input[@id='ap_email']")
	WebElement emailTxt;
	
	@FindBy(xpath="//input[@id='continue']")
	WebElement ContineBtn;
	
	@FindBy(xpath="//input[@id='ap_password']")
	WebElement passordTxt;
	
	@FindBy(xpath="//input[@id='signInSubmit']")
	WebElement LoginBtn;
	
	public void movetoAccountLink() throws InterruptedException
	{
		Actions act =new Actions(driver);
		Thread.sleep(3000);
		act.moveToElement(AccountLink).build().perform();
		
	}
	public void clickOnSiginIn()
	{
		siginInLink.click();
	}
	public HomePage login(String username,String pass)
	{
		emailTxt.sendKeys(username);
		ContineBtn.click();
		passordTxt.sendKeys(pass);
		LoginBtn.click();
		return new HomePage(driver);	
		
	}
	


}