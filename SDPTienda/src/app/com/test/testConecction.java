package app.com.test;

import java.sql.Connection;
import java.sql.DriverManager;

public class testConecction {
	public static String dimeQueTodoEstaBien() {
		Connection con=null;
		String url="jdbc:derby://localhost:1527/dbDsTienda";
		try {
			con = DriverManager.getConnection(url);
			return "todo esta bien";
		} catch (Exception e) {
			return "nada esta bien";
		}
	}
}
