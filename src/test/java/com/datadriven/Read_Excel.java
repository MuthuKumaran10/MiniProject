package com.datadriven;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class Read_Excel {
	
	public static void main(String[] args) throws IOException {
		
		File f = new File("C:\\Users\\Muthu\\Desktop\\Data.xlsx");
		
		FileInputStream fis = new FileInputStream(f);
		
		XSSFWorkbook wb = new XSSFWorkbook(fis);
		
		Sheet sheetAt = wb.getSheet("New");
		
		Row row = sheetAt.getRow(1);
		
		Cell cell = row.getCell(0);
		
		CellType cellType = cell.getCellType();
		
		if (cellType.equals(cellType.STRING)) {
			
			String stringCellValue = cell.getStringCellValue();
			
			System.out.println("String Value: "+stringCellValue);
			
						
		}
		
		else if (cellType.equals(cellType.NUMERIC)) {
			
			double numericCellValue = cell.getNumericCellValue();
			
			System.out.println("Numeric Vaule: "+numericCellValue);
			
		}
		
		int no_rows = sheetAt.getPhysicalNumberOfRows();
		
		System.out.println("Number of Rows: "+no_rows);
		
		for (int i = 0; i < no_rows; i++) {
			
			Row row2 = sheetAt.getRow(i);
			
			int Cell_cnt = row2.getPhysicalNumberOfCells();
			
			for (int j = 0; j < Cell_cnt; j++) {
				
				Cell cell2 = row2.getCell(j);
				
				String stringCellValue = cell2.getStringCellValue();
				
				System.out.print(stringCellValue+ " ");
				
			}
			
			System.out.println();
			
		}
	}

	
	
	
	
}
