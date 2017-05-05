package com.mvc.controller;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.mvc.bean.TechBean;
import com.mvc.dao.TechDao;

/**
 * Servlet implementation class UpdateServletAdd
 */
public class UpdateServletAdd extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public UpdateServletAdd() {
        super();
        // TODO Auto-generated constructor stub
    }
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.getWriter().append("Served at: ").append(request.getContextPath());
		//PrintWriter out = response.getWriter();
		String sdate = request.getParameter("date");
		String  stitle= request.getParameter("title");
		String sdescribe = request.getParameter("description");
		String spresentor = request.getParameter("presentor");
		String sid=request.getParameter("id");
		TechBean techBean = new TechBean();
		
		techBean.setDate(sdate );
		techBean.setTitle(stitle);
		techBean.setDescription( sdescribe); 
		techBean.setPresentor(spresentor);
		techBean.setId(sid);
		 TechDao techDao = new TechDao();
		  
		
		 String techUser = techDao.techTalk(techBean);
		  
		 if(techUser.equals("SUCCESS"))  
		 {
		request.getRequestDispatcher("admin.jsp").forward(request, response);
			// out.println("successfully inserted");
		 }
		 else   
		 {
		 request.setAttribute("errMessage", techUser);
		// request.getRequestDispatcher("addtechtalk.jsp").forward(request, response);
		 }
		 }


}
