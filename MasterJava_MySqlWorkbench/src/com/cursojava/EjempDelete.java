package com.cursojava;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class EjempDelete {

	public static void main(String[] args) {

		String url="jdbc:mysql://localhost:3306/bdpersonas";
		String user = "root";
		String pwd = "root";
		String query = "delete from personas where nombre= 'pepito'";

		try (Connection conexion = DriverManager.getConnection(url, user, pwd)){
			Statement sentencia = conexion.createStatement();
			sentencia.executeUpdate(query);
			System.out.println("Registro eliminado");
			
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
}
