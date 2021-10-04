package web;

import java.io.IOException;
import java.sql.SQLException;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


import modelo.Alumno;
import persistencia.AccesoBD;

/**
 * Servlet implementation class SConsultaListados
 */
@WebServlet("/sconsultaalumnos")
public class SConsultaAlumnos extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public SConsultaAlumnos() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// 0. Declarar variables
		List<Alumno> sAlumnos;
		
		// 1. Instanciar la capa de persistencia
		AccesoBD a1 = new AccesoBD();
		// 2. Mandar llamar al método obtener de AccesoBD
		try {
			sAlumnos = a1.obtenerAlumnos();

			if (sAlumnos != null) {
				//Si hay alumnos que mostrar
				//Se guarda la colección de alumnos en el request para luego mostrarse en jsp
	
				request.setAttribute("listadoAlumnos", sAlumnos);
				RequestDispatcher rd = request.getRequestDispatcher("/mostrarAlumnos.jsp");
				rd.forward(request, response);
				
			}
			RequestDispatcher rd = request.getRequestDispatcher("/fAlumno.jsp");
			rd.forward(request, response);
			
			
		} catch (ClassNotFoundException | SQLException e) {
			// TODO Auto-generated catch block
			System.out.println(e.toString());
			RequestDispatcher rd = request.getRequestDispatcher("fAlumno.jsp");
			rd.forward(request, response);
		}
	}//fin doGet

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
		
	}//fin doPost

}//fin Servlet
