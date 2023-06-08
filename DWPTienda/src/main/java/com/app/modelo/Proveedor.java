package com.app.modelo;

public class Proveedor {
	int id_proveedor;
	  String empresa;
	  String representante;
	  String direccion;
	  String telefono;
	  String correo_electronico;
	  int estatus;
	  
	public Proveedor(int id_proveedor, String empresa, String representante, String direccion, String telefono,
			String correo_electronico, int estatus) {
		super();
		this.id_proveedor = id_proveedor;
		this.empresa = empresa;
		this.representante = representante;
		this.direccion = direccion;
		this.telefono = telefono;
		this.correo_electronico = correo_electronico;
		this.estatus = estatus;
	}
	public Proveedor() {
		super();
	}
	public int getId_proveedor() {
		return id_proveedor;
	}
	public void setId_proveedor(int id_proveedor) {
		this.id_proveedor = id_proveedor;
	}
	public String getEmpresa() {
		return empresa;
	}
	public void setEmpresa(String empresa) {
		this.empresa = empresa;
	}
	public String getRepresentante() {
		return representante;
	}
	public void setRepresentante(String representante) {
		this.representante = representante;
	}
	public String getDireccion() {
		return direccion;
	}
	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}
	public String getTelefono() {
		return telefono;
	}
	public void setTelefono(String telefono) {
		this.telefono = telefono;
	}
	public String getCorreo_electronico() {
		return correo_electronico;
	}
	public void setCorreo_electronico(String correo_electronico) {
		this.correo_electronico = correo_electronico;
	}
	public int getEstatus() {
		return estatus;
	}
	public void setEstatus(int estatus) {
		this.estatus = estatus;
	}
}
