package mobile.web.servlet.properties;

import java.io.IOException;
import java.util.Map;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import mobile.utilities.Pipelet;
import mobile.utilities.capi.DICT;
import mobile.utilities.capi.PipelineDictionary;
import mobile.utilities.internal.PipelineDictionaryImpl;
import mobile.web.pipelet.property.GetPropertiesFromDatabase;
import mobile.web.pipelet.property.GroupProperties;
import mobile.web.pipelet.property.GroupPropertiesWebFormConverter;
import mobile.web.util.MobileAppServlet;
import mobile.web.util.MobileAppSession;

/**
 * Get all Database Properties Entry's 
 * and hold on session.
 * 
 * @author DALiEWEB
 * @since 1.0.0.0
 * 
 */
public class GetAllProperties extends MobileAppServlet {
	
	protected void perForm (
			final HttpServletRequest request, final HttpServletResponse response)
					throws ServletException , IOException {

		MobileAppSession mSession = new MobileAppSession(request.getSession(true));
		PipelineDictionary dict = new PipelineDictionaryImpl(); 
		 
		try{
			Map<?, ?> propertiesMap = mSession.getMap(DICT.GROUPED_PROPERTIES_MAP);
			
			if(propertiesMap == null) {
				
				/* get all Properties from Database as you can find */
				Pipelet propertiesFromDatabase = new GetPropertiesFromDatabase();
				propertiesFromDatabase.execute(dict);
				
				/* set new Property to Map */
				Pipelet groupProperties = new GroupProperties();
				dict.put(GroupProperties.DN_IN_PROPERTIES, 
						dict.get(GetPropertiesFromDatabase.DN_OUT_PROPERTIES));				
				groupProperties.execute(dict);
				
				Pipelet converter = new GroupPropertiesWebFormConverter();
				dict.put(GroupPropertiesWebFormConverter.DN_IN_OUT_PROPERTIES_MAP, 
						dict.get(GroupProperties.DN_OUT_PROPERTIES_MAP));
				converter.execute(dict);
				
				dict.put(DICT.GROUPED_PROPERTIES_MAP, 
						dict.get(GroupPropertiesWebFormConverter.DN_IN_OUT_PROPERTIES_MAP));
				
				mSession.setAttribute(DICT.GROUPED_PROPERTIES_MAP, 
						dict.get(GroupPropertiesWebFormConverter.DN_IN_OUT_PROPERTIES_MAP));
			} else {
				dict.put(DICT.GROUPED_PROPERTIES_MAP, propertiesMap);
			}
			
		} catch (Exception e) {
			System.out.println(this.getServletName() + ":" + e.getMessage());
				throw new ServletException();
		}
		
		
		perFormNext(request, response, dict);
	} /* perForm */
	
	
	/**
     * @see HttpServlet#HttpServlet()
     */
    public GetAllProperties() {
        super();
    } /* Properties */
    
} /* Properties */
