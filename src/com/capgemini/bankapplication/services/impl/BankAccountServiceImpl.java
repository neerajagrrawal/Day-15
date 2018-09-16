package com.capgemini.bankapplication.services.impl;

import com.capgemini.bankapplication.dao.BankAccountDao;
import com.capgemini.bankapplication.dao.impl.BankAccountDaoImpl;
import com.capgemini.bankapplication.services.BankAccountService;

public class BankAccountServiceImpl implements BankAccountService {
	BankAccountDao bankDaoObj=new BankAccountDaoImpl() ;

	@Override
	public double getBalance(long accountId) {
		return bankDaoObj.getBalance(accountId) ;
	}

	@Override
	public double withdraw(long accountId, double amount) {
		double balance=bankDaoObj.getBalance(accountId) ;
		bankDaoObj.updateBalance(accountId, balance-amount)  ;
		return bankDaoObj.getBalance(accountId) ;
	}

	@Override
	public double deposit(long accountId, double amount) {
		double balance=bankDaoObj.getBalance(accountId) ;
		bankDaoObj.updateBalance(accountId, (balance+amount))  ;
		return bankDaoObj.getBalance(accountId) ;
	}

	@Override
	public boolean fundTransfer(long fromAcc, long toAcc, double amount) {
		withdraw(fromAcc, amount) ;
		deposit(toAcc, amount) ;
		return true ;
	} 
		
		
	
	

}
