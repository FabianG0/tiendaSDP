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
		String sql = "INSERT INTO productos ( producto,id_categoria,descripcion ,precio_venta,existencia) values ('"+newProducto.getProducto()+"',"+newProducto.getId_categoria()+",'"+newProducto.getDescripcion()+"',"+newProducto.getPrecio_venta()+","+newProducto.getExistencia()+")";
		try{
            ps = con.prepareStatement(sql);
            rs = ps.executeQuery();
            return true;
        }catch(Exception e){
        	return false;
        }
	}

	@Override
	public boolean updateProducto(Producto newProducto, int idCurrentProducto) {
		// TODO Auto-generated method stub
		String sql = "UPDATE productos SET producto = '"+newProducto.getProducto()+"', id_categoria = "+newProducto.getId_categoria()+", descripcion = '"+newProducto.getDescripcion()+"', precio_venta = "+newProducto.getPrecio_venta()+", existencia = "+newProducto.getExistencia()+" WHERE id_producto = "+idCurrentProducto;
		try{
            ps = con.prepareStatement(sql);
            rs = ps.executeQuery();
            return true;
        }catch(Exception e){
        	return false;
        }
	}

	@Override
	public boolean deleteProducto(int idProducto) {
		// TODO Auto-generated method stub
		String sql = "DELETE FROM productos WHERE id_producto="+idProducto;
		try{
            ps = con.prepareStatement(sql);
            rs = ps.executeQuery();
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
		return null;
	}

}
