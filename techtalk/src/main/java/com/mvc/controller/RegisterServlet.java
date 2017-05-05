package com.mvc.controller;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.mvc.bean.RegisterBean;
import com.mvc.dao.RegisterDao;

public class RegisterServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
    
    public RegisterServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.getWriter().append("Served at: ").append(request.getContextPath());
		//PrintWriter out = response.getWriter();
		String runame = request.getParameter("userName");
		String  remail= request.getParameter("email");
		String rpass = request.getParameter("password");
		
		RegisterBean registerBean = new RegisterBean();
		
		 registerBean.setUserName( runame );
		 registerBean.setEmail(remail);
		 registerBean.setPassword(rpass); 
		  
		 RegisterDao registerDao = new RegisterDao();
		  
		
		 String userRegistered = registerDao.registerUser(registerBean);
		  
		 if(userRegistered.equals("SUCCESS"))  
		 {
		 request.getRequestDispatcher("login.jsp").forward(request, response);
		 }
		 else   
		 {
		 request.setAttribute("errMessage", userRegistered);
		 request.getRequestDispatcher("register.jsp").forward(request, response);
		 }
		 }
		 
	}

