package com.app.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;

import com.app.configuration.Conexion;
import com.app.modelo.Proveedor;

public class ProveedorDaoDerby implements ProveedorDao{
	Connection con = Conexion.getConexion();
	PreparedStatement ps;
    ResultSet rs;
    
	@Override
	public boolean insertProveedor(Proveedor newProveedor) {
		String sql = "INSERT INTO proveedor (empresa,representante,direccion,telefono,correo_electronico,estatus) values (?,?,?,?,?,1)";
		try{
            ps = con.prepareStatement(sql);
            ps.setString(1, newProveedor.getEmpresa());
            ps.setString(2, newProveedor.getRepresentante());
            ps.setString(3, newProveedor.getDireccion());
            ps.setString(4, newProveedor.getTelefono());
            ps.setString(5, newProveedor.getCorreo_electronico());
            ps.executeUpdate();
            ps.close();
            return true;
        }catch(Exception e){
        	return false;
        }
	}
	@Override
	public boolean updateProveedor(Proveedor newProveedor, int idProveedor) {
		// TODO Auto-generated method stub
		String sql = "UPDATE proveedor SET empresa = ?,representante = ?,direccion = ?,telefono = ?,correo_electronico = ? WHERE id_proveedor = ?";
		try{
			 ps = con.prepareStatement(sql);
	         ps.setString(1, newProveedor.getEmpresa());
	         ps.setString(2, newProveedor.getRepresentante());
	         ps.setString(3, newProveedor.getDireccion());
	         ps.setString(4, newProveedor.getTelefono());
	         ps.setString(5, newProveedor.getCorreo_electronico());
	         ps.setInt(6, idProveedor);
	         ps.executeUpdate();
	         ps.close();
            return true;
        }catch(Exception e){
        	return false;
        }
	}

	@Override
	public boolean deleteProveedor(int idProveedor) {
		// TODO Auto-generated method stub
		String sql = "DELETE FROM proveedor WHERE id_proveedor = ?";
		try{
            ps = con.prepareStatement(sql);
            ps.setInt(1,idProveedor);
            ps.executeUpdate();
            ps.close();
            return true;
        }catch(Exception e){
        	return false;
        }
	}

	@Override
	public ArrayList<Proveedor> listProveedores() {
		ArrayList<Proveedor> Proveedores = new ArrayList<>();
		String sql = "SELECT * FROM proveedor";
        try{
            ps = con.prepareStatement(sql);
            rs = ps.executeQuery();
            while(rs.next()){
                Proveedor p = new Proveedor();
                p.setId_proveedor(rs.getInt(1));
                p.setEmpresa(rs.getString(2));
                p.setRepresentante(rs.getString(3));
                p.setDireccion(rs.getString(4));
                p.setTelefono(rs.getString(5));
                p.setCorreo_electronico(rs.getString(6));
                p.setEstatus(1);
                Proveedores.add(p);
                
            }
        }catch(Exception e){
        	return null;
        }
        return Proveedores;
	}

	@Override
	public Proveedor selectProveedor(int idProveedor) {
		// TODO Auto-generated method stub
		String sql = "SELECT * FROM proveedor WHERE id_Proveedor = ?";
		try{
            ps = con.prepareStatement(sql);
            ps.setInt(1, idProveedor);
            rs = ps.executeQuery();
            rs.next();
            Proveedor p = new Proveedor();
            p.setId_proveedor(rs.getInt(1));
            p.setEmpresa(rs.getString(2));
            p.setRepresentante(rs.getString(3));
            p.setDireccion(rs.getString(4));
            p.setTelefono(rs.getString(5));
            p.setCorreo_electronico(rs.getString(6));
            p.setEstatus(1);
            ps.close();
            return p;
        }catch(Exception e){
        	return null;
        }
	}

}
