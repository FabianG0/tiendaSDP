package com.app.dao;

import java.util.ArrayList;

import com.app.modelo.Proveedor;


public interface ProveedorDao {
	public ArrayList<Proveedor> listProveedores();
	public Proveedor selectProveedor(int idProvedor);
	public boolean insertProveedor(Proveedor newProveedor);
	public boolean updateProveedor(Proveedor nweProveedor,int idProveedor);
	public boolean deleteProveedor(int idProveedor);
}
