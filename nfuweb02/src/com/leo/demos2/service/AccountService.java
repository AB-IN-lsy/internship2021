package com.leo.demos2.service;

import com.leo.demos2.dao.AccountDao;

/*
 * ���ת��
 */
public class AccountService {
	AccountDao dao = new AccountDao();
	public int service(int pk1,double num1,int pk2,double num2) {
		//��������
		dao.updateAccount(pk1, num1);
		dao.updateAccount(pk2, num2);
		
		//����������ɹ����ύ����
		
		//����������⣬���ݿ�ع��������ָ�������ǰ״̬
		
		//�����ɹ�  1  ʧ�� 0
		
				return 1;
	}

}
