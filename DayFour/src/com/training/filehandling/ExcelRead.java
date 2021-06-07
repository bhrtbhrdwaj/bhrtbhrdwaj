package com.training.filehandling;
import java.io.FileInputStream;

import org.apache.poi.hssf.usermodel.HSSFSheet;
import org.apache.poi.hssf.usermodel.HSSFWorkbook; 
public class ExcelRead {
public static void main(String... args) {
	try {
		FileInputStream inFile = new FileInputStream("sheetx.xlsx");
		HSSFWorkbook wb=new HSSFWorkbook(inFile);
		HSSFSheet sheet = wb.getSheetAt(0);
		
		System.out.println(sheet);

	}catch(Exception e) {System.out.println(e.getMessage());}
}
}

