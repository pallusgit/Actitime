package com.actitime.generic;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class FileUtility {
public String readDataFromProperty(String key) throws IOException {
	FileInputStream fis = new FileInputStream("./data/commondata.properties");
	Properties pobj = new Properties();
	pobj.load(fis);
	String data = pobj.getProperty(key);
	return data;
}
public String readDataFromExcel(String sheetName,int row,int cell) throws EncryptedDocumentException, IOException {
	FileInputStream fis = new FileInputStream("./data/testscript.xlsx");
	Workbook wb = WorkbookFactory.create(fis);
	String data = wb.getSheet(sheetName).getRow(row).getCell(cell).getStringCellValue();
	return data;
}
}
