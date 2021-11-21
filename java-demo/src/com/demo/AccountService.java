package com.leo.demos2;
/*
 * 完成转账
 */
public class AccountService {
	AccountDao dao = new AccountDao();
	public int service(int pk1,double num1,int pk2,double num2) {
		
		dao.updateAccount(pk1, num1);
		dao.updateAccount(pk2, num2);
		
		//操作成功  1  失败 0
		
				return 1;
	}

}
