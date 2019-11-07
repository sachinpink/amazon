package uiPages;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePage 
{
    WebDriver driver;
	
	public HomePage(WebDriver driver)
	{
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath="//input[@id='twotabsearchtextbox']") 
	WebElement searchBox;
	
		
    public ProductsPage EnterItemtoSearch(String ProductCatagory)
    {
    	searchBox.sendKeys(ProductCatagory);
    	searchBox.sendKeys(Keys.ENTER);
    	return new ProductsPage(driver);
    	
    }
    
    
    
    
	
}