package com.leo.demos.util;

import java.sql.Connection;
import java.sql.DriverManager;

public class DBUtil {
	//mysql数据库连接字符串  协议：//数据库服务器ip:端口号/数据库名
    public static final String url = "jdbc:mysql://127.0.0.1:3306/nfu19";  
    //数据库驱动程序完全限定类名  class文件
    public static final String name = "com.mysql.jdbc.Driver";  
    public static final String username = "root";  
    public static final String password = "root";  
	/*
	 * 获取Connection对象
	 */
	public static Connection getConnection() {
		Connection conn = null;
		  try {  
			   //加载数据库驱动程序
	            Class.forName(name); 
	            conn = DriverManager.getConnection(url,username,password);//获取连接  
	           
	        } catch (Exception e) {  
	            e.printStackTrace();  
	        }  
	    
		return conn;
	}

}
