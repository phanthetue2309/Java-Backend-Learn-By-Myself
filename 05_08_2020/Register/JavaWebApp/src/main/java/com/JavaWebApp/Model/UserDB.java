package com.JavaWebApp.Model;

import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;

import com.JavaWebApp.Beans.RegisterBeans;

public class UserDB {
	String s1 = null;
	public String insertUser(RegisterBeans rb)
	{
		MyDb db = new MyDb();
		Connection con = db.getCon();
		try{
		Statement stmt = con.createStatement();
		stmt.executeUpdate("insert into register(name,email,password) values('"+rb.getName()+"','"+rb.getEmail()+"','"+rb.getPassword()+"')");
		s1 = "Data inserted";
		}
		catch(SQLException e)
		{
			e.printStackTrace();
		}
		return s1;
	}

}
