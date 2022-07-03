package testcases;

import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.Test;

import POM.Loginpage;
import generics.Excel;

public class Tc_03 extends Baseclass{

	@Test
	public void excellogin() throws Exception
	{
		String Xlpath="C:\\Asessment\\facebook\\testdata\\Book1.xlsx";
		String sheet="sheet1";
		String un=Excel.getcelldata(Xlpath, sheet, 1, 1);
	Loginpage p=new Loginpage(driver);
	p.enterusername(un);
	Thread.sleep(10000);
	RemoteWebDriver r=((RemoteWebDriver)driver);
	String c="document.getElementById('pass').value='1234'";
	r.executeScript(c);
	Thread.sleep(10000);
	p.loginfb();
}
}