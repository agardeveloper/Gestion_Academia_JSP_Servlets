package web;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class SLogin
 */
@WebServlet("/slogin")
public class SLogin extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public SLogin() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		//1. Recoger los datos del formulario
		String sUsuario, sContrasenia;
		//Recogemos sUsuario
		sUsuario = request.getParameter("usuario"); //es el usuario del formulario
		sContrasenia = request.getParameter("contrasenia");//contrasenia es la del formulario
		//2. Hacer la lógica y //3. redireccionar
		if ((sContrasenia.equals("admin")&& sUsuario.equalsIgnoreCase("ana"))||(sContrasenia.equals("admin")&& sUsuario.equalsIgnoreCase("gabriela"))) { //si la contraseña es admin va a la página bienvenida
			response.sendRedirect("index.html");
		} else {
			response.sendRedirect("loginAccesoDenegado.html");
		}//fin if-else

		
	}//fin doGet

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
