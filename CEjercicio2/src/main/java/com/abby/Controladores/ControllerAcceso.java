package com.abby.Controladores;

import java.io.IOException;
import java.util.ArrayList;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.abby.DAO.ClsUsuario;
import com.abby.Entidades.Loguin;
import com.abby.Entidades.Usuario;
import com.abby.Negocio.ClsLoguin;

/**
 * Servlet implementation class ControllerAcceso
 */
@WebServlet("/ControllerMostrarInformacion")
public class ControllerAcceso extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public ControllerAcceso() {
        super();
        // TODO Auto-generated constructor stub
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
		// TODO Auto-generated method stub
		//doGet(request, response);
       HttpSession session = request.getSession(true);
		
		String btncerra = request.getParameter("btncerrar");
		
		if(btncerra!=null) {
			response.sendRedirect("index.jsp");
			session.invalidate();
			
		}else {
		
		
		String user = request.getParameter("user");
		String pass = request.getParameter("pass");
		Loguin log = new Loguin();
		ClsLoguin clsL = new ClsLoguin();
		
		log.setUser(user);
		log.setPass(pass);
		
		int valoracceso = clsL.acceso(log);
		
		if(valoracceso==1) {
			ClsUsuario clsUsuario = new ClsUsuario();
			ArrayList<Usuario> Usuario = clsUsuario.ListadoUSUARIOS();
			response.sendRedirect("Saludo.jsp");
			session.setAttribute("usuario", valoracceso);
			for(Usuario iterar : Usuario)
			{
				System.out.println(iterar.getUsuario());
			}
		}else {
			response.sendRedirect("Error.jsp");
		}
		}
	}

		
	

}
