package mobile.web.util;

import java.io.Serializable;
import java.util.List;
import java.util.Map;

import javax.servlet.http.HttpSession;

public class MobileAppSession implements Serializable {

	private final HttpSession session;
	
	public MobileAppSession(HttpSession session){
		this.session = session;
	}
	
	public List<?> getList(final String dict){
		return (List<?>)session.getAttribute(dict);
	}
		
	public Map<?, ?> getMap(final String dict){ 
			return (Map<?, ?>)session.getAttribute(dict);
	}
	
	public void setAttribute(final String con, final Object obj){ 
		session.setAttribute(con, obj);
	}
	
	public Object getAttribute(final String dict){
		return session.getAttribute(dict);
	}
		
	public void removeFormSession(final String dict){ 
		session.removeAttribute(dict);
	}
	
}
