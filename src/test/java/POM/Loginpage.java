package POM;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Reporter;

public class Loginpage {
	@FindBy(xpath="//input[@id=\"email\"]")
	private WebElement username;
	
	@FindBy(xpath="//div[@id=\"passContainer\"]")
	private WebElement passw;
	
	@FindBy(xpath="//button[@name='login']")
	private WebElement logn;
	
	public  Loginpage(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	
	
	public void enterusername(String email)
	{
		username.sendKeys(email);
	}

	public void enterpass(String pass)
	{
		passw.sendKeys(pass);
	}
	
	public void loginfb()
	{
		logn.click();
		Reporter.log("test passed");
	}

}
