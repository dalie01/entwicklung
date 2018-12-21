package selinas.servlets;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import dalie.Dalie;
import database.Database;

/**
 * Servlet implementation class DokumentToProcess
 */
public class DokumentToProcess extends HttpServlet {
	private static final long serialVersionUID = 1L;

	Database dbConn;

	/** perform for both HTTP <code>GET</code> and <code>POST</code> methods  */
	protected void perForm(HttpServletRequest request,
			HttpServletResponse response) throws ServletException, IOException {
			String nextPage = "/index.jsp";
			HttpSession session = request.getSession();
			dbConn = (Database) session.getAttribute("Database");
			try {
				session.setAttribute("Dokument", Dalie.getDokumentOfUpdate(
						dbConn, request));
				nextPage = "/selinas/selinas001.jsp";
			} catch (Exception e) {
				System.out.println(this.getClass().getName()
						+ " Exception of perForm..: " + e.getMessage());
			}//DatabaseConnection open

			performForward(nextPage, request, response);
	}//perForm

	/** handle the next step */
	protected void performForward(String destination,
			HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		
			ServletContext context = getServletContext();
			RequestDispatcher dispatcher = context.getRequestDispatcher(destination);
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
	public DokumentToProcess() {
		super();
	}//DokumentToProcess

}//class DokumentToProcessServlet
