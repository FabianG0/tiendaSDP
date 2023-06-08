package com.app.servlet;

import java.io.IOException;
import java.io.InputStream;

import com.app.controller.ProductoCotroller;
import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.MultipartConfig;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class ProductosServlet
 */
@MultipartConfig
public class ProductosServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void processRequest(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		String accion = request.getParameter("accion");
		if(accion!=null) {
			switch (accion) {
			case "inventario":
				redirectInventario(request, response);
				break;
			case "delete":
				int id_producto = Integer.parseInt(request.getParameter("id_producto"));
				if(ProductoCotroller.deleteProducto(id_producto)) {
					redirectInventario(request, response);
				}else {
					redirectInventario(request, response);
				}
				break;
			default:
			}
		}else {
			String producto = request.getParameter("producto");
			String descripcion = request.getParameter("descripcion");
			int categoria = Integer.parseInt(request.getParameter("categoria"));
			int existencia = Integer.parseInt(request.getParameter("existencia"));
			float precio = Float.parseFloat(request.getParameter("precio"));
			///InputStream imagen = request.getPart("imagen").getInputStream();
			if (ProductoCotroller.CreateProducto(0, producto, categoria, descripcion, precio, null, existencia)) {
				redirectInventario(request, response);
			}
		}
	}

	/**
	 * @see HttpServlet#HttpServlet()
	 */
	public ProductosServlet() {
		super();
		// TODO Auto-generated constructor stub
	}

	@Override
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		processRequest(request, response);
	}

	@Override
	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		processRequest(request, response);
	}
	
	private void redirectInventario(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		RequestDispatcher dispatcher;
		request.setAttribute("productos", ProductoCotroller.getAllProductos());
		request.getRequestDispatcher("/vistas/inventario.jsp").forward(request, response);
		dispatcher = request.getRequestDispatcher("/vistas/inventario.jsp");
		dispatcher.forward(request, response);
	}
}
