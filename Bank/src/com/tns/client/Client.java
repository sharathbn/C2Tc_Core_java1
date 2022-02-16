package com.tns.client;

import com.tns.application.MMBankFactory;
import com.tns.application.MMCurrentAcc;
import com.tns.application.MMSavingAcc;
import com.tns.framework.BankFactory;
import com.tns.framework.CurrentAcc;
import com.tns.framework.SavingAcc;

public class Client {

	public static void main(String[] args) {
	BankFactory bf=new MMBankFactory();
	SavingAcc sa=new MMSavingAcc(2012456, "sharath",1000, true);
	CurrentAcc ca=new MMCurrentAcc(2022142,"manoj",2000,25000);
	
	sa.deposit(20000);
	ca.withdraw(15000);
	ca.deposit(10000);
	System.out.println(ca.toString());
	
	
	
	}

}