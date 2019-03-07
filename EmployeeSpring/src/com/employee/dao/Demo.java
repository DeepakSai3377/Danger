package com.employee.dao;

import java.sql.ResultSet;
import java.sql.Statement;

import com.spring.jdbc.*;

public class Demo  {

	Demo() {
		try {
			Statement stmt = Statements.getStatement1();
			String sql = "select empnum from emp";
			ResultSet rs1 = Statements.getResult(sql);
			while (rs1.next()) {
				String emp = rs1.getString("empnum");

				System.out.println(emp);
			}

		} catch (Exception e) {
			e.printStackTrace();
		}

	}

	// stmt.executeQuery(sql);

	public static void main(String[] args) {
		Demo demo = new Demo();
	}

}
