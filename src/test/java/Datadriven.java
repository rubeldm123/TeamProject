import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class Datadriven {

	public static void main(String[] args) throws IOException {
		
		File src=new File("C:\\Users\\mrubel\\Documents\\work\\git\\TeamProject\\Book1.xlsx");
		
		FileInputStream fis=new FileInputStream(src);
		
		XSSFWorkbook wb=new XSSFWorkbook(fis);
		XSSFSheet sheet= wb.getSheet("Sheet1");
		int row=sheet.getLastRowNum();
		int colcount=sheet.getRow(0).getLastCellNum();
		
		//System.out.println("Total Row: " + row);
		//System.out.println("Total Column: "+ colcount);
		
		for (int r=0; r<=row;r++) {
			XSSFRow rowa=sheet.getRow(r);
			
			for(int c=0;c<colcount; c++) {
				XSSFCell cell=rowa.getCell(c);
				cell.toString();
				String value=cell.toString();
				System.out.println(value + " ");		
				
			}//end of inner
			
			System.out.println();
		}//end of outer loop
		
		
		

	}

}
