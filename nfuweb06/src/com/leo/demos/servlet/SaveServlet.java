package com.leo.demos.servlet;

import java.io.IOException;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.leo.demos.bean.Message;
import com.leo.demos.dao.MessageDao;

@WebServlet("/save")				
public class SaveServlet  extends HttpServlet{				
				
	public void service(HttpServletRequest request,HttpServletResponse response) throws ServletException, IOException {			
		//接收请求中的数据			
		String author = request.getParameter("author");
		String title  = request.getParameter("title");
		String email  = request.getParameter("email");
		String content = request.getParameter("content");
		
		//调用持久层完成任务  完成插入记录操作			
		MessageDao dao = new MessageDao();
		dao.saveMessage(author, title, email, content);
					
		//传递储存结果数据			
					
		//转发请求  进入查询servlet			
		RequestDispatcher rd = request.getRequestDispatcher("/findall");		
		rd.forward(request, response);		
				
	}			
}				
