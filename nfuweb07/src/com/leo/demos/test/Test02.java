package com.leo.demos.test;

import com.leo.demos.dao.MessageDao;

public class Test02 {
	public static void main(String[] args) throws Exception {
		MessageDao dao = new MessageDao();
		String title = "jdbcTitle";
		String author = "jdbcAuthor";
		String email = "jdbc@highcom.com";
		String content = "jdbc content";
		int flag = dao.saveMessage(title, author, email, content);
		System.out.println(flag);
	}
}
