package mobile.web.servlet.properties;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import mobile.utilities.Pipelet;
import mobile.utilities.capi.DICT;
import mobile.utilities.capi.PipelineDictionary;
import mobile.utilities.internal.PipelineDictionaryImpl;
import mobile.utilities.support.RegSupporter;
import mobile.web.pipelet.property.GetPropertiesFromDatabase;

import org.apache.commons.lang3.StringUtils;

/**
 * Get WebPropertyForm by Id.
 * 
 * @author DALiEWEB
 * @since 1.0.0.0
 */
public class WebPropertyFormById extends WebPropertyFormCreate {

	
	protected void perForm (
			final HttpServletRequest request, final HttpServletResponse response)
					throws ServletException , IOException {

		PipelineDictionary dict = new PipelineDictionaryImpl(); 
		 
		try{
			String id = RegSupporter.getRequestValue(request,DICT.PROPERTY_ID);
			if (StringUtils.isNotEmpty(id)) {
				
				dict.put(GetPropertiesFromDatabase.DN_IN_PROPERTY_ID, id);
				Pipelet pDatabase = new GetPropertiesFromDatabase();
			
				if (pDatabase.execute(dict) == Pipelet.PIPELET_NEXT) {
	
					setDictGroupedPropertyMap(
							dict,GetPropertiesFromDatabase.DN_OUT_PROPERTIES);
						
				} else {
					throw new ServletException(
							this.getServletName() + ": Technical Error ");
				}
				
			} 
			
		} catch (Exception e) {
			throw new ServletException(this.getServletName() + ":" + e.getMessage());
		}
		
		perFormNext(request, response, dict);
	}
	
	/**
	 * @see HttpServlet#HttpServlet()
     */
    public WebPropertyFormById() {
        super();
    } /* WebPropertyFormById */	

} /* class WebPropertyFormById */
