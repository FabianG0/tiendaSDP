package com.app.configuration;

import java.sql.Connection;
import java.sql.DriverManager;

public class Conexion {
	public static Connection getConexion() {
		Connection con=null;
		String url="jdbc:derby://localhost:1527/dbDsTienda";
		try {
			con = DriverManager.getConnection(url);
			return con;
		} catch (Exception e) {
			return null;
		}
	}
}
