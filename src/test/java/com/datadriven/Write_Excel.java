package com.datadriven;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class Write_Excel {
	
	public static void main(String[] args) throws IOException {
		
		File f = new File("C:\\Users\\Muthu\\Desktop\\Data.xlsx");
		
		FileInputStream fis = new FileInputStream(f);
		
		Workbook wb = new XSSFWorkbook();
		
		Sheet createSheet = wb.createSheet("New");
		
		Row createRow = createSheet.createRow(0);
		
		Cell createCell = createRow.createCell(0);
		
		createCell.setCellValue("UserName");
		
		wb.getSheet("New").createRow(1);
		
		wb.getSheet("New").createRow(2);
		
		wb.getSheet("New").getRow(1).createCell(0).setCellValue("Muthu");
		
		wb.getSheet("New").getRow(2).createCell(0).setCellValue("Kumaran");
		
		FileOutputStream fos = new FileOutputStream(f);
		
		wb.write(fos);
		
		System.out.println("Data is Inserted");
		
		
	}

}
