package com.cetpa.services;

import com.cetpa.entities.Account;

public interface AccountService 
{
	int getAccountNoByUserId(String userid);
	int getCurrentAmount(int an);
	void depositMoney(int amount,int an);
	void withdrawMoney(int amount, int an);
	Account getAccount(int accountNumber);
	void transferMoney(int amount, int an, int accountNumber);
}
