package Assignments;

import java.util.Calendar;
import java.util.GregorianCalendar;
import java.util.Scanner;

public class assignment3_5 {
	
	private static GregorianCalendar expiryDate;
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);

	    System.out.print("Year : ");
	    int year=sc.nextInt();
	    System.out.println("month : ");
	    int month=sc.nextInt();
	    System.out.println("day : ");
	   int day=sc.nextInt();
	     expiryDate = new GregorianCalendar(year, month, day);
	     System.out.println(expiryDate.toString());
	}
   static void validate() {
	   GregorianCalendar current = new GregorianCalendar();
	   
	Object expiryDate = null;
	if( current.after(expiryDate) ){        
	        System.out.println("Your trial period is expired");
	 }
	else
	{
	        GregorianCalendar temp = new GregorianCalendar(((Calendar) expiryDate).get(GregorianCalendar.YEAR) - 
	                        current.get(GregorianCalendar.YEAR), 
	                        ((Calendar) expiryDate).get(GregorianCalendar.MONTH) - 
	                        current.get(GregorianCalendar.MONTH), 
	                        ((Calendar) expiryDate).get(GregorianCalendar.DAY_OF_MONTH) - 
	                        current.get(GregorianCalendar.DAY_OF_MONTH));
	        System.out.println("\nYou still have " + 
                    temp.get(GregorianCalendar.YEAR) + " years, " + 
                    temp.get(GregorianCalendar.MONTH) + " months, " + 
                    temp.get(GregorianCalendar.DAY_OF_MONTH) +
                    " days remaining... \n\nPlease buy the product before it expires!");
}
   }
}
