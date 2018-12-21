package model.internal;

import java.util.List;

/**
 * Additional Informations about Records. 
 * 
 * @author DALiE
 * @since R 1.0.0.0
 */
public class DataUtils {
	
	/**
	 * createUser: User which created this Record.
	 * */
	private String createUser;
	/**
	 * createDate: Timestamp of creation.
	 * */
	private String createDate;	
	/**
	 * changeUser: last User of change.
	 * */
	private String changeUser;	
	/**
	 * changeDate: Date of last modification.
	 * */
	private String changeDate;
	
	/** 
	 * default Constructor. 
	 * */
	public DataUtils(){}
	
	/**
	 * Constructor DataUtils
	 * 
	 * @param obj 
	 * @param bgIndex
	 * 
	 * */
	public DataUtils(List<Object> obj, int bgIndex){
		int i = bgIndex;
		this.createUser = obj.get(i).toString();
		i = i + 1;
		this.createDate = obj.get(i).toString();
		i = i + 1;
		this.changeUser = obj.get(i).toString();
		i = i + 1;
		this.changeDate = obj.get(i).toString();
	} /* DataUtils */
	
	/**
	 * Returns the value of attribute 'createUser'.
	 * @return the value of the attribute 'createUser'
	 *  */
	public String getCreateUser() {
		return createUser;
	} /* getCreateUser */
	
	/**
	 * Set the Value of the attribute 'createUser'.
	 * @param createUser the new value of the attribute
	 * */
	public void setCreateUser(final String createUser) {
		this.createUser = createUser;
	} /* setCreateUser */
	
	/**
	 * Returns the value of attribute 'createDate'.
	 * @return the value of the attribute 'createDate'
	 */
	public String getCreateDate() {
		return createDate;
	} /* getCreateDate */
	
	/**
	 * Set the Value of the attribute 'createDate'.
	 * @param createDate the new value of the attribute
	 * */
	public void setCreateDate(final String createDate) {
		this.createDate = createDate;
	} /* setCreateDate */
	
	/**
	 * Returns the value of attribute 'getChangeUser'.
	 * @return the value of the attribute 'changeUser'
	 * */
	public String getChangeUser() {
		return changeUser;
	} /* getChangeUser */
	
	/**
	 * Set the Value of the attribute 'changeUser'.
	 * @param changeUser the new value of the attribute
	 * */
	public void setChangeUser(final String changeUser) {
		this.changeUser = changeUser;
	} /* setChangeUser */
	
	/**
	 * Returns the value of attribute 'changeDate'.
	 * @return the value of the attribute 'changeDate'
	 * */
	public String getChangeDate() {
		return changeDate;
	} /* getChangeDate */

	/**
	 * Set the Value of the attribute 'changeDate'.
	 * @param changeDate the new value of the attribute
	 * */
	public void setChangeDate(final String changeDate) {
		this.changeDate = changeDate;
	} /* setChangeDate */

	@Override
	public String toString() {
		return "DataUtils [createUser=" + createUser + ", createDate="
				+ createDate + ", changeUser=" + changeUser + ", changeDate="
				+ changeDate + "]";
	} /* toString */
	
} /* class DataUtils */
