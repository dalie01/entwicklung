package model.internal.session;

import java.util.List;
import java.util.Map;

import database.Table;
import model.AbstractSessionInfo;

public class SessionInfo extends AbstractSessionInfo {

	private Map<?, ?> crmActionTypeMap;
	
	public SessionInfo(List<Object> obj){
		this.setSessionID(obj.get(0).toString());
		this.setDomainID(obj.get(1).toString());
		this.setUserID(obj.get(2).toString());
		Boolean t = (Boolean)obj.get(3);
		this.setAuthenticationState(t);
		this.setLanguage(obj.get(4).toString());
		this.setCurrency(obj.get(5).toString());
		crmActionTypeMap = Table.deserializeObject(obj.get(6).toString());
		this.setDictionary(crmActionTypeMap);
		this.setExpires(Float.parseFloat(obj.get(7).toString()));
	}
}
