package model.capi.type;

import model.internal.DataUtils;

public interface GlobalTypes {
	
	public String getTypeId();
	public void setTypeId(final String typeId);
	
	public String getDescription();
	public void setDescription(final String desc);
	
	public DataUtils getDataUtils();
	public void setDataUtils(final DataUtils dataUtils);
	
}
