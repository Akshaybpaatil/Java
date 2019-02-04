package Assignments;

import java.util.Scanner;

import adithya.Account;
import adithya.CurrentAccount;
import adithya.SavingsAccounts;

public class BankApp4_1 {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("welcome to our Bank");
		System.out.println("1.Savings Account creation" + "\n 2.Current Account \n 3.Exit");
		int choice=sc.nextInt();
		if(choice==1)
		{
			SavingsAccount_4_1 al=new SavingsAccount_4_1(sc.nextLong(),sc.next(),sc.nextDouble());
			System.out.println("Account created");
			System.out.println("1. Withdraw \n"+ "2. deposit \n 3.balance 4. logout");
			int op=sc.nextInt();
		switch(op) {
		case 1:System.out.println("enter the account num");
					double amount=al.withdraw(sc.nextDouble());
					System.out.println("after withdraw"+amount);
					break;

					
					case 2:System.out.println("enter the account num");
					double amt=al.deposit(sc.nextDouble());
					System.out.println("after deposit"+amt);
					break;
					default : System.out.println("invalid option");
					
		}
		}
		else if(choice==2) {
			System.out.println("enter the account num,name,balance");
			CurrentAccount_4_1 al=new CurrentAccount_4_1(sc.nextLong(),sc.next());
			System.out.println("Current created");
			System.out.println("1. Withdraw \n"+ "2. deposit \n 3.balance 4. logout");
			int op=sc.nextInt();
			switch(op) {
			case 1:System.out.println("enter the account num");
						double amount=al.withdraw(sc.nextDouble());
						System.out.println("after withdraw"+amount);
						break;

						
						case 2:System.out.println("enter the account num");
						double amt=al.deposit(sc.nextDouble());
						System.out.println("after deposit"+amt);
						break;
						default : System.out.println("invalid option");
			}
		}
		else if(choice==3) {
			System.out.println("thanks for using our bank");
			System.exit(0);
		}
		}
}




