package javapackage;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ReadingExcel {

	public static void main(String[] args) throws Exception {
		
		//Specify the location of excel file
		File src = new File("D:\\selenium\\Demo.xlsx");
		//Load file
		FileInputStream fis = new FileInputStream(src);
		
		//Load workbook
		XSSFWorkbook wb = new XSSFWorkbook(fis);
		
		//Load Worksheet
		XSSFSheet sh = wb.getSheet("DemoSheet");
		
		//Get the name of the loaded sheet
		System.out.println(sh.getSheetName());
		
		//Print username from excel sheet
		System.out.println(sh.getRow(0).getCell(0).getStringCellValue());
		
		//print p2 from excel sheet
		System.out.println(sh.getRow(2).getCell(1).getStringCellValue());
		
		//print total number of rows-1 st way
		System.out.println("Total No of rows:- "+sh.getPhysicalNumberOfRows());
		
		//print total number of rows-2nd way
		System.out.println(sh.getLastRowNum());//Here index will work and output = 5
		System.out.println(sh.getFirstRowNum());//Here index will work and output = 0
		//int rows = sh.getLastRowNum()+1;
		int rows = sh.getLastRowNum()-sh.getFirstRowNum();//output =5-0 =5
		System.out.println("Total rows:-"+(rows+1));//Output:-5+1=6
		
		//print total number of rows -3 rd way
		System.out.println(sh.getLastRowNum()+1);//5+1=6//Index basis
		
		//Print total number of columns - 1st way
		System.out.println(sh.getRow(0).getPhysicalNumberOfCells());
		
		//Print total number of columns - 2nd way
		System.out.println(sh.getRow(0).getLastCellNum());
		
		//Print total number of columns - 3rd way
		int columns = sh.getRow(0).getLastCellNum();
		System.out.println("Total columns:-"+columns);
		
		//Print all cells of excel sheet
		for(int i = 0; i<=rows;i++) {
			for(int j = 0;j<columns;j++) {
				System.out.println(sh.getRow(i).getCell(j).getStringCellValue());
			}
		}

	}

}
