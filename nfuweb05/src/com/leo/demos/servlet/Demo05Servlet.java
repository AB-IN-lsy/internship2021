package com.leo.demos.servlet;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.leo.demos.bean.Message;

@WebServlet("/servlet5")
public class Demo05Servlet  extends HttpServlet{

	public void service(HttpServletRequest request,HttpServletResponse response) throws ServletException, IOException {
		//储存数据，向result.jsp传递
		//储存传递字符串
		request.setAttribute("mystr", "Good Luck !!!!");
		
		//储存传递对象
		Message msg = new Message();
		msg.setMid("1234");
		msg.setAuthor("leo");
		msg.setTitle("test title");
		request.setAttribute("message", msg);
		
		RequestDispatcher rd = request.getRequestDispatcher("/views/result.jsp");
		rd.forward(request, response);
		
	}
}
