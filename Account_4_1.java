package Assignments;

import adithya.InsufficentBalance;
import javax.naming.InsufficientResourcesException;

public abstract class Account_4_1 {
	private long acc_num;
	private String name;
	Account_4_1(long acc_num,String name)
	{
	this.acc_num=acc_num;
	this.name=name;
	}
	public long getAcc_num() {
		return acc_num;
	}
	public String getName() {
		return name;
	
	}
	public abstract double deposit(double amt);
	public abstract double withdraw(double amount)throws InsufficentBalance;
		
	}



