package com.leo.demos.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.leo.demos.bean.Message;
import com.leo.demos.util.DBUtil;

public class MessageDao {
	/*
	 * 
	 */
	public List<Message> findAllMessage2() throws Exception {

		// 1 定义需要使用的对象
		Connection conn = null;
		PreparedStatement ps = null;
		ResultSet rs = null;

		List<Message> list = new ArrayList<>();

		// 2 处理异常

		// 3 创建连接对象
		conn = DBUtil.getConnection();
		// 4 创建String对象，储存sql语句
		String sql = " select mid,title,author,email,content,add_date,userid from messages ";
		// 5 创建PreparedStatement对象
		ps = conn.prepareStatement(sql);
		// 6 创建Result对象
		rs = ps.executeQuery();
		// 7 如果Result对象中有记录 有查询结果，把每条记录储存到实体类对象中，把全部实体类对象储存到ArrayList中
		while (rs.next()) {
			Message msg = new Message();
			msg.setMid(rs.getString("mid"));
			msg.setTitle(rs.getString("title"));
			msg.setAuthor(rs.getString("author"));
			msg.setEmail(rs.getString("email"));
			msg.setContent(rs.getString("content"));
			msg.setAdd_date(rs.getString("add_date"));
			msg.setUserId(rs.getInt("userid"));
			list.add(msg);
		}
		// 8 释放资源
		rs.close();
		ps.close();
		conn.close();
		// 9 把储存查询结果的list对象，作为返回值
		return list;
	}

	/*
	 * 根据主键查询记录
	 */
	public Message findMessageByPk(String mid) throws Exception {

		// 1 定义需要使用的对象
		Connection conn = null;
		PreparedStatement ps = null;
		ResultSet rs = null;
		Message msg = null;
		;

		// 2 处理异常

		// 3 创建连接对象
		conn = DBUtil.getConnection();
		// 4 创建String对象，储存sql语句
		String sql = " select mid,title,author,email,content,add_date,userid from messages where mid = ? ";
		// 5 创建PreparedStatement对象
		ps = conn.prepareStatement(sql);

		// 使用参数替换sql中的展位符
		ps.setString(1, mid);
		// 6 创建Result对象
		rs = ps.executeQuery();
		// 7 如果Result对象中有记录 有查询结果，把每条记录储存到实体类对象中，把全部实体类对象储存到ArrayList中
		while (rs.next()) {
			msg = new Message();
			msg.setMid(rs.getString("mid"));
			msg.setTitle(rs.getString("title"));
			msg.setAuthor(rs.getString("author"));
			msg.setEmail(rs.getString("email"));
			msg.setContent(rs.getString("content"));
			msg.setAdd_date(rs.getString("add_date"));
			msg.setUserId(rs.getInt("userid"));

		}
		// 8 释放资源
		rs.close();
		ps.close();
		conn.close();
		// 9 把储存查询结果的对象，作为返回值

		return msg;
	}

	public int saveMessage(String title, String author, String email, String content) throws Exception {
		// 定义需要使用的对象
		Connection conn = null;
		PreparedStatement ps = null;
		int flag = 0; // 操作结果标记

		// 处理异常

		// 创建对象
		String sql = " insert into messages (title,author,email,content,add_date,userid ) "
				+ "values(?,?,?,?,now(),1); ";
		conn = DBUtil.getConnection();
		ps = conn.prepareStatement(sql);

		// 替换sql语句的占位符
		ps.setString(1, title);
		ps.setString(2, author);
		ps.setString(3, email);
		ps.setString(4, content);
		// 执行sql语句
		flag = ps.executeUpdate();

		// 释放资源
		ps.close();
		conn.close();

		return flag;

	}

	public int deleteMessage(String mid) throws Exception {

		// 定义需要使用的对象
		Connection conn = null;
		PreparedStatement ps = null;
		int flag = 0; // 操作结果标记

		// 处理异常

		// 创建对象
		String sql = " delete from messages where mid = ? ";
		conn = DBUtil.getConnection();
		ps = conn.prepareStatement(sql);

		// 替换sql语句的占位符
		ps.setString(1, mid);

		// 执行sql语句
		flag = ps.executeUpdate();

		// 释放资源
		ps.close();
		conn.close();

		return flag;

	}

	public int updateMessage(String title, String author, String email, String content, String mid)
			throws SQLException {
		// 定义需要使用的对象
		Connection conn = null;
		PreparedStatement ps = null;
		int flag = 0; // 操作结果标记

		// 处理异常

		// 创建对象
		String sql = "update messages set title = ?" + ", author = ?" + ", email = ?" + ", content = ?"
				+ "where mid = ?";
		conn = DBUtil.getConnection();
		ps = conn.prepareStatement(sql);

		// 替换sql语句的占位符
		ps.setString(1, title);
		ps.setString(2, author);
		ps.setString(3, email);
		ps.setString(4, content);
		ps.setString(5, mid);
		// 执行sql语句
		flag = ps.executeUpdate();

		// 释放资源
		ps.close();
		conn.close();

		return flag;
	}
}
