package Assignments;

import java.util.Scanner;

public class assignment2_1 {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the details");
		String firstname=sc.next();
		String lastname=sc.next();
		String gender=sc.next();
		int age=sc.nextInt();
		double weight=sc.nextDouble();
		System.out.println("Person Details");
		System.out.println("___________________");
		System.out.println("First Name: "+firstname);
		System.out.println("Last Name: "+lastname);
		System.out.println("Gender: "+gender);
		System.out.println("Age: "+age);
		System.out.println("Weight: "+weight);
	}

}
