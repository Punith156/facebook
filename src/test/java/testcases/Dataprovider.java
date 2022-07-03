package testcases;

import org.testng.annotations.DataProvider;

public class Dataprovider {
	@DataProvider(name="logindata")
	public Object[][] getdata(){
		return new Object[][]{{"9141913852"},{"puni@9141"}};

	}
}
