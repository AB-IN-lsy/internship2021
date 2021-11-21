package com.lsy.demo.dao;

import java.util.List;

import com.lsy.demo.bean.Users;

/*
 * 模型层  处理Users表  
 * 
 */
public class UsersDao {

	/*
	 * 查询全部用户信息
	 * 
	 * 访问显示 public
	 * 
	 * 返回值类型 List<User>
	 * 
	 * 方法名 findAllUsers
	 * 
	 * 参数 :无
	 */

	public List<Users> findAllUsers() {

		// 完成查询操作

		return null;
	}

	/*
	 * 根据主键查询指定记录
	 */

	public Users findUserByPk(Integer userid) {
		return null;
	}

	/*
	 * 修改记录
	 * 
	 * 参数 ：传入修改记录需要的数据
	 * 
	 * update users set username = xxx ,password = xxxx where userid = xxxx
	 */

	public int updateUser(Users user) {

		// 修改成功返回1 失败返回0

		return 1;
	}

	/*
	 * 插入记录
	 */

	public int saveUser(Users user) {
		// 修改成功返回1 失败返回0

		return 1;
	}

	/*
	 * 删除操作
	 */

	public int deleteUser(Integer userid) {
		// 修改成功返回1 失败返回0

		return 1;
	}
}
