package com.cursojava;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class EjempSelect {
	public static void main(String[] args) {
		
		String url="jdbc:mysql://localhost:3306/bdpersonas";
		String user = "root";
		String pwd = "root";
		String query = "select * from personas";
	
		try (Connection conexion = DriverManager.getConnection(url, user, pwd)){
			
			Statement sentencia = conexion.createStatement();
			ResultSet rs = sentencia.executeQuery(query);
			
			while(rs.next()) {
				System.out.print(rs.getString("nombre"));
				System.out.print(" ");
				System.out.print(rs.getString("apellido"));
				System.out.print(" ");
				System.out.print(rs.getInt("edad"));
				System.out.println();

			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
		/*manera en que lo hace Isabel
		 * 		try (Connection conexion = DriverManager.getConnection(url, user, pwd);
		  	Statement sentencia = conexion.createStatement();
			ResultSet rs = sentencia.executeQuery(query);
		 * ){

			while(rs.next()) {
				System.out.print(rs.getString("nombre"));
				System.out.print(" ");
				System.out.print(rs.getString("apellido"));
				System.out.print(" ");
				System.out.print(rs.getInt("edad"));
				System.out.println();

			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		 */
	}	
}
