package Assignments;

import java.util.Scanner;

public class assignment2_2 {
	public static void main(String[] args) {
		
	        Scanner s = new Scanner(System.in);
	        System.out.print("Enter the number :");
	     int  n1 =Integer.parseInt(args[0]);
	        if(n1 > 0)
	        {
	            System.out.println("The given number "+n1+" is Positive");
	        }
	        else if(n1 < 0)
	        {
	            System.out.println("The given number "+n1+" is Negative");
	        }
	        else
	        {
	            System.out.println("The given number "+n1+" is neither Positive nor Negative ");
	        }
	    }
	}


