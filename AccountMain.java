package com.section4;

import java.util.Random;
import java.util.Scanner;

public class AccountMain {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		Random random = new Random();
		
		Person person1 = new Person("Smith");
		Account account1 = new Account(random.nextInt(9999), 2000, person1);
		
		Person person2 = new Person("Kathy");
		Account account2 = new Account(random.nextInt(9999), 3000, person2);

		System.out.println("Smith Account Balance:" + account1.toString());
		System.out.println("Kathy Account Balance:" + account2.toString());

		// Deposit amount in Smith Account

		
		
		System.out.println( "Enter deposit amount for Smith: " );
		account1.deposit(sc.nextDouble());
		
		//Withdraw amount from Kathy
		System.out.println( "Enter  amount be to Withdraw for kathy: " );
		account2.withdraw(sc.nextDouble());
		
		//Balance After Transactions
		System.out.println("Updated Account Details-----------------");
		System.out.println("Smith Account Balance: " + account1.getBalance());
		System.out.println("Kathy Account Balance: " + account2.getBalance());
		
		System.out.println("ToString method------------------------------");
		System.out.println(account1.toString());
		System.out.println(account2.toString());
		
		System.out.println("1.Withdraw \n 2.Deposit \n 3. Balance \n 4.Logout");
		

	}

}
