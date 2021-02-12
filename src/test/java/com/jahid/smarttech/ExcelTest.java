package com.jahid.smarttech;

import java.io.File;  
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;  
import org.apache.poi.hssf.usermodel.HSSFSheet;  
import org.apache.poi.hssf.usermodel.HSSFWorkbook;  
import org.apache.poi.ss.usermodel.Cell;  
import org.apache.poi.ss.usermodel.FormulaEvaluator;  
import org.apache.poi.ss.usermodel.Row; 

public class ExcelTest {
	
	public static void main(String[] args) throws Throwable  {
		//obtaining input bytes from a file  
		
		FileInputStream fis=new FileInputStream(new File("C:\\Users\\Inayah\\Desktop\\BatchNineNew.xls"));
		HSSFWorkbook wb=new HSSFWorkbook(fis);
		HSSFSheet sheet=wb.getSheetAt(0);
		
		String value= sheet.getRow(0).getCell(0).getStringCellValue();
		
		System.out.println(value);
		
		sheet.getRow(3).getCell(0).setCellValue("Sarower");
		FileOutputStream fso= new FileOutputStream("C:\\Users\\Inayah\\Desktop\\BatchNineNew.xls");
		wb.write(fso);
		
		String value2= sheet.getRow(3).getCell(0).getStringCellValue();
		
		System.out.println(value2);
	}
		}  