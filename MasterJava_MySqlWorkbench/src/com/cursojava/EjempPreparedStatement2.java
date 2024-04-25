package com.cursojava;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Scanner;

public class EjempPreparedStatement2 {
	public static void main(String[] args) {

		String url = "jdbc:mysql://localhost:3306/bdpersonas";
		String user = "root";
		String pwd = "root";
		String preparedQuery = "select * from personas where nombre = ?";
		String valorQuery = "pepito";
		
		try (Connection conexion = DriverManager.getConnection(url, user, pwd);
				PreparedStatement sentencia = generarConsultaParametrizada(preparedQuery,valorQuery, conexion);
				ResultSet rs = sentencia.executeQuery();){
			
			while (rs.next()) {
				System.out.println(rs.getString(1) + " " + rs.getString(2) + " " + rs.getInt(3));
			}

		} catch (SQLException e) {

			e.printStackTrace();
		}

	}

	private static PreparedStatement generarConsultaParametrizada(String sql, String nombre, Connection conexion)
			throws SQLException {
		PreparedStatement consultaParametrizada = conexion.prepareStatement(sql);
		consultaParametrizada.setString(1, nombre);
		return consultaParametrizada;

	}
}
