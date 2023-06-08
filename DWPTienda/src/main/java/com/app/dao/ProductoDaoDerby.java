package com.app.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;

import com.app.configuration.Conexion;
import com.app.modelo.Producto;

public class ProductoDaoDerby implements ProductoDao{
	Connection con = Conexion.getConexion();
	PreparedStatement ps;
    ResultSet rs;
    
	@Override
	public boolean insertProducto(Producto newProducto) {
		String sql = "INSERT INTO productos ( producto,id_categoria,descripcion,precio_venta,existencia) values (?,?,?,?,?)";
		try{
            ps = con.prepareStatement(sql);
            ps.setString(1, newProducto.getProducto());
            ps.setInt(2, newProducto.getId_categoria());
            ps.setString(3, newProducto.getDescripcion());
            ps.setDouble(4, newProducto.getPrecio_venta());
           // ps.setBlob(5, newProducto.getImagen());
            ps.setInt(5, newProducto.getExistencia());
            ps.executeUpdate();
            ps.close();
            return true;
        }catch(Exception e){
        	return false;
        }
	}
	@Override
	public boolean updateProducto(Producto newProducto, int idProducto) {
		// TODO Auto-generated method stub
		String sql = "UPDATE productos SET producto = ?, id_categoria = ?, descripcion = ?, precio_venta = ?, existencia = ? WHERE id_producto = ?";
		try{
			 ps = con.prepareStatement(sql);
	         ps.setString(1, newProducto.getProducto());
	         ps.setInt(2, newProducto.getId_categoria());
	         ps.setString(3, newProducto.getDescripcion());
	         ps.setDouble(4, newProducto.getPrecio_venta());
	         ps.setInt(5, newProducto.getExistencia());
	         ps.setInt(6, idProducto);
	         ps.executeUpdate();
	         ps.close();
            return true;
        }catch(Exception e){
        	return false;
        }
	}

	@Override
	public boolean deleteProducto(int idProducto) {
		// TODO Auto-generated method stub
		String sql = "DELETE FROM productos WHERE id_producto = ?";
		try{
            ps = con.prepareStatement(sql);
            ps.setInt(1,idProducto);
            ps.executeUpdate();
            ps.close();
            return true;
        }catch(Exception e){
        	return false;
        }
	}

	@Override
	public ArrayList<Producto> listProductos() {
		ArrayList<Producto> productos = new ArrayList<>();
		String sql = "SELECT * FROM productos";
        try{
            ps = con.prepareStatement(sql);
            rs = ps.executeQuery();
            while(rs.next()){
                Producto p = new Producto();
                p.setId_producto(rs.getInt(1));
                p.setProducto(rs.getString(2));
                p.setId_categoria(rs.getInt(3));
                p.setDescripcion(rs.getString(4));
                p.setPrecio_venta(rs.getDouble(5));
                p.setImagen(rs.getBinaryStream(6));
                p.setExistencia(rs.getInt(7));
                productos.add(p);
                
            }
        }catch(Exception e){
        	return null;
        }
        return productos;
	}

	@Override
	public Producto selectProducto(int idProducto) {
		// TODO Auto-generated method stub
		String sql = "SELECT * FROM productos WHERE id_producto = ?";
		try{
            ps = con.prepareStatement(sql);
            ps.setInt(1, idProducto);
            rs = ps.executeQuery();
            rs.next();
            Producto p = new Producto();
            p.setId_producto(rs.getInt(1));
            p.setProducto(rs.getString(2));
            p.setId_categoria(rs.getInt(3));
            p.setDescripcion(rs.getString(4));
            p.setPrecio_venta(rs.getDouble(5));
            p.setImagen(rs.getBinaryStream(6));
            p.setExistencia(rs.getInt(7));
            ps.close();
            return p;
        }catch(Exception e){
        	return null;
        }
	}

}
