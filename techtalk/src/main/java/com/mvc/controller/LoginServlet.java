package com.mvc.controller;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.mvc.bean.LoginBean;
import com.mvc.bean.RegisterBean;
import com.mvc.dao.LoginDao;
import com.mvc.dao.RegisterDao;


public class LoginServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
   
    public LoginServlet() {
        super();
        // TODO Auto-generated constructor stub
    }
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.getWriter().append("Served at: ").append(request.getContextPath());
		 response.setContentType("text/html");  
		    //PrintWriter out = response.getWriter();  
		          
		    String  semail= request.getParameter("email");
		    String spass = request.getParameter("password");
			
			LoginBean LoginBean = new LoginBean();
			
			LoginBean.setEmail(semail); 
			 LoginBean.setPassword(spass);
			  
			LoginDao LoginDao = new LoginDao();
			  
			
			 String userValidate = LoginDao. loginUser(LoginBean);
			 if(userValidate.equals("SUCCESS")) 
			 {
			 request.setAttribute("userName", semail);
			 request.getRequestDispatcher("addtechtalk.jsp").forward(request, response);
			 }
			 else
			 {
			 request.setAttribute("errMessage", userValidate); 
			 request.getRequestDispatcher("login.jsp").forward(request, response);
			 }
			 }
		   
	}

