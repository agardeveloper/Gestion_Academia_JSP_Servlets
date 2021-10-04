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
 * Servlet implementation class SeliminaAlumno
 */
@WebServlet("/s_elimina_alumno")
public class SeliminaAlumno extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#HttpServlet()
	 */
	public SeliminaAlumno() {
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
		
		AccesoBD abd = new AccesoBD();

		RequestDispatcher rd = request.getRequestDispatcher("/exito.jsp");
		boolean exito = false;

		// 2. Lógica de negocio
		try {
			exito = abd.bajaAlumno(sDni);
			request.setAttribute("mensaje", "La baja se ha ejecutado exitosamente");
			// 3. Redireccionamiento
		} catch (ClassNotFoundException | SQLException e) {
			System.out.println(e.toString());
			request.setAttribute("mensaje", "Se ha producido un error al dar de baja" + e.toString());
		} // fin try-catch

		rd.forward(request, response);

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
