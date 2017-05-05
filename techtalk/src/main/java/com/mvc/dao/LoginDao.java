package com.mvc.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import com.mvc.bean.LoginBean;
import com.mvc.bean.RegisterBean;
import com.mvc.dbconnection.DBConnection;
import com.mysql.jdbc.Statement;

public class LoginDao {
	public String loginUser(LoginBean LoginBean)
	 {
	 String email =LoginBean.getEmail();
	 String password = LoginBean.getPassword();
	 
	 Connection con = null;
	 java.sql.Statement statement = null;
	 ResultSet resultSet = null;
	 String  lemail="";
	 String lpass ="";
	 try
	 {
	 con = DBConnection.createConnection();
	 statement = con.createStatement(); 
	 resultSet = statement.executeQuery("select temail,tpass from registrer ");
	 while(resultSet.next()) // Until next row is present otherwise it return false
	 {
	 lemail= resultSet.getString("temail");
	 lpass = resultSet.getString("tpass");
	  
	
	 if(email.equals(lemail) && password.equals(lpass))
	   {
	      return "SUCCESS";
	   }
	 }
	 }
	 catch(SQLException e)
	 {
	 e.printStackTrace();
	 }
	 return "Invalid user credentials"; 
	 }

	 }

