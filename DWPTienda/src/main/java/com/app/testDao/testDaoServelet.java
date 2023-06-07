package com.app.testDao;

import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

import com.app.dao.ProductoDaoDerby;


/**
 * Servlet implementation class testDaoServelet
 */
public class testDaoServelet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public testDaoServelet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
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
