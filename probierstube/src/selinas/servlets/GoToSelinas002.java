package selinas.servlets;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import database.Database;

/**
 * Servlet implementation class GoToSelinas002
 */
public class GoToSelinas002 extends HttpServlet {
	private static final long serialVersionUID = 1L;

	Database dbConn;

	/** perform for both HTTP <code>GET</code> and <code>POST</code> methods  */
	protected void perForm(HttpServletRequest request,
			HttpServletResponse response) throws ServletException, IOException {
			String nextPage = "/index.jsp";

			if (request.getParameter("goSelinas002") != null)
				nextPage = "/selinas/selinas002.jsp";

			performForward(nextPage, request, response);
		
	}//perForm

	/** handle the next step */
	protected void performForward(String destination,
			HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		
			ServletContext context = getServletContext();
			RequestDispatcher dispatcher = context
					.getRequestDispatcher(destination);
			dispatcher.forward(request, response);
		
	}//performForward

	/** @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response) */
	protected void doGet(HttpServletRequest request,
			HttpServletResponse response) throws ServletException, IOException {
	
			perForm(request, response);
		
	}//doGet

	/** @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)*/
	protected void doPost(HttpServletRequest request,
			HttpServletResponse response) throws ServletException, IOException {
		
			perForm(request, response);
	
	}//doPost

	/** @see HttpServlet#HttpServlet() */
	public GoToSelinas002() {
		super();
	}//GoToSelinas002

}//class GoToSelinas002
