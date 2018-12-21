package selinas.servlets;

import help.Thumbnail;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.Iterator;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.commons.fileupload.FileItem;
import org.apache.commons.fileupload.FileUploadException;
import org.apache.commons.fileupload.disk.DiskFileItemFactory;
import org.apache.commons.fileupload.servlet.ServletFileUpload;

import database.Database;

/**
 * Servlet implementation class Upload001Servlet
 */
public class Upload001Servlet extends HttpServlet {
	 
	Database dbConn;
	String sUploadDir = "/thumbnails/";
	String feldName = "";
	String fileName = "";
	
	/** perform for both HTTP <code>GET</code> and <code>POST</code> methods  */
	protected void perForm(HttpServletRequest request,
			HttpServletResponse response) throws ServletException, IOException {
		String nextPage = "/index.jsp";
		try {
            ServletFileUpload upload = new ServletFileUpload(new DiskFileItemFactory());
            try {
                List files = upload.parseRequest(request);
                byte[] buffer = new byte[8192];
                for (Iterator iter = files.iterator(); iter.hasNext();) {
                    FileItem element = (FileItem) iter.next();
                       if (!element.isFormField()) {
                    	   
                    	   feldName = element.getFieldName();
                    	   
                    	   fileName = element.getName();
                           fileName = fileName.replace('\\', '/');
                           fileName = fileName.substring(fileName.lastIndexOf('/') + 1);
                           InputStream is = element.getInputStream();
                           //Thumbnail thumbnail = new Thumbnail();
                           //System.out.println(thumbnail.createThumbnail("Y:"+System.getProperty("file.separator")+"Bilder Laptop"+System.getProperty("file.separator")+"schöne Bilder"+ System.getProperty("file.separator") + fileName, getServletContext().getRealPath(sUploadDir)+ "\\" + fileName,200));
       					
                           FileOutputStream fos = new FileOutputStream( new File(getServletContext().getRealPath(sUploadDir),fileName));
                           int len = 0;
                           while ((len = is.read(buffer)) > 0) {
                               fos.write(buffer, 0, len);
                           }//while
                           fos.flush();
                           fos.close();
                           is.close();
                       }//element isFormField
                }//for Iterator
            } catch (FileUploadException e) {
                throw new ServletException("FileUploadException");
            }//try
		} catch (Exception e) {
	          System.out.println(this.getClass().getName() + "perForm: " + e.getMessage());
	        }//catch
		performForward(nextPage, request, response);
	}//perForm

	/** handle the next step */
	protected void performForward(String destination,
		HttpServletRequest request, HttpServletResponse response)throws ServletException, IOException {
		
		ServletContext context = getServletContext();
		RequestDispatcher dispatcher = context.getRequestDispatcher(destination);
		dispatcher.forward(request, response);
	}//performForward
	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, 
			HttpServletResponse response) throws ServletException, IOException {
		perForm(request, response);
	}//doGet

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, 
			HttpServletResponse response) throws ServletException, IOException {
		perForm(request, response);
	}//doPost

	/**@return a short description of this Servlet */
	public String getServletInfo() {
	    return "load picture on server an get thumnails";
	}//getServletInfo
	
	/** finally method */
	public void destroy(){
		try {
	        dbConn.close();//DatabaseConnection close
	    } catch (Exception e) {
	        System.out.println(this.getClass().getName()+ " Exception of destroy..: " + e.getMessage());
	    }//catch
	}//destroy
}//class Uplaod001Servlet
