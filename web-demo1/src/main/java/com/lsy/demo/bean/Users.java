package com.lsy.demo.bean;
/*
 * 实体类  对象用于储存一条记录
 * 
 * 类名：与表名相同
 * 属性名：与对应的列名相同
 * 私有属性，公有getters setters
 * implements java.io.Serializable 
 * private static final long serialVersionUID = 1L;
 */
public class Users implements java.io.Serializable {
	
	private static final long serialVersionUID = 1L;
	private Integer userid;
	private String userName;
	private String password;
	private Integer role;
	public Integer getUserid() {
		return userid;
	}
	public void setUserid(Integer userid) {
		this.userid = userid;
	}
	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public Integer getRole() {
		return role;
	}
	public void setRole(Integer role) {
		this.role = role;
	}
	
	

}
