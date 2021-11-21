package com.lsy.demo.service;

import java.util.List;

import com.lsy.demo.bean.Users;
import com.lsy.demo.dao.UsersDao;

/*
 * 业务层类，
 */
public class UserService {
	UsersDao dao = new UsersDao();

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
		return dao.findAllUsers();
	}

	/*
	 * 根据主键查询指定记录
	 */

	public Users findUserByPk(Integer userid) {
		return dao.findUserByPk(userid);

	}

	public int updateUser(Users user) {

		// 修改成功返回1 失败返回0

		return dao.updateUser(user);
	}

	public int saveUser(Users user) {
		// 修改成功返回1 失败返回0

		return dao.saveUser(user);
	}

	public int deleteUser(Integer userid) {
		// 修改成功返回1 失败返回0

		return dao.deleteUser(userid);
	}
}
