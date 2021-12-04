package com.leo.demos.test;

import java.util.List;

import com.leo.demos.bean.Message;
import com.leo.demos.dao.MessageDao;

public class Test01 {

	public static void main(String[] args) throws Exception {
		MessageDao dao = new MessageDao();
		List<Message> list = dao.findAllMessage2();

		for (Message msg : list) {
			System.out.println(msg);
		}

	}

}
