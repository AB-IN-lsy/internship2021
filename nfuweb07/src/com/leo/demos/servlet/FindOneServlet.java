package com.leo.demos.servlet;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.leo.demos.bean.Message;
import com.leo.demos.dao.MessageDao;

@WebServlet("/findone")
public class FindOneServlet extends HttpServlet {
	public void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// 接收请求中的数据
		String mid = request.getParameter("mid");
		// 调用持久层完成任务 完成插入记录操作
		MessageDao dao = new MessageDao();
		Message msg = null;
		try {
			msg = dao.findMessageByPk(mid);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		request.setAttribute("msg", msg);
		RequestDispatcher rd = request.getRequestDispatcher("/views/update.jsp");
		rd.forward(request, response);

	}
}
