package mobile.web.servlet.properties;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.io.OutputStream;
import java.util.List;

import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import mobile.utilities.Pipelet;
import mobile.utilities.capi.PipelineDictionary;
import mobile.utilities.internal.PipelineDictionaryImpl;
import mobile.web.pipelet.property.GetPropertiesFromDatabase;
import model.internal.property.Property;

/**
 * @author DALiEWEB
 *
 */
public class PropertiesWriter extends HttpServlet {

	private static final int BUFSIZE = 4096;
	private String filePath;
	String sDownLoadDir = File.separator + "properties" + File.separator + "download" + File.separator;
	
	protected void perForm(HttpServletRequest request,
			HttpServletResponse response) throws ServletException, IOException {
	
		try {
			File file = null;
			File oldFile = new File(filePath);
			if (oldFile.exists()){
				oldFile.delete();
			}
			file = new File(filePath);
			PipelineDictionary dict = new PipelineDictionaryImpl();
			Pipelet propertiesFromDatabase = new GetPropertiesFromDatabase();
			/* set CountryId as parameter */
			dict.put(GetPropertiesFromDatabase.DN_IN_COUNTRY_ID, "DE");
			propertiesFromDatabase.execute(dict);
			
		
			@SuppressWarnings("unchecked")
			List<Property> properties = (List<Property>) 
					dict.get(GetPropertiesFromDatabase.DN_OUT_PROPERTIES);
			
			if (properties != null && 
					!properties.isEmpty()) {
				
				FileWriter fw = new FileWriter(file);
				for (Property p : properties) {
					StringBuffer sb = new StringBuffer();
					sb.append(p.getPropertyEntry() + System.getProperty("line.separator"));
					fw.write(sb.toString());					
				}
				
				fw.close();
			}
			
			FileInputStream inStream = new FileInputStream(file);
			/* obtains ServletContext */
			ServletContext context = getServletContext();
		
			/* gets MIME type of the file */
			String mimeType = context.getMimeType(filePath);
			if (mimeType == null) {        
            /* set to binary type if MIME mapping not found */
				mimeType = "application/octet-stream";
			}
         
			/* modifies response */
			response.setContentType(mimeType);
			response.setContentLength((int) file.length());
         
			/* forces download */
			String headerKey = "Content-Disposition";
			String headerValue = String.format("attachment; filename=\"%s\"", file.getName());
			response.setHeader(headerKey, headerValue);
         
			/* obtains response's output stream */
			OutputStream outStream = response.getOutputStream();
         
			byte[] buffer = new byte[BUFSIZE];
			int bytesRead = -1;
         
			while ((bytesRead = inStream.read(buffer)) != -1) {
				outStream.write(buffer, 0, bytesRead);
			}
         
			inStream.close();
			outStream.close();  
			outStream.flush();

		} catch (Exception e) {		
			throw new ServletException(e.getMessage());
		}
        
	} /* perFrom */

	protected void doGet(HttpServletRequest request,
			HttpServletResponse response) throws ServletException, IOException {
		perForm(request, response);
	}

	@Override
	public void init() {
		// the file data.xls is under web application folder
		filePath = getServletContext().getRealPath(sDownLoadDir) + File.separator + "LocalizedStrings.properties";
	}
} /* PropertiesWriter */
