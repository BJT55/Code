package com.sust.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sust.dao.IFinanceDao;
import com.sust.service.IFinanceService;
import com.sust.utils.RandomString;

@Service
public class FinanceServiceImpl implements IFinanceService{
	
	@Autowired
	private IFinanceDao financeDao;
	
	public int createFinance(String f_account,String c_name) throws Exception {
		new RandomString();
		String newAccount=RandomString.getRandString(Integer.valueOf("12"));
		return financeDao.createFinance(newAccount,c_name);
	}
}
