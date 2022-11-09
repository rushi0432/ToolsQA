package com.toolsQA.utils;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelReader {

	XSSFWorkbook xssfworkbook;
	FileInputStream fis;
	XSSFSheet sheet;

	public ExcelReader(String path, String sheetname) throws IOException {

		fis = new FileInputStream(new File(path));
		xssfworkbook = new XSSFWorkbook(fis);
		sheet = xssfworkbook.getSheet(sheetname);
	}

	public int numberofrowsinexcel() {
		return sheet.getLastRowNum();
	}

	public int numberofcoloumsinexcel() {
		return sheet.getRow(0).getLastCellNum();
	}

//	public List<String> getdatafromrow(int rownum) {
//		List<String> list = new ArrayList();
//		Row row = sheet.getRow(rownum);
//		for (int i = 0; i < row.getLastCellNum(); i++) {
//			String data = row.getCell(i).toString();
//			list.add(data);
//		}
//		return list;
//	}

	public Object[][] getAllData() {
		int rowCount = sheet.getPhysicalNumberOfRows();
		int colCount = sheet.getRow(0).getPhysicalNumberOfCells();
		Object[][] obj = new Object[rowCount - 1][this.numberofcoloumsinexcel()];

		for (int i = 1; i < rowCount; i++) {
			Row row1 = sheet.getRow(i);
			for (int j = 0; j < colCount; j++) {
				switch (row1.getCell(j).getCellType()) {
				case NUMERIC:
					double d1 = row1.getCell(j).getNumericCellValue();
					int value = (int) Math.round(d1);
					obj[i - 1][j] = value;
					break;
				case STRING:
					obj[i - 1][j] = row1.getCell(j).getStringCellValue();
					break;
				}
			}
		}

		return obj;
	}
}
