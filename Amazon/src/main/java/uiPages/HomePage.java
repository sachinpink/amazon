package uiPages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import base.TestBase;

public class HomePage extends TestBase
{
    WebDriver driver;
	public HomePage(WebDriver driver)
	{
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath="//span[contains(text(),'Hello.')]")
	WebElement HellosignIN;
	
	@FindBy(xpath="//a[contains(text(),'Start here')]")
	WebElement statHereLink;
	
	@FindBy(xpath="//input[@id='twotabsearchtextbox']")
	WebElement Searchlink;
	
	@FindBy(xpath="//input[@class='nav-input' and @type='submit']")
	WebElement Searchlinkfiled;
	
	@FindBy(xpath="//*[@id='nav-link-accountList']/span[2]")
	WebElement demo;
	
	public void clickOnSignIn()
	{
		/*Actions act= new Actions(driver);
		act.moveToElement(HellosignIN).perform();
*/
		demo.click();
	}

}
