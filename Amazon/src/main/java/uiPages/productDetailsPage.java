package uiPages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class productDetailsPage 
{
	WebDriver driver;
		
		public productDetailsPage(WebDriver driver)
		{
			this.driver=driver;
			PageFactory.initElements(driver, this);
		}
		
		@FindBy(xpath="//button[contains(@class,'addToCart')]")
		WebElement addtocardBtn;
		
		@FindBy(xpath="//a[@id='nav-cart']")
		WebElement yourCard;
		
		@FindBy(xpath="//input[@value='Delete']")
		WebElement deleteFromcart;
		
		public void addToCart()
		{
			addtocardBtn.click();
			System.out.println("clicked on add to card button");
		}
		
		public void yourCard()
		{
			yourCard.click();
			System.out.println("clicked on card ");
		}
		public void deleteItemFromcart()
		{
			deleteFromcart.click();
			System.out.println("clicked on delete item from card ");
		}
		

	}


