package com.app.servelet;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;

import com.app.dao.ProductoDaoDerby;

/**
 * Servlet implementation class ProductoServelet
 */
public class ProductoServelet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public ProductoServelet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		int id_producto = 0;
		String producto = request.getParameter("producto").toString();
		int id_categoria = Integer.parseInt(request.getParameter("categoria"));
		String descripcion = request.getParameter("descripcion").toString();
		float precio_venta = Float.parseFloat(request.getParameter("precio"));
		PrintWriter salida;
		String respuesta;
		ProductoDaoDerby newProductos = new ProductoDaoDerby();
		salida = response.getWriter();
		
		response.setContentType("text/html");
		respuesta = "<!DOCTYPE html> \r\n" + "<html lang='en'> \r\n" + "<head>\r\n"
				+ "<title>hmb - Resultados</title>\r\n" + "</head>\r\n" + "<body>\r\n"
				+ "<h1>Y los resultados son ...</h1>";
		salida.println(respuesta);
		respuesta = "\r\n"  + "\r\n" + newProductos.listProductos() + "</body>\r\n" + "</html>";
		salida.println(respuesta);
		
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
