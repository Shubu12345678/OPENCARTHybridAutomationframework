package utilities;

import java.io.IOException;

import org.testng.annotations.DataProvider;

public class DataProviders {
	
	
	@DataProvider(name="LoginData")
	public String [][] getData() throws IOException
	{
		String path =".\\testData\\Opencart_LoginData.xlsx";//taking xl file from loc
		
		ExcelUtility xlutil= new ExcelUtility(path);
		
		int totalrows=xlutil.getRowcount("Sheet1");
		int totalcol= xlutil.getCellcount("Sheet1", 1);
		
		String logindata[][] = new String[totalrows][totalcol];
		
		for(int i=1;i<=totalrows;i++) {
			for(int j=0;j<totalcol;j++) {
				
				logindata[i-1][j]= xlutil.getCelldata("Sheet1", i, j);
				
			}
		}
		return logindata;//returning two dimension array
		
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

}
