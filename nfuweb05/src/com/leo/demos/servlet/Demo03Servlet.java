package com.leo.demos.servlet;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/servlet3")
public class Demo03Servlet  extends HttpServlet{

	public void service(HttpServletRequest request,HttpServletResponse response) throws ServletException, IOException {
		//接收请求中的数据
		String author = request.getParameter("author");
		String title  = request.getParameter("title");
		String email  = request.getParameter("email");
		String content = request.getParameter("content");
		
		System.out.println(author);
		System.out.println(title);
		System.out.println(email);
		System.out.println(content);
		RequestDispatcher rd = request.getRequestDispatcher("/views/result.jsp");
		rd.forward(request, response);
		
	}
}
