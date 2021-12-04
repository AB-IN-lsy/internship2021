package com.leo.demos.test;

import com.leo.demos.bean.Message;
import com.leo.demos.dao.MessageDao;

public class Test03 {

	public static void main(String[] args) throws Exception {
		MessageDao dao = new MessageDao();
		String mid = "1";
		Message msg = dao.findMessageByPk(mid);
		
		System.out.println(msg);
	}

}
