package utilities;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class excelWriter {

	public static void writeData(int rc,int j,String data) throws Exception {
		// TODO Auto-generated method stub
		
		String path="C:\\Users\\vulis\\eclipse-workspace\\TestNGProject\\testData\\Reports.xlsx";
		
		FileInputStream fs=new FileInputStream(path);
		
		XSSFWorkbook wb=new XSSFWorkbook(fs);
		
		XSSFSheet sh=wb.getSheetAt(0);
		
		int lastRow=sh.getLastRowNum();
		
		for(int i=1;i<=lastRow;i++) {
			
			Row r=sh.getRow(rc);
			
			Cell c=r.createCell(j);
			
			c.setCellValue(data);
			
			System.out.println(data);
		}
		
		FileOutputStream fos=new FileOutputStream(path);
		
		wb.write(fos);
		
		fos.close();
		
		
	}

}
