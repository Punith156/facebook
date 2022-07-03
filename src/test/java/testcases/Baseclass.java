package testcases;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;

import POM.Loginpage;
import utility.configproperties;

public class Baseclass {
	public static WebDriver driver;
	configproperties conf=new configproperties();
	
	public String Url=conf.geturl();
	static ExtentReports report;
	static ExtentTest test;
		
	@BeforeMethod
	public void precondition()
	{

		System.setProperty("webdriver.chrome.driver","C:\\Asessment\\facebook\\Drivers\\chromedriver.exe");
		ChromeOptions q = new ChromeOptions();
		q.addArguments("--disable-notifications");
		driver=new ChromeDriver();
		report=new ExtentReports("C:\\Asessment\\facebook\\reports\\report.html",true);
		test=report.startTest("Extent report for fb");
		
		driver.get(Url);
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
	}
	
	
	@AfterMethod
	public void postcondition()
	{
		driver.quit();
		report.endTest(test);
		report.flush();
	}
	

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
