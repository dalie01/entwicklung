package xlsRead;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import org.apache.poi.hssf.usermodel.HSSFCell;
import org.apache.poi.hssf.usermodel.HSSFRow;
import org.apache.poi.hssf.usermodel.HSSFSheet;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.poifs.filesystem.POIFSFileSystem;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.FormulaEvaluator;

public class Main {

	public static void main(String[] args) {
		
		String fileName = System.getProperty("user.dir") + "\\xlsRead\\RoamingDB.xls";
	
		try {
			HSSFWorkbook wb = readFile(fileName);
			
			List<HSSFSheet> sheets = determineSheet(wb);
			for (HSSFSheet hssfSheet : sheets) {
				List<HSSFRow> rows = determineRows(hssfSheet);
			
				for (HSSFRow hssfRow : rows) {
					List<HSSFCell> cells = determineCells(hssfRow);
					System.out.println("Row: " + hssfRow.getRowNum() + " Col " + cells.size());
					for (HSSFCell hssfCell : cells) {
						String value = determineCellValue(hssfCell);
						if(value != null && value.length() > 0){
							System.out.println("Table: " + hssfCell.getSheet().getSheetName() + " Row: " + hssfCell.getRowIndex() + " Col: " + hssfCell.getColumnIndex()+ " Value: " + value );
						}
					}//for Cell
				}//for Row
			}//for Sheet
		} catch (IOException e) {
			System.out.println(e.getMessage());
		}
		
	}//main
	
	/**
	 * read the File 
	 * @param filename String
	 * 
	 * @return HSSFWorkbook 
	 * */
	private static HSSFWorkbook readFile(String fileName) throws IOException {
        POIFSFileSystem myFileSystem = new POIFSFileSystem(new FileInputStream(fileName));
		return new HSSFWorkbook(myFileSystem);
	}//readFile
	
	/**
	 * determine Sheet of Workbook
	 * @param wb HSSFWorkbook
	 * 
	 * @return allSheets List<HSSFSheet>
	 * */
	private static List<HSSFSheet> determineSheet(HSSFWorkbook wb){
		List<HSSFSheet> allSheets = new ArrayList<HSSFSheet>();
		for (int i = 0; i < wb.getNumberOfSheets(); i++) {
			allSheets.add(wb.getSheetAt(i));
			
		}
		return allSheets;
	}//determineSheet
	/**
	 * determine FormalEvaluator
	 * @param wb HSSFWorkbook
	 * 
	 * @return FormalaEvaluator
	 * */
	private static FormulaEvaluator determineFormulaEvaluator(HSSFWorkbook wb){
		return wb.getCreationHelper().createFormulaEvaluator();
	}//determineFormulaEvaluator
	/**
	 * determine all Rows in a HSSFSheet
	 * @param sheet HSSFSheet
	 * 
	 * @return allRows List<HSSFRow> of all Rows 
	 * */
	private static List<HSSFRow> determineRows(HSSFSheet sheet){
		System.out.println("Name of Table:" + sheet.getSheetName());
		List<HSSFRow> allRows = new ArrayList<HSSFRow>();
		int rows = sheet.getPhysicalNumberOfRows();
		for (int i = 0; i < rows; i++) {
			HSSFRow row = sheet.getRow(i);
			if (row == null) {
				continue;
			}
			allRows.add(sheet.getRow(i));
			
		}
		return allRows;
	}
	/**
	 * determine all Cells in a Row
	 * @param row All Rows of Sheet
	 * 
	 * @return allCells List<HSSFCell> of all HSSFCell
	 * */
	private static List<HSSFCell> determineCells(HSSFRow row){
		List<HSSFCell> allCells = new ArrayList<HSSFCell>();
		int cells = 255;
		System.out.println("Anzahl Cellen"+ cells);
		for (int i = 0; i < cells; i++) {
			allCells.add(row.getCell(i));
			
		}
		return allCells;
	}
	 /**
     * determine Value of Cell
     * @param cell ExcelCell
     * 
     * @return value of String
     */
	private static String determineCellValue(HSSFCell cell){
		
	try{
		if(cell != null)
		switch (cell.getCellType()) {
		
		case Cell.CELL_TYPE_FORMULA:
			return Double.toString(cell.getNumericCellValue());
		case Cell.CELL_TYPE_NUMERIC:
			return Double.toString(cell.getNumericCellValue());
		case Cell.CELL_TYPE_STRING:
			return cell.getStringCellValue();
		case Cell.CELL_TYPE_BOOLEAN:
		    return Boolean.toString(cell.getBooleanCellValue());
		case Cell.CELL_TYPE_BLANK:
		    return "";
		}
		}catch(Exception e){
			System.out.println("determineCellValue:" +  e.getMessage());
		}
		
		return "";
	}//determineCellValue
}//class Main
