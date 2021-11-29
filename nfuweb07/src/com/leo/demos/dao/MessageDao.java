package com.leo.demos.dao;

import java.util.ArrayList;
import java.util.List;

import com.leo.demos.bean.Message;

public class MessageDao {
	/*
	 * 
	 */
	public List<Message> findAllMessages(){
		List<Message> list = new ArrayList<>();
		
		Message msg = new Message();
		msg.setMid("1234");
		msg.setAuthor("leo");
		msg.setTitle("test title");
		msg.setEmail("leo@nfu.com");
		msg.setContent("刘老师是大好人");
		msg.setAdd_date("2021-11-28");
		Message msg1 = new Message();
		msg1.setMid("1235");
		msg1.setAuthor("jerry");
		msg1.setTitle("jerry title");
		msg1.setEmail("leo@nfu.com");
		msg1.setContent("刘老师是大好人");
		msg1.setAdd_date("2021-11-28");
		
		Message msg2 = new Message();
		msg2.setMid("1236");
		msg2.setAuthor("Ange");
		msg2.setTitle("ange title");
		msg2.setEmail("leo@nfu.com");
		msg2.setContent("刘老师是大好人");
		msg2.setAdd_date("2021-11-28");
		list.add(msg);
		list.add(msg1);
		list.add(msg2);
		
		for(Message item : list) {
			System.out.println(item.getAuthor());
		}
		
		return list;
	}

	public int saveMessage( String author,String title,String email,String content) {
		// 执行sql语句，完成插入操作
		return 1;
	}
	
	public Message findOneMessage(String mid) {
		Message msg = new Message();
		msg.setMid("1234");
		msg.setAuthor("leo");
		msg.setTitle("test title");
		msg.setEmail("leo@highcom.com");
		msg.setContent("刘老师是大好人");
		
		return msg;
	}
	
	public int updateMessage( String author,String title,String email,String content,String mid) {
		// 执行sql语句，完成插入操作
		return 1;
	}
}
