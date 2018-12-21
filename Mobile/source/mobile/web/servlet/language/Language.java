package mobile.web.servlet.language;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import mobile.factorys.MobileLocalInformationFactory;
import mobile.internal.Constants;
import mobile.utilities.capi.PipelineDictionary;
import mobile.utilities.internal.PipelineDictionaryImpl;
import mobile.web.util.MobileAppServlet;

/**
 * Servlet implementation class Language
 */
public class Language extends MobileAppServlet {
	private static final long serialVersionUID = 1L;
	
	public void perForm(HttpServletRequest request,
			HttpServletResponse response) throws ServletException, IOException {
		
		PipelineDictionary dict = new PipelineDictionaryImpl();
	
		dict.put(Constants.ALL_LOCAL_INFORMATIONS, MobileLocalInformationFactory.getInstance().allLocales);
		perFormNext(request, response, dict);
	} /* perForm */
    
	
	/**
	 * @see HttpServlet#HttpServlet()
	 */
	public Language() {
		super();
	} /* Language */
	
} /* class Language */
