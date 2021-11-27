package com.leo.demos.dao;

import java.util.ArrayList;
import java.util.List;

import com.leo.demos.bean.Message;

public class MessageDao {
	/*
	 * 模拟查询数据库全部留言信息
	 */
	public List<Message> findAllMessages(){
		List<Message> list = new ArrayList<>();
		
		Message msg = new Message();
		msg.setMid("1234");
		msg.setAuthor("leo");
		msg.setTitle("test title");
		
		Message msg1 = new Message();
		msg1.setMid("1235");
		msg1.setAuthor("jerry");
		msg1.setTitle("jerry title");
		
		Message msg2 = new Message();
		msg2.setMid("1236");
		msg2.setAuthor("Ange");
		msg2.setTitle("ange title");
		
		list.add(msg);
		list.add(msg1);
		list.add(msg2);
		
		for(Message item : list) {
			System.out.println(item.getAuthor());
		}
		
		return list;
	}

}
