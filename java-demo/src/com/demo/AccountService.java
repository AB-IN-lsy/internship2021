package com.leo.demos2;
/*
 * ���ת��
 */
public class AccountService {
	AccountDao dao = new AccountDao();
	public int service(int pk1,double num1,int pk2,double num2) {
		
		dao.updateAccount(pk1, num1);
		dao.updateAccount(pk2, num2);
		
		//�����ɹ�  1  ʧ�� 0
		
				return 1;
	}

}
