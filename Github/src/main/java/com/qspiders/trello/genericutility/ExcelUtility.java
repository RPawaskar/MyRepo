package com.qspiders.trello.genericutility;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
/**
 * This Class will be used to read the data from Excel
 * @author SCSE15
 *
 */
public class ExcelUtility {
/**
 * This method will be used to read the String data from the excel workbook.
 * @param sheetName
 * @param rowIndex
 * @param cellIndex
 * @author rohan
 * @return StringCellValue
 * @throws EncryptedDocumentException
 * @throws IOException
 */
	public String readStringData(String sheetName, int rowIndex, int cellIndex) throws EncryptedDocumentException, IOException {
		FileInputStream fis=new FileInputStream("./src/test/resources/trellodata.xlsx");
		Workbook workbook = WorkbookFactory.create(fis);
		String value = workbook.getSheet(sheetName).getRow(rowIndex).getCell(cellIndex).getStringCellValue();
		workbook.close();
		return value;
	}
	/**
	 * This method will be used to read the numeric data from the excel workbook
	 * @param sheetName
	 * @param rowIndex
	 * @author Anil
	 * @param cellIndex
	 * @return numericCellData
	 * @throws EncryptedDocumentException
	 * @throws IOException
	 */
	public double readNumericData(String sheetName, int rowIndex, int cellIndex) throws EncryptedDocumentException, IOException {
		FileInputStream fis=new FileInputStream("./src/test/resources/trellodata.xlsx");
		Workbook workbook = WorkbookFactory.create(fis);
		double value = workbook.getSheet(sheetName).getRow(rowIndex).getCell(cellIndex).getNumericCellValue();
		workbook.close();
		return value;
	}
}
