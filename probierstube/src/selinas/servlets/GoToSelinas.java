package selinas.servlets;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.Servlet;
import javax.servlet.ServletConfig;
import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import dalie.Dalie;
import database.Database;

/**
 * Servlet implementation class GoToSelinas
 */
public class GoToSelinas extends HttpServlet {
	private static final long serialVersionUID = 1L;

	Database dbConn;

	/** @see Servlet#init(ServletConfig)*/
	public void init(ServletConfig config) throws ServletException {
		
		
			super.init(config);
			String dbType = config.getInitParameter("dbType");
			String dbHost = config.getInitParameter("dbHost");
			String dbSchema = config.getInitParameter("dbSchema");
			String user = config.getInitParameter("user");
			String password = config.getInitParameter("password");
			dbConn = new Database(dbType, dbHost, dbSchema, user, password);
			
	}//init

	/** perform for both HTTP <code>GET</code> and <code>POST</code> methods  */
	protected void perForm(HttpServletRequest request,
			HttpServletResponse response) throws ServletException, IOException {
		

			HttpSession session = request.getSession();
			session.setAttribute("Database", dbConn);

			try {
				session.setAttribute("Dokument", Dalie
						.getDokumentOfDatabase(dbConn));
			} catch (Exception e) {
				System.out.println(this.getClass().getName()
						+ " Exception of perForm..: " + e.getMessage());
			}//DatabaseConnection open
			performForward("/selinas/selinas001.jsp", request, response);
			
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
	public GoToSelinas() {
		super();
	}//GoToSelinas

}//class GoToSelinas
