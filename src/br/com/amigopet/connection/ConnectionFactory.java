package br.com.amigopet.connection;

import java.sql.*;

public class ConnectionFactory {
	
	public static Connection getConnection() {
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			String url = "jdbc:mysql://localhost:3306/amigopet?useTimezone=true&serverTimezone=UTC&useSSL=false";
			Connection cnn = DriverManager.getConnection(url,"root","root");
			System.out.print(cnn);
			return cnn;
		} catch (SQLException e) {
			e.printStackTrace();
		} catch (ClassNotFoundException cnf) {
			cnf.printStackTrace();
		}
		return null;
	}
}
