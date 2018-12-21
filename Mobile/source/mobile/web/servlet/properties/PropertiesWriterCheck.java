package mobile.web.servlet.properties;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import mobile.web.util.MobileAppServlet;

public class PropertiesWriterCheck extends MobileAppServlet {

	@Override
	protected void perForm(HttpServletRequest request,
			HttpServletResponse response) throws ServletException, IOException {
		
		
		executeForward("/properties/webForm/PropertyFormByRelase.jsp", request, response);
	}
	
	/**
	 * @see HttpServlet
	 */
	public PropertiesWriterCheck(){
		super();
	} /* PropertiesWriterCheck */
	
} /* PropertiesWriterCheck */
