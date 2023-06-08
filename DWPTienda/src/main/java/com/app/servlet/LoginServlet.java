package com.app.servlet;

import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;
import com.app.controller.ProductoCotroller;
/**
 * Servlet implementation class LoginServlet
 */
public class LoginServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public LoginServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String correo = request.getParameter("email");
		String contraseña = request.getParameter("password");
		if(correo.equals("root") && contraseña.equals("toor")) {
			//administrador
			request.setAttribute("productos", ProductoCotroller.getAllProductos());
			request.getRequestDispatcher("/vistas/inventario.jsp").forward(request, response);
			RequestDispatcher dispatcher = request.getRequestDispatcher("/vistas/inventario.jsp");
		    dispatcher.forward(request, response);
		}else {
			//empleado aqui va lo de irvin
			RequestDispatcher dispatcher = request.getRequestDispatcher("#");
		    dispatcher.forward(request, response);
		}
		
	}

}
