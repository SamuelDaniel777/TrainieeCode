package com.yash.demoapp1.util;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class JdbcConnection {
	
	public static Connection connectDataBase() throws ClassNotFoundException, SQLException {
		
		Class.forName("com.mysql.jdbc.Driver");
		Connection conn=DriverManager.getConnection("jdbc:mysql://localhost:3306/userdemo?zeroDateTimeBehavior=convertToNull","root","");
		System.out.println("db connected");
		return conn;
		
	}
}
