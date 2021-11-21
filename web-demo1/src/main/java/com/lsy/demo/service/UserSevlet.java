package com.lsy.demo.service;

import java.util.List;

import com.lsy.demo.bean.Users;
import com.lsy.demo.dao.UsersDao;

/*
 * ҵ����࣬
 */
public class UserService {
	UsersDao dao = new UsersDao();

	/*
	 * ��ѯȫ���û���Ϣ
	 * 
	 * ������ʾ public
	 * 
	 * ����ֵ���� List<User>
	 * 
	 * ������ findAllUsers
	 * 
	 * ���� :��
	 */

	public List<Users> findAllUsers() {
		return dao.findAllUsers();
	}

	/*
	 * ����������ѯָ����¼
	 */

	public Users findUserByPk(Integer userid) {
		return dao.findUserByPk(userid);

	}

	public int updateUser(Users user) {

		// �޸ĳɹ�����1 ʧ�ܷ���0

		return dao.updateUser(user);
	}

	public int saveUser(Users user) {
		// �޸ĳɹ�����1 ʧ�ܷ���0

		return dao.saveUser(user);
	}

	public int deleteUser(Integer userid) {
		// �޸ĳɹ�����1 ʧ�ܷ���0

		return dao.deleteUser(userid);
	}
}
