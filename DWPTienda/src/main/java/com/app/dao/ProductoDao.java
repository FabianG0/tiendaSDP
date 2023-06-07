package com.app.dao;

import java.util.ArrayList;

import com.app.modelo.Producto;


public interface ProductoDao {
	public ArrayList<Producto> listProductos();
	public Producto selectProducto(int idProducto);
	public Producto insertProduto(Producto newProducto);
	public boolean updateProducto(Producto nweProducto,int idCurrentProducto);
	public boolean deleteProducto(int idProducto);
}
