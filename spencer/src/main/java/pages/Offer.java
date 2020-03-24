package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import generic.Basepage;

public class Offer extends Basepage {
	
	
	
	@FindBy(xpath="(//button[@title='Add to Cart'])[1]")
	private WebElement clickoffer1;
	
	public Offer(WebDriver driver)
	{
		super(driver);
		PageFactory.initElements(driver, this);
	}
	
	
	public void clickoffer1()
	{
		clickoffer1.click();
	}

}
