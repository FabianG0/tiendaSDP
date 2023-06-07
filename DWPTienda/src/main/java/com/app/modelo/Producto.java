package com.app.modelo;

import java.io.InputStream;

public class Producto {

	int id_producto;
    String producto;
    int id_categoria;
    String descripcion;
    double precio_venta;
    InputStream imagen;
    int existencia;

    public Producto() {
    }

    public Producto(int id_producto, String producto, int id_categoria, String descripcion, float precio_venta, InputStream imagen, int existencia) {
        this.id_producto = id_producto;
        this.producto = producto;
        this.id_categoria = id_categoria;
        this.descripcion = descripcion;
        this.precio_venta = precio_venta;
        this.imagen = imagen;
        this.existencia = existencia;
    }

    public int getId_producto() {
        return id_producto;
    }

    public void setId_producto(int id_producto) {
        this.id_producto = id_producto;
    }

    public String getProducto() {
        return producto;
    }

    public void setProducto(String producto) {
        this.producto = producto;
    }

    public int getId_categoria() {
        return id_categoria;
    }

    public void setId_categoria(int id_categoria) {
        this.id_categoria = id_categoria;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public double getPrecio_venta() {
        return precio_venta;
    }

    public void setPrecio_venta(double precio_venta) {
        this.precio_venta = precio_venta;
    }

    public InputStream getImagen() {
        return imagen;
    }

    public void setImagen(InputStream imagen) {
        this.imagen = imagen;
    }

    public int getExistencia() {
        return existencia;
    }

    public void setExistencia(int existencia) {
        this.existencia = existencia;
    }

}
