package app.com.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;

import app.com.configuration.Conexion;
import app.com.modelo.Producto;

public class ProductoDaoDerby implements ProductoDao{
	Connection con;
	PreparedStatement ps;
    ResultSet rs;
    
	@Override
	public Producto insertProduto(Producto newProducto) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public boolean updateProducto(Producto nweProducto, int idCurrentProducto) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean deleteProducto(int idProducto) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public ArrayList<Producto> listProductos() {
		ArrayList<Producto> productos = new ArrayList<>();
		String sql = "SELECT * FROM productos";
        try{
            con = Conexion.getConexion();
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
