package com.lsy.demo.dao;

import java.util.List;

import com.lsy.demo.bean.Users;

/*
 * ģ�Ͳ�  ����Users��  
 * 
 */
public class UsersDao {

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

		// ��ɲ�ѯ����

		return null;
	}

	/*
	 * ����������ѯָ����¼
	 */

	public Users findUserByPk(Integer userid) {
		return null;
	}

	/*
	 * �޸ļ�¼
	 * 
	 * ���� �������޸ļ�¼��Ҫ������
	 * 
	 * update users set username = xxx ,password = xxxx where userid = xxxx
	 */

	public int updateUser(Users user) {

		// �޸ĳɹ�����1 ʧ�ܷ���0

		return 1;
	}

	/*
	 * �����¼
	 */

	public int saveUser(Users user) {
		// �޸ĳɹ�����1 ʧ�ܷ���0

		return 1;
	}

	/*
	 * ɾ������
	 */

	public int deleteUser(Integer userid) {
		// �޸ĳɹ�����1 ʧ�ܷ���0

		return 1;
	}
}
