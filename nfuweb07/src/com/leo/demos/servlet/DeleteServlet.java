package com.leo.demos.servlet;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.leo.demos.dao.MessageDao;

@WebServlet("/delete")
public class DeleteServlet extends HttpServlet {
	public void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// 接收请求中的数据
		String mid = request.getParameter("mid");
		// 调用持久层完成任务 完成插入记录操作
		MessageDao dao = new MessageDao();
		int flag = 0;
		try {
			flag = dao.deleteMessage(mid);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		// 传递储存结果数据

		// 转发请求 进入查询servlet
		RequestDispatcher rd = request.getRequestDispatcher("/findall");
		rd.forward(request, response);

	}
}
