package com.actitime.GenericLiabrary;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class Fileliabrary {

	public String readDataFromExcel(String sheetname, int row, int cell) throws IOException {
		FileInputStream fis =new FileInputStream("./Testdata/Testdata1.xlsx");
		Workbook wb=WorkbookFactory.create(fis);
		  String data = wb.getSheet(sheetname).getRow(row).getCell(cell).getStringCellValue();
		 return data;
	}
	
	
}
