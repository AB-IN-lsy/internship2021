package com.leo.demos.servlet;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/servlet2")
public class Demo02Servlet  extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		System.out.println("Demo02Servlet is running.......");
		//接收请求中的数据	
		
		//调用持久层，完成数据处理	
			
		//向视图传递数据	
			
		//转发请求 跳转到main.jsp	
		RequestDispatcher rd = request.getRequestDispatcher("/views/main.jsp");
		rd.forward(request, response);

	}

}
