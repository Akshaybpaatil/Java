package Assignments;

public class CurrentAccount_4_1 extends Account_4_1 {
	double balance1;
	CurrentAccount_4_1(long acc_num, String name) {
		super(acc_num, name);
		this.balance1=balance1;

	}
		
	
	public double getBalance() {
		return balance1;
	}
	@Override
	public double deposit(double amount) {
		if(amount<0)
		{
			System.out.println("invalid amount");
		}
		else
		balance1=balance1+amount;
		return balance1;
	}
	@Override
	public double withdraw(double amount) {
		if(amount>0) {
			System.out.println("invalid amount");
		}
		else if((balance1-amount)<10000)
	{
		System.out.println("minimum balance is 10000");
	}
	else 
	{
		balance1=balance1-amount;
	}
		return 	balance1;
	}


}


