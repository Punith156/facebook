package utility;

	import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.testng.ITestListener;
import org.testng.ITestResult;

import testcases.Baseclass;


	public class Listeners extends Baseclass implements ITestListener{
		private static final File arg0 = null;
		@Override
		public void onTestStart(ITestResult tr) {
			
			System.out.println("Test Started");
		}
		@Override
	public void onTestSuccess(ITestResult tr) {
			
			System.out.println("Test passed");
		}
		@Override
	public void onTestFailure(ITestResult tr) {
			TakesScreenshot ss =((TakesScreenshot)Baseclass.driver);
			File SrcFile=ss.getScreenshotAs(OutputType.FILE);
			File tar=new File(System.getProperty("user.dir")+ "/screenshot/" + tr.getInstanceName()+".png");
			try {
				FileUtils.copyFile(SrcFile, tar);
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		System.out.println("Test failed");
	}
		@Override
	public void onTestSkipped(ITestResult tr) {
		
		System.out.println("Test Skipped");
	}
		

	}


