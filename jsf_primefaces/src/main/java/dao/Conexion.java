package dao;

import java.sql.*;

public class Conexion {
	
	public static Connection cnx = null;
	
	public static Connection conectar() throws Exception {
		try {
			Class.forName("com.mysql.jdbc.Driver");
			cnx = DriverManager.getConnection("jdbc:mysql://localhost:3306/DemoDB", "root", "administrador");
		} catch (ClassNotFoundException ex) {
			System.out.println(ex.getClass().getName() + ": "+ ex.getMessage());
		}
		
		return cnx;
	}

	public static void cerrarCnx() throws Exception {
		if (Conexion.cnx != null) {
			cnx.close();
		}
	}
	
	public static void main(String[] args) throws Exception{
		conectar();
		if (cnx != null) {
			System.out.println("Conectado con MySQL");
		} else {
			System.out.println("Falló en conectar");
		}
	}

	public static Connection getCnx() {
		return cnx;
	}

	public static void setCnx(Connection cnx) {
		Conexion.cnx = cnx;
	}
}