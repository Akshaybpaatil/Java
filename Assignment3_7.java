package Assignments;

import java.util.Scanner;

public class Assignment3_7 {
	//b)	Add a method called getFullName(String firstName, String lastName) which should return full name of a person 
   public String getFullName(String firstName, String lastName) {
	   String fullname=firstName+" "+lastName;
	return fullname;

   }
   public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	System.out.println("enter the first name");
	String firstName=sc.next();
	System.out.println("enter the second name");
	String lastName=sc.next();
	Assignment3_7 a=new Assignment3_7();
	String fullname=a.getFullName(firstName, lastName);
	System.out.println(fullname);
}
}
