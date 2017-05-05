package com.mvc.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import com.mvc.bean.RegisterBean;
import com.mvc.bean.TechBean;
import com.mvc.dbconnection.DBConnection;

public class TechDao {
	public String techTalk(TechBean techBean)
	 {
	String ldate = techBean.getDate();
	 String ltitle = techBean.getTitle();
	 String ldescribe = techBean.getDescription();
	 String lpresentor = techBean.getPresentor();
	 String lid=techBean.getId();
	 Connection con = null;
	 PreparedStatement preparedStatement = null;
	 try
	 {
	 con = DBConnection.createConnection();
	 String query = "insert into techtoch(tdate,ttitle,tdescribe,tpresentor,tid) values(?,?,?,?,?)"; //Insert user details into the table 'USERS'
	 preparedStatement = con.prepareStatement(query); //Making use of prepared statements here to insert bunch of data
	 preparedStatement.setString(1, ldate );
	 preparedStatement.setString(2, ltitle);
	 preparedStatement.setString(3, ldescribe);
	 preparedStatement.setString(4,lpresentor);
	 preparedStatement.setString(5,lid);
	 int i= preparedStatement.executeUpdate();
	  
	 if (i!=0)  //Just to ensure data has been inserted into the database
	 return "SUCCESS"; 
	 }
	 catch(SQLException e)
	 {
	 e.printStackTrace();
	 }
	 return "Oops.. Something went wrong there..!";  // On failure, send a message from here.
	 }
}
