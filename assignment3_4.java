package Assignments;

import java.time.LocalDate;
import java.time.Period;

public class assignment3_4 {
	public static void main(String[] args) {
		 LocalDate pdate = LocalDate.of(2015, 01, 01);
		 LocalDate adate=LocalDate.of(2018, 5, 7);
	        LocalDate now = LocalDate.now();
	        Period diff = Period.between(pdate, adate);
System.out.printf("Difference is %d years %d months  %d days ", 
	                       diff.getYears(), diff.getMonths(), diff.getDays());
	     }

}
