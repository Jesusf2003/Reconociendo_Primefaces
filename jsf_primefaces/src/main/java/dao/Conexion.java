package dao;

import java.sql.*;

public class Conexion {
	
	public static Connection cnx = null;
	
	public static Connection conectar() throws Exception {
		try {
			Class.forName("org.postgresql.Driver");
			cnx = DriverManager.getConnection("jdbc:postgresql://localhost:5432/DemoDB", "postgres", "pgsql1234");
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
			System.out.println("Conectado con Postgre");
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