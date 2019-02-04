package Assignments;

import adithya.InsufficentBalance;

public class SavingsAccount_4_1 extends Account_4_1{
	private double balance;

SavingsAccount_4_1(long acc_num, String name, double d) {
		super(acc_num, name);
		this.balance=balance;
}
public double getBalance() {
	return balance;
}
@Override
public double deposit(double amount) {
	if(amount<0)
	{
		throw new InsufficentBalance("balance is low");
		//System.out.println("invalid amount");
	}
	//else
	//balance=balance+amount;
	return balance;
}
@Override
public double withdraw(double amount) {
	if(amount>0) {
		System.out.println("invalid amount");
	}
	else if((balance-amount)<1000)
{
	System.out.println("minimum balance is 1000");
}
else 
{
	balance=balance-amount;
}
	return 	balance;
}

}


