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
import mobile.utilities.exceptions.PipeletExecutionException;
import mobile.utilities.internal.PipelineDictionaryImpl;
import mobile.utilities.support.RegSupporter;
import mobile.web.pipelet.property.GetPropertiesFromDatabase;
import mobile.web.pipelet.property.GroupProperties;
import mobile.web.util.MobileAppServlet;
import mobile.web.util.MobileAppSession;
import model.internal.property.Property;

import org.apache.commons.lang3.StringUtils;

/**
 * Servlet implementation class WebPropertyFormCreate
 */
public class WebPropertyFormCreate extends MobileAppServlet {
	private static final long serialVersionUID = 1L;
    
	protected void perForm (
			final HttpServletRequest request, final HttpServletResponse response)
					throws ServletException , IOException {

		MobileAppSession mSession = new MobileAppSession(request.getSession(true));
		PipelineDictionary dict = new PipelineDictionaryImpl(); 
		 
		try{
			FormProperty property = new FormProperty();
			String id = RegSupporter.getRequestValue(request,DICT.PROPERTY_ID);
			String cId = RegSupporter.getRequestValue(request,DICT.COUNTRY_ID);
			if (StringUtils.isNotEmpty(id) && StringUtils.isNotEmpty(cId)) {
				
				dict.put(GetPropertiesFromDatabase.DN_IN_PROPERTY_ID, id);
				dict.put(GetPropertiesFromDatabase.DN_IN_COUNTRY_ID, cId);
				Pipelet pDatabase = new GetPropertiesFromDatabase();
			
				if (pDatabase.execute(dict) == Pipelet.PIPELET_NEXT) {

					Property dProperty = (Property)dict.get(
							GetPropertiesFromDatabase.DN_OUT_PROPERTY);
					if (dProperty != null) {
						property = new FormProperty(dProperty);					
					}
			
					dict.remove(GetPropertiesFromDatabase.DN_IN_COUNTRY_ID);
					if (pDatabase.execute(dict) == Pipelet.PIPELET_NEXT) {
						
						setDictGroupedPropertyMap(dict, GetPropertiesFromDatabase.DN_OUT_PROPERTIES);
						
					} else {
						throw new ServletException(this.getServletName() + ": Technical Error ");
					}
				
				} else {
					throw new ServletException(this.getServletName() + ": Technical Error ");
				}
				
			} 
			
			mSession.setAttribute(DICT.WEB_FORM_PROPERTY, property);
			dict.put(DICT.WEB_FORM_PROPERTY, property);
		} catch (Exception e) {
			throw new ServletException(this.getServletName() + ":" + e.getMessage());
		}
		
		perFormNext(request, response, dict);
		
	} /* perForm */
    /**
     * @see HttpServlet#HttpServlet()
     */
    public WebPropertyFormCreate() {
        super();
    } /* WebPropertyFormCreate */	

    
    void setDictGroupedPropertyMap(PipelineDictionary dict, String fromIdtifiyer) throws PipeletExecutionException {
    	Pipelet groupProperties = new GroupProperties();
		dict.put(GroupProperties.DN_IN_PROPERTIES, 
				dict.get(fromIdtifiyer));
		
		groupProperties.execute(dict);
		
		dict.put(DICT.GROUPED_PROPERTY_MAP, 
				dict.get(GroupProperties.DN_OUT_PROPERTIES_MAP));
    }
    
} /* class WebPropertyFormCreate */
