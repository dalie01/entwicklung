package xlsRead;

import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.apache.poi.hssf.usermodel.HSSFCell;
import org.apache.poi.hssf.usermodel.HSSFRow;
import org.apache.poi.hssf.usermodel.HSSFSheet;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.poifs.filesystem.POIFSFileSystem;
import org.apache.poi.ss.usermodel.Cell;

/**
 * Parser for XLS-File using Apache POI. Each Sheet of the File will be parsed.
 * in the Database individually.
 *
 * @author 
 * @since 
 * */
public class XLSDataParser {

	private Map<String, List<HSSFRow>> allRowsOfSheet;
	private HashMap<String, HSSFCell> allCells;
	
	private InputStream inputStream; 
	

	 /**
     * Constructor XLSDataParser.
     * @param inputStream FileInputStream for xlsDatei
     **/
	public XLSDataParser(final InputStream inputStream) {
		this.inputStream = inputStream;
	}
	
	/**
	 * determine content of file.
	 * */
	public void parse() throws IOException {
		this.allRowsOfSheet = determineAllRowsOfSheet();
	}
	
	/**
	 * determine all Cells in a Row.
	 * @param sheet Name of Table Sheet.
	 * 
	 * @return allCells HashMap of all HSSFCell
	 * */
	public HashMap<String, HSSFCell> determineAllCellsOfSheet(final String sheet) {
		List<HSSFRow> allRowsOffSheet = null;
		allRowsOffSheet = allRowsOfSheet.get(sheet);
		
		allCells = new HashMap<String, HSSFCell>();
		
		if (allRowsOffSheet != null ) {
			
			for (HSSFRow hssfRow : allRowsOffSheet) {
				determineCells(hssfRow);
			}

		}
		
		return allCells;
	}
	
	/**
	 * determine all Rows for Table spreadsheet.
	 * 
	 * @return allRows Map with List of all HSSFRow
	 * */
	private Map<String, List<HSSFRow>> determineAllRowsOfSheet() throws IOException  {
		
		Map<String, List<HSSFRow>> allRowsOfSheet = new HashMap<String, List<HSSFRow>>();
		HSSFWorkbook wb = readFile();
		
		if (wb != null ) {
			List<HSSFSheet> sheets = determineSheet(wb);
		
			if (sheets != null) {
			
				for (HSSFSheet hssfSheet : sheets) {
					List<HSSFRow> rows = determineRows(hssfSheet);
					allRowsOfSheet.put(hssfSheet.getSheetName(), rows);
				}

			}
		
		}
		
		return allRowsOfSheet;
		
	}
	
	
	/**
	 * Read the File.
	 * 
	 * @return HSSFWorkbook
	 * */	
	private HSSFWorkbook readFile() throws IOException {
        POIFSFileSystem myFileSystem = new POIFSFileSystem(inputStream);
		return new HSSFWorkbook(myFileSystem);
	}
	
	/**
	 * determine all Sheets from Workbook.
	 * @param wb HSSFWorkbook
	 * 
	 * @return List all Sheets from Workbook
	 * */
	private List<HSSFSheet> determineSheet(final HSSFWorkbook wb) {
		List<HSSFSheet> allSheets = new ArrayList<HSSFSheet>();
		
		for (int i = 0; i < wb.getNumberOfSheets(); i++) {
			allSheets.add(wb.getSheetAt(i));
			
		}
		
		return allSheets;
	}
	
	/**
	 * determine all Rows from sheet.
	 * @param sheet HSSFSheet
	 * 
	 * @return List all Rows from sheet
	 * */
	private List<HSSFRow> determineRows(final HSSFSheet sheet) {
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
	 * determine a valid cell.
	 * @param row HSSFRow a Row from sheet
	 * 
	 * */
	private void determineCells(final HSSFRow row) {
		
		/*int cells = row.getPhysicalNumberOfCells();*/
		
		for (int i = 0; i < 255; i++) {
			
			if (row.getCell(i) != null) {
				
				HSSFCell cell = row.getCell(i);
				allCells.put(cell.getRowIndex() 
						+ "_" + cell.getColumnIndex(), cell);
			}
			
		}
		
	}

	/**
     * Get the String Value of xls Cell.
     * @param cell cell of HSSFCell from API.
     * 
     * @return content String value
     */
	public String determineCellValue(final HSSFCell cell) {
		
		String content = "";
		
		if (cell != null) {
			
			switch (cell.getCellType()) {

				case Cell.CELL_TYPE_FORMULA:
					return Double.toString(cell.getNumericCellValue()).trim();
				case Cell.CELL_TYPE_NUMERIC:
					return Double.toString(cell.getNumericCellValue()).trim();
				case Cell.CELL_TYPE_STRING:
					return cell.getStringCellValue().trim();
				case Cell.CELL_TYPE_BOOLEAN:
					return Boolean.toString(cell.getBooleanCellValue());
				case Cell.CELL_TYPE_BLANK:
					return content.trim();
				default: 
					return content.trim();
			}
		}
		
		return content.trim();
	}
	
	/**
     * Helper to find a Cell in a Sheet.
     * 
     * @param row - determine witch row.
     * @param column - determine witch column.
     * 
     * @return argument to find the cell - "1_1"
     */
	public String helpCellFinder(final int row, final int column) {
		int indexRow = row;
		int indexColumn = column;
		String argum = new Integer(--indexRow).toString() + 
			"_" + new Integer(--indexColumn).toString();
		return argum;
	}
	
	/**
	 * get HSSFCell from Map.
	 * 
	 * @param content Map
	 * @param row Row-Index of Sheet
	 * @param col Column-Index of Sheet
	 * 
	 * @return HSSFCell - Cell of Sheet. 
	 * */
	private HSSFCell getCellofRowColumnIndex(final Map<String, HSSFCell> content, 
			final int row, final int col) {
		return content.get(helpCellFinder(row, col));		
	}

	/**
	 * check of valid content.
	 * @param content Map
	 * @param row Row-Index of Sheet
	 * @param col Column-Index of Sheet
	 * 
	 * @return true is valid
	 * */
	public boolean isValiDateCellContent(final Map<String, HSSFCell> content,  
			final int row, final int col) {
		
		HSSFCell cell = getCellofRowColumnIndex(content, row, col);
		String value = determineCellValue(cell);
		
		if (value != null && value.length() > 0) {
			return true;
		}
		
		return false;
	}
	
	/**
	 * determine content of cell.
	 * @param content Map
	 * @param row Row-Index of Sheet
	 * @param col Column-Index of Sheet
	 * 
	 * @return content String
	 * */
	public String getCellValue(final Map<String, HSSFCell> content,  
			final int row, final int col) {
		
		HSSFCell cell = getCellofRowColumnIndex(content, row, col);
		String value = determineCellValue(cell);
		
		if (value != null && value.length() > 0) {
			return value;
		}
		
		return "";
	}
	
}