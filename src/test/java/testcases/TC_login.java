package testcases;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

import com.relevantcodes.extentreports.LogStatus;

import POM.Loginpage;

public class TC_login extends Baseclass{
	
	@Test
	public void enterlogindata() throws Exception
	{
		test.log(LogStatus.INFO, "test enter login data is started");
		Loginpage p=new Loginpage(driver);
		p.enterusername("9141913852");
		RemoteWebDriver r=((RemoteWebDriver)driver);
		String c="document.getElementById('pass').value='Public'";
		r.executeScript(c);
		p.loginfb();

		
		WebElement we=driver.findElement(By.xpath("driver.findElement(By.xpath("//*[@id="mount_0_0_8p"]/div/div[1]/div/div[1]/div[1]/div/div[1]/span/div/div[2]/div/svg/g/image")).click();
				+ ""));

		WebDriverWait wait=new WebDriverWait(driver,20);
		
		wait.until(ExpectedConditions.visibilityOf(we));
		test.log(LogStatus.PASS, "test pass");

	}

	
}


