package com.section3;

import java.time.LocalDate;
import java.time.LocalTime;
import java.time.ZoneId;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class Question3_6 {
	
	public void getCurrentDateTimeWithTimeZone(){
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Zone Id:");
		String zone=sc.next();
		ZoneId zoneId = ZoneId.of(zone);
	    LocalTime localTime=LocalTime.now(zoneId);
	    LocalDate today = LocalDate.now( zoneId );
	    DateTimeFormatter formatter = DateTimeFormatter.ofPattern("HH:mm:ss");
	    String formattedTime=localTime.format(formatter);
	    String dateformat = today.toString();
	    System.out.println("Current time of the day: " + formattedTime+" date of day "+dateformat);
	}

	public static void main(String[] args) {
		
		 
		
		Question3_6 question3_6= new Question3_6();
		question3_6.getCurrentDateTimeWithTimeZone();

	}

}
