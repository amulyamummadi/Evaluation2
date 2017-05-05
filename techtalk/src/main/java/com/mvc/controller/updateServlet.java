package com.mvc.controller;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.mvc.bean.TechBean;
import com.mvc.dao.TechDao;
import com.mvc.dao.updateDao;


public class updateServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public updateServlet() {
        super();
        // TODO Auto-generated constructor stub
    }
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		//response.getWriter().append("Served at: ").append(request.getContextPath());
    	//System.out.println("inside update servlet");
		PrintWriter out = response.getWriter();
		String sdate = request.getParameter("udate");
		String  stitle= request.getParameter("utitle");
		String sdescribe = request.getParameter("udescription");
		String spresentor = request.getParameter("upresentor");
		String sid=request.getParameter("uid");
		//System.out.println("sdate:"+sdate);
		TechBean techBean = new TechBean();
		
		techBean.setDate(sdate );
		techBean.setTitle(stitle);
		techBean.setDescription( sdescribe); 
		techBean.setPresentor(spresentor);
		techBean.setId(sid);
		 updateDao upDao = new updateDao();
		  
		//System.out.println("description:"+techBean.getDescription());
		 String upTech = upDao.updateTech(techBean);
		// System.out.println("up:"+upTech);
		  
		 if(upTech.equals("SUCCESS"))  
		 {
		request.getRequestDispatcher("admin.jsp").forward(request, response);
			// out.println("successfully inserted");
		 }
		 else   
		 {
		 request.setAttribute("errMessage", upTech);
		 request.getRequestDispatcher("admin.jsp").forward(request, response);
		 }
		 }

}
