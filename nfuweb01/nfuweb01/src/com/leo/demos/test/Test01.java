package com.leo.demos.test;

import java.sql.Connection;

import com.leo.demos.util.DBUtil;



public class Test01 {

	public static void main(String[] args) throws Exception {
		Connection conn = DBUtil.getConnection();
		
		System.out.println(conn);
		
		conn.close();

	}

}
