package com.leo.demos2.service;

import com.leo.demos2.dao.AccountDao;

/*
 * 完成转账
 */
public class AccountService {
	AccountDao dao = new AccountDao();
	public int service(int pk1,double num1,int pk2,double num2) {
		//开启事务
		dao.updateAccount(pk1, num1);
		dao.updateAccount(pk2, num2);
		
		//如果操作都成功，提交事务
		
		//如果出现问题，数据库回滚操作，恢复到操作前状态
		
		//操作成功  1  失败 0
		
				return 1;
	}

}
