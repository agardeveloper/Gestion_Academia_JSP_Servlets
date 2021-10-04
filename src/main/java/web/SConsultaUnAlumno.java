package web;

import java.io.IOException;
import java.sql.SQLException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import modelo.Alumno;
import persistencia.AccesoBD;

/**
 * Servlet implementation class SConsultaUnAlumno
 */
@WebServlet("/s_consulta_un_alumno")
public class SConsultaUnAlumno extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#HttpServlet()
	 */
	public SConsultaUnAlumno() {
		super();
		// TODO Auto-generated constructor stub
	}

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		// 1. Recoger los datos del formulario
		String sDni = request.getParameter("dni");
		Alumno sA1 = new Alumno();

		AccesoBD abd = new AccesoBD();

		// 2. Lógica de negocio
		try {
			sA1 = abd.consultaUnAlumno(sDni);
			if (sA1 != null) {
			request.setAttribute("alumno", sA1);
			RequestDispatcher rd = request.getRequestDispatcher("/mostrarUnAlumno.jsp");
			rd.forward(request, response);
			}
			RequestDispatcher rd = request.getRequestDispatcher("/fConsultaAlumno.html");
			rd.forward(request, response);
			// 3. Redireccionamiento
		} catch (ClassNotFoundException | SQLException e) {
			System.out.println(e.toString());
			RequestDispatcher rd = request.getRequestDispatcher("/fConsultaAlumno.html");
			rd.forward(request, response);
		} // fin try-catch

	}// fin doGet

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}// fin doPost

}// fin servlet
