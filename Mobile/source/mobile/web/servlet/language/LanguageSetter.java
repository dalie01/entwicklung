package mobile.web.servlet.language;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import mobile.internal.Constants;
import mobile.utilities.capi.PipelineDictionary;
import mobile.utilities.internal.PipelineDictionaryImpl;
import mobile.utilities.support.RegSupporter;
import mobile.web.util.MobileAppServlet;

/**
 * Servlet implementation class LanguageSetter
 * 
 * @author DALiE
 * @since R 1.0.0.0
 */
public class LanguageSetter extends MobileAppServlet {
	private static final long serialVersionUID = 1L;
       
	@Override
	protected void perForm(HttpServletRequest request,
			HttpServletResponse response) throws ServletException, IOException {
		
		PipelineDictionary dict = new PipelineDictionaryImpl(); 
		
		String id = RegSupporter.getRequestValue(
				request,Constants.LANGUAGE_SELECTED_ID);
		
		dict.put(Constants.LANGUAGE_SELECTED_ID,id);
		perFormNext(request, response, dict);
	}
	
    /**
     * @see HttpServlet#HttpServlet()
     */
    public LanguageSetter() {
        super();
    } /* LanguageSetter */

} /* LanguageSetter */
