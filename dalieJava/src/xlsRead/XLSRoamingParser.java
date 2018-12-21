package xlsRead;
/*
 * The content of this file is (c) 2003 - 2009 dmc
 * digital media center GmbH
 * All rights reserved
 *
 * This software is the confidential and proprietary
 * information of dmc digital media center GmbH.
 *
 * $Id$
 *
 */

import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.apache.poi.hssf.usermodel.HSSFCell;




/**
 * XLSRoamingParser to determine data content for VO_Objects.
 *
 * @author dalieuwe
 * @since R33
 * */
public class XLSRoamingParser extends XLSDataParser {


	private Map<String, HSSFCell> international;
	private Map<String, HSSFCell> roaming;
	private Map<String, HSSFCell> operator;
	private Map<String, HSSFCell> translation;
	private Map<String, HSSFCell> region;
	private Map<String, HSSFCell> group;
	private Map<String, HSSFCell> disclaimer;
	
	private Map<String, CountryVO> countryVOs;
	private Map<String, GroupVO> groupVOs; 
	private Map<String, RegionVO> regionVOs;
	private Map<String, OperatorVO> operatorVOs;
	
	 /**
     * Constructor XLSRoamingParser.
     * @param inputStream InputStream for xlsDatei
     **/
	public XLSRoamingParser(final InputStream inputStream) {
		super(inputStream);
	}
	
	/**
	 * determine content.
	 * @see XLSDataParser
	 * */
	@Override
	public void parse() {
		
		try {
			super.parse();
			international = determineAllCellsOfSheet("International");
			roaming = determineAllCellsOfSheet("Roaming");
			operator = determineAllCellsOfSheet("Operator");
			translation = determineAllCellsOfSheet("Translation");
			region = determineAllCellsOfSheet("Region");
			group = determineAllCellsOfSheet("Group");
			disclaimer = determineAllCellsOfSheet("Disclaimer");
			
		} catch (IOException e) {
			System.out.println(e.getMessage());
		}
		
	}
	
	/**
	 * determine all CountryVOs from Spreadsheet. 
	 * 
	 * @return List with all CountryVO's
	 * */
	public Map<String, CountryVO> determineCountryVOs() {
		List<String> allCountryVoIds = parseAllCountryVOIds(this.translation, 7, 1);
		Map<String, String> countryDe = parseContentFrom(this.translation, 7, 1, 2);
		Map<String, String> countryFr = parseContentFrom(this.translation, 7, 1, 3);
		Map<String, String> countryIt = parseContentFrom(this.translation, 7, 1, 4);
		Map<String, String> countryEn = parseContentFrom(this.translation, 7, 1, 5);
		Map<String, String> flateInclusive = parseContentFrom(this.translation, 7, 1, 6);
		Map<String, String> additionalRateplans = parseContentFrom(this.translation, 7, 1, 7);
		Map<String, String> regionIds = parseCountryRegion(this.operator, 2, 2, 4);
		
		countryVOs = new HashMap<String, CountryVO>();
		
		if (allCountryVoIds != null) {
			
			for (String countryId : allCountryVoIds) {
				CountryVO countryVo = new CountryVO();
				countryVo.setId(countryId.trim());
				countryVo.setNameDe(countryDe.get(countryId));
				countryVo.setNameFr(countryFr.get(countryId));
				countryVo.setNameIt(countryIt.get(countryId));
				countryVo.setNameEn(countryEn.get(countryId));
				countryVo.setFlatInclusive(flateInclusive.get(countryId));
				countryVo.setAdditionalRateplans(additionalRateplans.get(countryId));
				countryVOs.put(countryId.trim(), countryVo);
				System.out.println(countryVo);
			}
			
		}

		if (groupVOs == null) {
			
			groupVOs =  determineGroupVOs();
		}
		
		if (regionVOs == null) {
			
			regionVOs =  determineRegionVOs();
		}
		
		if (groupVOs != null && 
				allCountryVoIds != null) {
			
			for (Map.Entry<String, GroupVO> fromMapGroupVO : groupVOs.entrySet()) {
				GroupVO groupVo = fromMapGroupVO.getValue();
				List<String> countryIds = groupVo.getCountryList();
				
				for (String countryId : countryIds ) {
					CountryVO countryVo = countryVOs.get(countryId);
			    	RegionVO regionVo = regionVOs.get(regionIds.get(countryId));
			    	
			    	if (countryVo != null) {
			    		countryVo.setCountryGroup(groupVo);
			    		countryVo.setRegion(regionVo);
			    		countryVOs.put(countryVo.getId(), countryVo);
			    	}
			    	
			    }
				
			}
			
		}
		
		return countryVOs;
	}
	
	/**
	 * 
	 * determine all RoamingVOs from Spreadsheet and RegionVOs. 
	 * 
	 * @return List with all RoamingVO's
	 * */
	public List<RoamingVO> determineRoamingVOs() {
		List<RoamingVO> roamingVOs = new ArrayList<RoamingVO>();
		
		if (regionVOs == null) {
			regionVOs =  determineRegionVOs();
		}
		
		if (regionVOs != null) {
			RoamingVO roamingVo = null;
			int indexRow = 2;
			int indexColumn = 3;
			int roamingColumn = 2;

			
			while (isValiDateCellContent(this.roaming, indexRow, indexColumn)) {
				String fromRegionId = getCellValue(this.roaming, indexRow, indexColumn);
				int roamingRow = 12;
				
				while (isValiDateCellContent(this.roaming, roamingRow, roamingColumn)) {

					String toRegionId = null;
					roamingVo = new RoamingVO();

					toRegionId = getCellValue(this.roaming, roamingRow, 2);

					roamingVo.setCall(getCellValue(this.roaming,  roamingRow, ++roamingColumn));
					roamingVo.setCallRoamingOption(
							getCellValue(this.roaming, roamingRow, ++roamingColumn));
					roamingVo.setCallStd(getCellValue(this.roaming,  roamingRow, ++roamingColumn));
			
					roamingVo.setFromRegion(regionVOs.get(fromRegionId));
					roamingVo.setToRegion(regionVOs.get(toRegionId));
					roamingVOs.add(roamingVo);
					System.out.println(fromRegionId);
					System.out.println(toRegionId);
					System.out.println(roamingVo);
					roamingRow++;
					roamingColumn--;
					roamingColumn--;
					roamingColumn--;
				
				}
				
				roamingColumn = roamingColumn + 3;
				indexColumn = indexColumn + 3;
			}
		
		}
		
		return roamingVOs;
	}
	
	/**
	 * determine all RegionVOs from Spreadsheet. 
	 * 
	 * @return Map with all RegionVO's
	 * */
	public Map<String, RegionVO> determineRegionVOs() {
		int indexRow = 2;
		int indexColumn = 3;
		regionVOs = new HashMap<String, RegionVO>();
		
		while (isValiDateCellContent(this.roaming, indexRow, indexColumn)) {
			Map<String, String> regionDe = parseContentFrom(this.region, 1, 1, 2);
			Map<String, String> regionFr = parseContentFrom(this.region, 1, 1, 3);
			Map<String, String> regionIt = parseContentFrom(this.region, 1, 1, 4);
			Map<String, String> regionEn = parseContentFrom(this.region, 1, 1, 5);
			
			String roamingId = getCellValue(this.roaming, indexRow, indexColumn);
			RegionVO regionVo = parseRegionVO(this.roaming, 4, indexColumn);
			
			regionVo.setNameDe(regionDe.get(getCellValue(this.roaming, indexRow, indexColumn)));
			regionVo.setNameFr(regionFr.get(getCellValue(this.roaming, indexRow, indexColumn)));
			regionVo.setNameIt(regionIt.get(getCellValue(this.roaming, indexRow, indexColumn)));
			regionVo.setNameEn(regionEn.get(getCellValue(this.roaming, indexRow, indexColumn)));
			regionVOs.put(roamingId, regionVo);
			System.out.println(regionVo);
			indexColumn = indexColumn + 3;
		}
		
		return regionVOs;
	}
	
	/**
	 * determine all GroupVOs from Spreadsheet.
	 * 
	 * @return Map with all GroupVO's
	 * */
	public Map<String, GroupVO> determineGroupVOs() {
		int indexRow = 2;
		int indexGroup = 2;
		groupVOs = new HashMap<String, GroupVO>();
		
		while (isValiDateCellContent(
				this.international, indexRow, indexGroup)) {
			GroupVO groupVo = parseGroupVO(
					this.international, indexRow, indexGroup);
			groupVOs.put(groupVo.getId(), groupVo);
			System.out.println(groupVo);
			indexGroup++;
			
		}
		
		return groupVOs;
	}
	
	/**
	 * determine all OperatorVOs from Spreadsheet.
	 * 
	 * @return Map with all OperatorVO's
	 * */
	public Map<String, OperatorVO> determineOperatorVO() {
		operatorVOs = new HashMap<String, OperatorVO>();
		
		if (countryVOs == null) {
			countryVOs =  determineCountryVOs();
		}
		
		if (this.operator != null &&
				countryVOs != null) {
			
			int indexRow = 2;
			int indexCol = 1;
		
			while (isValiDateCellContent(this.operator, indexRow, indexCol)) {
		
				OperatorVO operatorVo = parseOperatorVO(
					this.operator, indexRow, indexCol);
				operatorVOs.put(operatorVo.getTapCode(), operatorVo);
				//System.out.println(operatorVo);
				indexRow++;
			
			}
			
		}
		
		return operatorVOs;
	}
	
	/**
	 * parse Map and get the content.
	 * @param content Map
	 * @param indexRow index of row from sheet
	 * @param indexColumn index of column form sheet
	 * 
	 * @return OperatorVO 
	 * */
	private OperatorVO parseOperatorVO(final Map<String, HSSFCell> content,
			final int indexRow, final int indexColumn ) {
		
		int row = indexRow;
		int column = indexColumn;
		OperatorVO operatorVo = new OperatorVO();
		
		operatorVo.setTapCode(getCellValue(content, row, column));
		
		operatorVo.setCountry(
				countryVOs.get(getCellValue(content, row, ++column).trim()));
		operatorVo.setName(getCellValue(content, row, ++column));
		++column;
		
		operatorVo.setPrepaid(new Double(
				getCellValue(content, row, ++column)).intValue());
		operatorVo.setGprs(new Double(
				getCellValue(content, row, ++column)).intValue());
		operatorVo.setUmts(new Double(
				getCellValue(content, row, ++column)).intValue());
		operatorVo.setMms(new Double(
				getCellValue(content, row, ++column)).intValue());
		operatorVo.setFrequency(
				getCellValue(content, row, ++column));
		
		return operatorVo;
		
	}
	
	/**
	 * parse Map and get the content.
	 * @param international Map
	 * @param indexRow index of row from sheet
	 * @param indexColumn index of column form sheet
	 * 
	 * @return GroupVO 
	 * */
	private GroupVO parseGroupVO(final Map<String, HSSFCell> international, 
			final int indexRow, final int indexColumn ) {
		int row = indexRow;
		int column = indexColumn;
		Map<String, String> groupDe = parseContentFrom(this.group, 1, 1, 2);
		Map<String, String> groupFr = parseContentFrom(this.group, 1, 1, 3);
		Map<String, String> groupIt = parseContentFrom(this.group, 1, 1, 4);
		Map<String, String> groupEn = parseContentFrom(this.group, 1, 1, 5);
		
		Map<String, String> disclaimerDe = parseContentFrom(this.disclaimer, 1, 1, 2);
		Map<String, String> disclaimerFr = parseContentFrom(this.disclaimer, 1, 1, 3);
		Map<String, String> disclaimerIt = parseContentFrom(this.disclaimer, 1, 1, 4);
		Map<String, String> disclaimerEn = parseContentFrom(this.disclaimer, 1, 1, 5);
		
		GroupVO groupVo = new GroupVO();
		groupVo.setId(getCellValue(international, row, column));
		groupVo.setNameDe(groupDe.get(getCellValue(international, row, column)).trim());
		groupVo.setNameFr(groupFr.get(getCellValue(international, row, column)).trim());
		groupVo.setNameIt(groupIt.get(getCellValue(international, row, column)).trim());
		groupVo.setNameEn(groupEn.get(getCellValue(international, row, column)).trim());
		++row;
		groupVo.setPostFixnetInternational(getCellValue(international, ++row, column));
		groupVo.setPostMobileInternational(getCellValue(international, ++row, column));
		++row;
		groupVo.setPostFixnet(getCellValue(international, ++row, column));
		groupVo.setPostMobile(getCellValue(international, ++row, column));
		groupVo.setPostSMS(getCellValue(international, ++row, column));
		groupVo.setPostMMS(getCellValue(international, ++row, column));
		++row;
		groupVo.setPreFixnetInternational(getCellValue(international, ++row, column));
		groupVo.setPreMobileInternational(getCellValue(international, ++row, column));
		++row;
		groupVo.setPreFixnet(getCellValue(international, ++row, column));
		groupVo.setPreMobile(getCellValue(international, ++row, column));
		groupVo.setPreSMS(getCellValue(international, ++row, column));
		groupVo.setPreMMS(getCellValue(international, ++row, column));
		groupVo.setCountries(getCellValue(international, ++row, column));
		groupVo.setDisclaimerDe(disclaimerDe.get(getCellValue(international, ++row, column)));
		groupVo.setDisclaimerFr(disclaimerFr.get(getCellValue(international, row, column)));
		groupVo.setDisclaimerIt(disclaimerIt.get(getCellValue(international, row, column)));
		groupVo.setDisclaimerEn(disclaimerEn.get(getCellValue(international, row, column)));
		return groupVo;
		
	}
	
	/**
	 * parse Map and get the content.
	 * @param content Map
	 * @param indexRow index of row from sheet
	 * @param indexColumn index of column form sheet
	 * 
	 * @return RegionVO 
	 * */
	private RegionVO parseRegionVO(final Map<String, HSSFCell> content,
			final int indexRow, final int indexColumn ) {
		
		int row = indexRow;
		int column = indexColumn;
		Map<String, String> disclaimerDe = parseContentFrom(this.disclaimer, 1, 1, 2);
		Map<String, String> disclaimerFr = parseContentFrom(this.disclaimer, 1, 1, 3);
		Map<String, String> disclaimerIt = parseContentFrom(this.disclaimer, 1, 1, 4);
		Map<String, String> disclaimerEn = parseContentFrom(this.disclaimer, 1, 1, 5);
		
		RegionVO regionVo = new RegionVO();
		
		int columnForRoaming = Integer.valueOf(column + 1);
		int columnForPrepaid = Integer.valueOf(column + 2);
		regionVo.setIncomingCall(getCellValue(content, row, indexColumn));
		regionVo.setIncomingCallRoamingOpt(getCellValue(content, row, columnForRoaming));
		regionVo.setIncomingCallStd(getCellValue(content, row, columnForPrepaid));
		regionVo.setSms(getCellValue(content, ++row, indexColumn));
		regionVo.setSmsRoamingOpt(getCellValue(content, row, columnForRoaming));
		regionVo.setSmsStd(getCellValue(content, row,  columnForPrepaid));
		regionVo.setMms(getCellValue(content, ++row, indexColumn));
		regionVo.setMmsRoamingOpt(getCellValue(content, row, columnForRoaming));
		regionVo.setMmsStd(getCellValue(content, row, columnForPrepaid));
		regionVo.setDataCHFkb(getCellValue(content, ++row, indexColumn));
		regionVo.setDataCHFkbRoamingOpt(getCellValue(content, row, columnForRoaming));
		regionVo.setDataCHFkbStd(getCellValue(content, row, columnForPrepaid));
		regionVo.setDisclaimerDe(disclaimerDe.get(getCellValue(content, ++row, indexColumn)));
		regionVo.setDisclaimerFr(disclaimerFr.get(getCellValue(content, row, indexColumn)));
		regionVo.setDisclaimerIt(disclaimerIt.get(getCellValue(content, row, indexColumn)));
		regionVo.setDisclaimerEn(disclaimerEn.get(getCellValue(content, row, indexColumn)));
		regionVo.setDisclaimerDeRoamingOpt(disclaimerDe.get(getCellValue(content, row, columnForRoaming)));
		regionVo.setDisclaimerFrRoamingOpt(disclaimerFr.get(getCellValue(content, row, columnForRoaming)));
		regionVo.setDisclaimerItRoamingOpt(disclaimerIt.get(getCellValue(content, row, columnForRoaming)));
		regionVo.setDisclaimerEnRoamingOpt(disclaimerEn.get(getCellValue(content, row, columnForRoaming)));
		regionVo.setDisclaimerDeStd(disclaimerDe.get(getCellValue(content, row, columnForPrepaid)));
		regionVo.setDisclaimerFrStd(disclaimerFr.get(getCellValue(content, row, columnForPrepaid)));
		regionVo.setDisclaimerItStd(disclaimerIt.get(getCellValue(content, row, columnForPrepaid)));
		regionVo.setDisclaimerEnStd(disclaimerEn.get(getCellValue(content, row, columnForPrepaid)));
		++row;
		regionVo.setWithinCountry(getCellValue(content, ++row, indexColumn));
		regionVo.setWithinCountryRoamingOption(getCellValue(content, row, columnForRoaming));
		regionVo.setWithinCountryStd(getCellValue(content, row, columnForPrepaid));
		regionVo.setSwitzerland(getCellValue(content, ++row, indexColumn));
		regionVo.setSwitzerlandRoamingOption(getCellValue(content, row, columnForRoaming));
		regionVo.setSwitzerlandStd(getCellValue(content, row, columnForPrepaid));
		
		System.out.println(regionVo);
		return regionVo;
	
	}
	
	/**
	 * parse Map and get the content.
	 * @param content Map
	 * @param indexRow index of row from sheet
	 * @param indexColumn index of column form sheet
	 * 
	 * @return Map 
	 * */
	private List<String> parseAllCountryVOIds(final Map<String, HSSFCell> content,
			final int indexRow, final int indexColumn) {
		List<String> allCountryVoIds = new ArrayList<String>();
		
		int row = indexRow;
		int column = indexColumn;
		
		while (isValiDateCellContent(content, row, column)) {
			allCountryVoIds.add(getCellValue(content, row, column));
			row++;
		}
		
		return allCountryVoIds;
	}
	
	/**
	 * parse Map and get the content.
	 * @param content Map
	 * @param indexRow index of row from sheet
	 * @param indexColumn index of column form sheet
	 * @param columnContentValue index for column translate
	 * 
	 * @return Map 
	 * */
	private Map<String, String> parseContentFrom(final Map<String, HSSFCell> content,
			final int indexRow, final int indexColumn, final int columnContentValue) {
		int row = indexRow;
		int column = indexColumn;
		Map<String, String> cT = new HashMap<String, String>();
		
		while (isValiDateCellContent(content, row, column)) {
			String keyValue =  getCellValue(content, row, column); 
			String objectValue =  getCellValue(content, row, columnContentValue);
			
			cT.put(keyValue, objectValue);
			row++;
		}
		
		return cT; 
	}
	
	/**
	 * parse Map and get the content.
	 * @param content Map
	 * @param indexRow index of row from sheet
	 * @param indexColumn index of column form sheet
	 * @param columnContentValue index for value region
	 * 
	 * @return Map 
	 * */
	private Map<String, String> parseCountryRegion(final Map<String, HSSFCell> content,
			final int indexRow, final int indexColumn, final int columnContentValue) {
		int row = indexRow;
		int column = indexColumn;
		Map<String, String> cR = new HashMap<String, String>();
		
		while (isValiDateCellContent(content, row, column)) {
			String keyValue =  getCellValue(content, row, column);
			
			String objectValue = getCellValue(content, row, columnContentValue);
			
			if (!cR.containsKey(keyValue)) {
				
				cR.put(keyValue, objectValue);
			}

			row++;
			
		}
		
		return cR; 
	}
	
}