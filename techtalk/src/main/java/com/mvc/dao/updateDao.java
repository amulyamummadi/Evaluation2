package com.mvc.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import com.mvc.bean.TechBean;
import com.mvc.dbconnection.DBConnection;

public class updateDao {
	public String updateTech(TechBean techBean)
	 {
		String result="";
	String ldate = techBean.getDate();
	 String ltitle = techBean.getTitle();
	 String ldescribe = techBean.getDescription();
	 String lpresentor = techBean.getPresentor();
	 String lid=techBean.getId();
	// System.out.println("ldate:"+ldate);
	 Connection con = null;
	 PreparedStatement preparedStatement = null;
	 try
	 {
	 con = DBConnection.createConnection();
	 String query = "update techtoch set tdate=?, ttitle=?, tdescribe=?, tpresentor=? where tid=?"; //Insert user details into the table 'USERS'
	 preparedStatement = con.prepareStatement(query); //Making use of prepared statements here to insert bunch of data
	 preparedStatement.setString(1, ldate );
	 preparedStatement.setString(2, ltitle);
	 preparedStatement.setString(3, ldescribe);
	 preparedStatement.setString(4,lpresentor);
	 preparedStatement.setString(5,lid);
	 int i= preparedStatement.executeUpdate();
	 //System.out.println("i:"+i);
	  
	 if (i!=0) 
	 {//Just to ensure data has been inserted into the database
		 result= "SUCCESS"; 
	 }
	 else
	 {
		 result= "Oops.. Something went wrong there..!";  // On failure, send a message from here.
	 }
	 }
	 catch(SQLException e)
	 {
	 e.printStackTrace();
	 }
	
	 return result;
	 }
}
