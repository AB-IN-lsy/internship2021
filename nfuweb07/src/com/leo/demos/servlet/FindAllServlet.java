package com.leo.demos.servlet;

import java.io.IOException;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.leo.demos.bean.Message;
import com.leo.demos.dao.MessageDao;

@WebServlet("/findall")
public class FindAllServlet extends HttpServlet {

	public void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// 接收请求中的数据

		// 调用持久层完成任务
		MessageDao dao = new MessageDao();
		List<Message> list = null;
		try {
			list = dao.findAllMessage2();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		// 传递储存结果数据
		request.setAttribute("msgs", list);

		// HttpSession session = request.getSession();
		// session.setAttribute("msgs", list);
		// 转发请求
		RequestDispatcher rd = request.getRequestDispatcher("/views/main.jsp");
		rd.forward(request, response);

	}
}
