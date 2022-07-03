package generics;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class Excel {

	
	public static String getcelldata(String Xlpath,String sheet,int row,int cell)
	{
		String v="";
		try {
			FileInputStream fis=new FileInputStream(Xlpath);
				Workbook wb=WorkbookFactory.create(fis);
				v=wb.getSheet(sheet).getRow(row).getCell(cell).toString();
			} catch (EncryptedDocumentException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		return v;
		
		}
		
	
	public static int getrownum(String xlpath,String sheet) throws Exception, Exception
	{
		 int rc = 0;
		try {
			FileInputStream fis = new FileInputStream(xlpath);
			Workbook wb=WorkbookFactory.create(fis);
			rc=wb.getSheet(sheet).getLastRowNum();
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return rc;
	}
	
	}

