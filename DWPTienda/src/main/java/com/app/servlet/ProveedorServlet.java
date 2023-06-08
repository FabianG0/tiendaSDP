package com.app.servlet;

import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;

import com.app.controller.ProveedorCotroller;
import com.app.modelo.Proveedor;

/**
 * Servlet implementation class ProveedorServlet
 */
public class ProveedorServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public ProveedorServlet() {
        super();
        // TODO Auto-generated constructor stub
    }
    
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		String accion = request.getParameter("accion");
		int id_Proveedor;
		if(accion!=null) {
			switch (accion) {
			case "proveedores":
				redirectDirectory(request, response);
				break;
			case "delete":
				id_Proveedor = Integer.parseInt(request.getParameter("id_proveedor"));
				if(ProveedorCotroller.deleteProveedor(id_Proveedor)) {
					redirectDirectory(request, response);
				}else {
					redirectDirectory(request, response);
				}
				break;
			case "update":
				id_Proveedor = Integer.parseInt(request.getParameter("id_proveedor"));
				Proveedor currentProveedor = ProveedorCotroller.getProveedorByID(id_Proveedor);
				RequestDispatcher dispatcher;
				request.setAttribute("proveedor", currentProveedor);
				request.getRequestDispatcher("/vistas/formularioProveedorModificar.jsp").forward(request, response);
				dispatcher = request.getRequestDispatcher("/vistas/formularioProveedorModificar.jsp");
				dispatcher.forward(request, response);
				break;
			default:
			}
		}else {
			String empresa = request.getParameter("empresa");
			String representante = request.getParameter("representante");
			String direccion = request.getParameter("direccion");
			String telefono = request.getParameter("teleono");
			String correo_electronico = request.getParameter("correo_electronico");
				if(request.getParameter("Id_proveedor") != null) {
				int idProveedor = Integer.parseInt(request.getParameter("Id_proveedor"));
				if (ProveedorCotroller.updateProveedor(idProveedor,empresa,representante,direccion,telefono,correo_electronico)) {
					redirectDirectory(request, response);
				}
				redirectDirectory(request, response);
			}else {
				if (ProveedorCotroller.CreateProveedor(0, empresa,representante,direccion,telefono,correo_electronico)) {
					redirectDirectory(request, response);
				}
			}
		}
	}
	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		processRequest(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		processRequest(request, response);
	}
	private void redirectDirectory(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		RequestDispatcher dispatcher;
		request.setAttribute("Proveedores", ProveedorCotroller.getAllProveedores());
		request.getRequestDispatcher("/vistas/proveedores.jsp").forward(request, response);
		dispatcher = request.getRequestDispatcher("/vistas/proveedores.jsp");
		dispatcher.forward(request, response);
	}

}
