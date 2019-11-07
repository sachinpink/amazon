package uiPages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

import base.TestBase;

public class ProductsPage extends TestBase
{
	WebDriver driver;
	
	public ProductsPage(WebDriver driver)
	{
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	
	public void selectProduct(String productName)
    {
    	driver.findElement(By.xpath("//img[starts-with(@alt,'"+productName+"')]]")).click();
    	
    }

}
