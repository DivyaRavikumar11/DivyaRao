package com.src.service.impl;

import java.sql.Connection;
import java.sql.Statement;

import com.src.service.DBOperations;

public class DBOperationsImpl implements DBOperations {

	@Override
	public void createTable() {
		try {
			Connection con = new DBConnectionImpl().getConnection();
			Statement statement = con.createStatement();
			//String sql = "create table divya(id int,name varchar(255))";
			String sql = "create table divya(id int,name varchar(255))";
			statement.execute(sql);
			System.out.println("table Created!!");
		} catch (Exception e) {

		}
	}

	@Override
	public void insertRecord() {
		// TODO Auto-generated method stub

	}

	@Override
	public void deleteTable() {
		// TODO Auto-generated method stub

	}

}
