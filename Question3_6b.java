package com.section3;

public class Question3_6b {

	String firstName;
	String lastName;


	public String getFullName(String firstName, String lastName) {
		
		return (firstName +" "+  lastName);
	}

	public static void main(String[] args) {
		Question3_6b qb = new Question3_6b();
		System.out.println("The Full Name is:");
		System.out.println(qb.getFullName("Akshay", "Patil"));
		

	}

}
