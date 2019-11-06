package uiPages;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePage 
{
	public WebDriver driver;
	
	public HomePage(WebDriver driver)
	{
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath="//input[@id='twotabsearchtextbox']")
	WebElement searchBox;
		
    public void EnterItemtoSearch()
    {
    	searchBox.sendKeys("mobile");
    	searchBox.sendKeys(Keys.ENTER);
    	
    }
    
    
    
	
}