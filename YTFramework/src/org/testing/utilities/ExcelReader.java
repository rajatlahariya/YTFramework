package org.testing.utilities;

import java.io.File;
import java.io.IOException;

import jxl.*;
import jxl.read.biff.BiffException;

public class ExcelReader {
	
	public File f;
	public Workbook wk;
	public ExcelReader(String address) throws BiffException, IOException {
		f=new File(address);
		wk=Workbook.getWorkbook(f);
	}
	
	public String read(int sheetno,int c,int r) throws BiffException, IOException {
	 
		
		Sheet s=wk.getSheet(sheetno);
		Cell c1=s.getCell(r, c);
		String data=c1.getContents();
		return data;
	}
	
	public int readrow(int sheetno) throws BiffException, IOException {
		Sheet s=wk.getSheet(sheetno);
		int row=s.getRows();
		return row;
	}
	
	public int readcol(int sheetno) throws BiffException, IOException {
		Sheet s=wk.getSheet(sheetno);
		int col=s.getColumns();
		return col;
	}
	
	
	
	
	
	
	
}
