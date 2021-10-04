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
 * Servlet implementation class SaltaAlumno
 */
@WebServlet("/s_alta_alumno")
public class SaltaAlumno extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public SaltaAlumno() {
        super();
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.getWriter().append("Served at: ").append(request.getContextPath());
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		//1. Recoger los datos
		String dni = request.getParameter("dni");
		String nombre = request.getParameter("nombre");
		String apellidos = request.getParameter("apellidos");
		String telefono = request.getParameter("telefono");
		String email = request.getParameter("email");
		
		//2. Logica de negocio
		Alumno a1 = new Alumno(dni, nombre, apellidos, telefono, email);
		
		//3. Redireccionar
		RequestDispatcher rd = request.getRequestDispatcher("/exito.jsp");
		AccesoBD abd = new AccesoBD();
		boolean exito = false;
		try {
			exito = abd.altaAlumno(a1);
			request.setAttribute("mensaje", "El alta se ha ejecutado exitosamente");
		} catch (ClassNotFoundException | SQLException e) {
			System.out.println(e.toString());
			request.setAttribute("mensaje", "Se ha producido un error al dar de alta" + e.toString());
		}//fin try-catch
		
		rd.forward(request, response);
		
	}//fin doPost

}//fin servlet
