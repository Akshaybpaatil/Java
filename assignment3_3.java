package Assignments;

import java.time.LocalDate;
import java.time.Period;

public class assignment3_3 {
	public static void main(String[] args) {
		 LocalDate pdate = LocalDate.of(2015, 01, 01);
	        LocalDate now = LocalDate.now();
	        Period diff = Period.between(pdate, now);
 System.out.printf("Difference is %d years %d months  %d days ", 
	                       diff.getYears(), diff.getMonths(), diff.getDays());
	     }
	 
	}


