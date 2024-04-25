package com.cursojava.ejer1;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class EjerEmpleados {
	private static PreparedStatement insertConsultaParametrizada(String sql, Connection conexion) 
			throws SQLException {
		PreparedStatement consultaParametrizada = conexion.prepareStatement(sql);
		consultaParametrizada.setInt(1, 1);
		consultaParametrizada.setString(2, "Juan");
		consultaParametrizada.setDate(3, null);
		consultaParametrizada.setDouble(4, 22.30);
		return consultaParametrizada;
		
	}
	private static PreparedStatement updateConsultaParametrizada(String sql, Connection conexion) 
			throws SQLException {
		PreparedStatement consultaParametrizada = conexion.prepareStatement(sql);
		consultaParametrizada.setDouble(1, 200.00);
		consultaParametrizada.setString(2, "Juan");
		return consultaParametrizada;
		
	}
	private static PreparedStatement selectConsultaParametrizada(String sql, Connection conexion) 
			throws SQLException {
		PreparedStatement consultaParametrizada = conexion.prepareStatement(sql);
		consultaParametrizada.setString(1, "Juan");
		return consultaParametrizada;
		
	}
	public static void main(String[] args) {
		String url = "jdbc:mysql://localhost:3306/empleados";
		String user = "root";
		String pwd = "root";
		String insertQuery = "insert into empleado values( ? , ? , ?, ?)";
		String updateQuery = "update empleado set salario = ? where nombre = ?";
		String selectQuery = "select * from empleado where nombre = ?";

		try(Connection conexion = DriverManager.getConnection(url, user, pwd)){
			PreparedStatement preSentencia = insertConsultaParametrizada(insertQuery,conexion);
					preSentencia.executeUpdate();
					System.out.println("Insertado correctamente un empleado");
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
		try(Connection conexion = DriverManager.getConnection(url, user, pwd)){
			PreparedStatement preSentencia = updateConsultaParametrizada(updateQuery,conexion);
					preSentencia.executeUpdate();
					System.out.println("Registro actualizado correctamente");
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
		try(Connection conexion = DriverManager.getConnection(url, user, pwd)){
			PreparedStatement preSentencia = selectConsultaParametrizada(selectQuery,conexion);
					System.out.println("Registro actualizado correctamente");
					ResultSet rs = preSentencia.executeQuery();
					while(rs.next()) {
						System.out.print(rs.getInt("id"));
						System.out.print(" ");
						System.out.print(rs.getString("nombre"));
						System.out.print(" ");
						System.out.print(rs.getDate("fechaNacimiento"));
						System.out.print(" ");
						System.out.print(rs.getDouble("salario"));
						System.out.println();

					}
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}

}
