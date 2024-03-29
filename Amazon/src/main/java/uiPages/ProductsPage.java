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
	
	public productDetailsPage selectProduct()
    {
    	driver.findElement(By.xpath("//img[starts-with(@alt,'Samsung')]")).click();
    	//  //img[contains(@alt,'Samsung')]
       	return new productDetailsPage(driver);
    }

}
