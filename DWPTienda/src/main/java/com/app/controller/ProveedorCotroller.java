package com.app.controller;

import java.io.InputStream;
import java.util.ArrayList;

import com.app.dao.ProveedorDaoDerby;
import com.app.modelo.Proveedor;

public class ProveedorCotroller {
	/**
	 *  funtion that create a new Supplier and insert in database
	 */
	public static boolean CreateProveedor(int id_Proveedor, String empresa, String representante, String direccion, String telefono, String correoElectronico ) {
		Proveedor newProveedor = new Proveedor(0,empresa, representante, direccion, telefono, correoElectronico,1);
		ProveedorDaoDerby ProveedorDao = new ProveedorDaoDerby();
		return ProveedorDao.insertProveedor(newProveedor);
	}
	/**
	 *  funtion that retun all Suppliers 
	 */
	public static ArrayList<Proveedor> getAllProveedores(){
		 ArrayList<Proveedor> Proveedores = new ArrayList<>();
		 ProveedorDaoDerby ProveedorDao= new ProveedorDaoDerby();
		 Proveedores = ProveedorDao.listProveedores();
		 return Proveedores;
	}
	/**
	 * funtion that deletes a Supplier
	 */
	public static boolean deleteProveedor(int id_Proveedor) {
		 ProveedorDaoDerby ProveedorDao= new ProveedorDaoDerby();
		 return ProveedorDao.deleteProveedor(id_Proveedor);
	}
	/**
	 * funtion that update a Supplier
	 */
	public static boolean updateProveedor(int id_Proveedor, String empresa, String representante, String direccion, String telefono, String correoElectronico ) {
		Proveedor newProveedor = new Proveedor(id_Proveedor,empresa, representante, direccion, telefono, correoElectronico,1);
		ProveedorDaoDerby ProveedorDao = new ProveedorDaoDerby();
		return ProveedorDao.updateProveedor(newProveedor, id_Proveedor);
	}
	/**
	 * funtion that return a Supplier by its id
	 */
	public static Proveedor getProveedorByID(int id_Proveedor) {
		ProveedorDaoDerby ProveedorDao = new ProveedorDaoDerby();
		Proveedor newProveedor = ProveedorDao.selectProveedor(id_Proveedor);
		return newProveedor;
	}
}
