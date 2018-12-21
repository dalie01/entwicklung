package mobile.web.servlet.properties;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import mobile.internal.property.FormProperty;
import mobile.utilities.Pipelet;
import mobile.utilities.capi.DICT;
import mobile.utilities.capi.PipelineDictionary;
import mobile.utilities.internal.PipelineDictionaryImpl;
import mobile.web.pipelet.property.GetPropertiesFromDatabase;
import mobile.web.pipelet.property.GroupProperties;
import mobile.web.pipelet.property.SetPropertyToDatabase;
import mobile.web.util.MobileAppServlet;
import model.internal.property.Property;

/**
 * Servlet implementation class WebPropertyFormCheck
 */
public class WebPropertyFormCheck extends MobileAppServlet {
	private static final long serialVersionUID = 1L;
    
	protected void perForm (
			final HttpServletRequest request, final HttpServletResponse response)
					throws ServletException , IOException {

		PipelineDictionary dict = new PipelineDictionaryImpl(); 
		 
		try{
						
			FormProperty formProperty = new FormProperty();
			
			formProperty.updateFormProperty(request);
			
			if (formProperty.isValid()) {
				dict.put(SetPropertyToDatabase.DN_IN_OUT_PROPERTY, 
						formProperty.getProperty());
				Pipelet pDatabase = new SetPropertyToDatabase();
				
				if( pDatabase.execute(dict) == 1) {
					Property prop = (
							Property)dict.get(SetPropertyToDatabase.DN_IN_OUT_PROPERTY);
					formProperty = new FormProperty(prop);
				}
				
				dict.put(GetPropertiesFromDatabase.DN_IN_PROPERTY_ID, 
						formProperty.getProperty().getPropertId());
				Pipelet propertiesDatabase = new GetPropertiesFromDatabase();
				if (propertiesDatabase.execute(dict) == 1) {
					
					Pipelet groupProperties = new GroupProperties();
					dict.put(GroupProperties.DN_IN_PROPERTIES,
							dict.get(GetPropertiesFromDatabase.DN_OUT_PROPERTIES)); 
					groupProperties.execute(dict);
					
					dict.put(DICT.GROUPED_PROPERTY_MAP, 
							dict.get(GroupProperties.DN_OUT_PROPERTIES_MAP));
				} else {
					throw new ServletException(this.getServletName() + ": Technical Error ");
				}
			} 
			
			/* store 'Property:webFormProperty' */
			dict.put(DICT.WEB_FORM_PROPERTY, formProperty);
			
			 
		} catch (Exception e) {
				throw new ServletException(this.getServletName() + ":" + e.getMessage());
		}
		perFormNext(request, response, dict);
		
	} /* perForm */
	
    /**
     * @see HttpServlet#HttpServlet()
     */
    public WebPropertyFormCheck() {
        super();
    } /* WebPropertyFormCheck */

} /* class WebPropertyFormCheck */
