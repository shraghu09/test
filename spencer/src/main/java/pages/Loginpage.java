package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import generic.Basepage;

public class Loginpage {
	
	@FindBy(xpath="//button[@class='action switch' and @type='button']")
	private WebElement clickforsigninlink;
		
	@FindBy(xpath="(//div[@class='view_my_acount'])[1]")
	private WebElement clocklogin;
	
	
	@FindBy(id="email")
	private WebElement enteremail;
	
	@FindBy(id="pass")
	private WebElement enterpass;
	
	@FindBy(id="bnt-social-login-authentication")
	private WebElement clicksignin;
	
	
	@FindBy(xpath="(//div[@class='col-lg-5 col-md-6 col-sm-6 col-xs-5 no-padding']//child::span[2])[1]")
		private WebElement clickoffer;
		
	
	@FindBy(xpath="(//a[@class='dropdown-toggle level-top ui-corner-all'])[1]")
	private WebElement clickfruitsvegetabes;
	
;
	public Loginpage(WebDriver driver)
	{
	//	super(driver);
	
		PageFactory.initElements(driver, this);

}
	
	public void clicksigninlink()
	{
		clickforsigninlink.click();
	}
	
	public void clicklogin()
	{
		clocklogin.click();
	}
	
	public void enteremail(String un)
	{
		enteremail.sendKeys(un);
	}
	public void enterpass(String pass)
	{
		enterpass.sendKeys(pass);
	}
	
	public void clicksignin()
	{
		clicksignin.click();
	}
	
	public void seloffer()
	{
		clickoffer.click();
	}
	public void selectfruits()
	{
		clickfruitsvegetabes.click();
	}
}