package mobile.web.servlet;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import mobile.factorys.ServiceOptionsParser;
import mobile.internal.Constants;
import mobile.utilities.capi.PipelineDictionary;
import mobile.utilities.internal.PipelineDictionaryImpl;
import mobile.web.util.MobileAppServlet;

/**
 * Servlet implementation class ServiceOptions
 */
public class ServiceOptions extends MobileAppServlet {
    
	protected void perForm (
			final HttpServletRequest request, final HttpServletResponse response)
					throws ServletException , IOException {
		
		PipelineDictionary dict = new PipelineDictionaryImpl(); 		
		try {
			ServiceOptionsParser.parseServiceOptions(
					getServletContext().getResourceAsStream(
							Constants.DIR_XML_SERVICEOPTIONS));
				
		} catch (Exception e) {
			
			throw new ServletException();
		}
		
		dict.put(Constants.SERVICEOPTIONS, ServiceOptionsParser.getServiceOptions());
		perFormNext(request, response, dict);
		
	} /* perForm */
	
    /**
     * @see HttpServlet#HttpServlet()
     */
    public ServiceOptions() {
        super();
        
    } /* ServiceOptions */
	
} /* ServiceOptions */
