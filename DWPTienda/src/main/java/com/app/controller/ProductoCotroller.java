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
		 ProductoDaoDerby daoProducto = new ProductoDaoDerby();
		 productos = daoProducto.listProductos();
		 return productos;
	}
}
