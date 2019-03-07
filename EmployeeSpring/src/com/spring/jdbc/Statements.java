package com.spring.jdbc;

import static org.springframework.test.web.client.match.MockRestRequestMatchers.content;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class Statements {
     static Statement s;
     PreparedStatement ps;
     static ResultSet rs;
	static Connection con=ConnectionFactory.getConnection();
	
	public static Statement getStatement1() throws SQLException
	{
		s=con.createStatement();
		return s;
		
	}

	public static ResultSet getResult(String sql) throws SQLException
	{
		rs=s.executeQuery(sql);
		return rs;
		
	}
}
