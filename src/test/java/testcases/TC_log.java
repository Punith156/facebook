package testcases;

import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.Test;

import com.relevantcodes.extentreports.LogStatus;

import POM.Loginpage;

public class TC_log extends Baseclass{
	@Test
	public void enterlogindata() throws Exception
	{
		test.log(LogStatus.INFO, "test enter login data is started");
		Loginpage p=new Loginpage(driver);
		p.enterusername("punithm156@gmail.com");
		Thread.sleep(10000);
		RemoteWebDriver r=((RemoteWebDriver)driver);
		String c="document.getElementById('pass').value='1234'";
		r.executeScript(c);
		Thread.sleep(10000);
		p.loginfb();
		test.log(LogStatus.PASS, "test pass");

}
}