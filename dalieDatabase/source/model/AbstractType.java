package model;

import model.internal.DataUtils;

public abstract class AbstractType {
	
	/** typeId Identifier */
	private String typeId;
	/** description  */
	private String description;
	/** dataUtils */
	private DataUtils dataUtils;
	
	
	/**
	 * Get TypeId.
	 * @return typeId 
	 */
	public String getTypeId() {
		return typeId;
	}
	
	/**
	 * Set TypeId.
	 * @param typeId typeId
	 */
	public void setTypeId(final String typeId) {
		this.typeId = typeId;
	}
	/**
	 * Get Description.
	 * @return description
	 */
	public String getDescription() {
		return description;
	}
	/**
	 * Set Description.
	 * @param desc description
	 */
	public void setDescription(final String desc) {
		this.description = desc;
	}
	/**
	 * Get DataUtils.
	 * @return dataUtils dataUtils
	 */
	public DataUtils getDataUtils() {
		return dataUtils;
	}
	/**
	 * Set DataUtils.
	 * @param dataUtils dataUtils
	 */
	public void setDataUtils(final DataUtils dataUtils) {
		this.dataUtils = dataUtils;
	}
	
	@Override
	public String toString() {
		return "Type [typeId=" + typeId + ", description="
				+ description + ", dataUtils=" + dataUtils + "]";
	}
	
} /* AbstractType */
