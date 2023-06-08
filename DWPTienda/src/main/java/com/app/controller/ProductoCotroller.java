package com.app.controller;

import java.io.InputStream;
import java.util.ArrayList;

import com.app.dao.ProductoDaoDerby;
import com.app.modelo.Producto;

public class ProductoCotroller {
	/**
	 *  funtion that create a new product and insert in database
	 */
	public static boolean CreateProducto(int id_producto, String producto, int id_categoria, String descripcion, float precio_venta, InputStream imagen, int existencia) {
		Producto newProducto = new Producto(id_categoria,producto,id_categoria,descripcion,precio_venta,imagen,existencia);
		ProductoDaoDerby productoDao = new ProductoDaoDerby();
		return productoDao.insertProducto(newProducto);
	}
	/**
	 *  funtion that retun all products 
	 */
	public static ArrayList<Producto> getAllProductos(){
		 ArrayList<Producto> productos = new ArrayList<>();
		 ProductoDaoDerby productoDao= new ProductoDaoDerby();
		 productos = productoDao.listProductos();
		 return productos;
	}
	/**
	 * funtion that deletes a product
	 */
	public static boolean deleteProducto(int id_producto) {
		 ProductoDaoDerby productoDao= new ProductoDaoDerby();
		 return productoDao.deleteProducto(id_producto);
	}
}
