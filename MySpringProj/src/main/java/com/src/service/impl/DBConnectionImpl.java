package com.src.service.impl;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import com.src.service.DBConnection;

public class DBConnectionImpl implements DBConnection {
	@Override
	public Connection getConnection() {
		final String JDBC_DRIVER = "com.mysql.jdbc.Driver";
		final String DB_URL = "jdbc:mysql://trainingdb.c4hhsbxtkfor.ap-south-1.rds.amazonaws.com:3306/trainingTable";
		final String USER = "root";
		final String PASS = "mypassword";
		Connection conn = null;
		try {
			Class.forName("com.mysql.jdbc.Driver");
			System.out.println("Data!!!");
			conn = DriverManager.getConnection(DB_URL, USER, PASS);
			System.out.println("Connecting to a selected database...");
		} catch (SQLException e) {

		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
		return conn;
	}
}
