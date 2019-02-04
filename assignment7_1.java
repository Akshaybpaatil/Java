package Assignments;

import java.util.Arrays;

public class assignment7_1 {
	public static void main(String[] args) {
		 String products[] = { "Pen", "book", "phone", "charger",
			      };
			     System.out.println("The original order:");
			    for (int i = 0; i < products.length; i++)
			       System.out.println(i + ": " + products[i]);
			     Arrays.sort(products);
			     System.out.println("The new order:");
			    for (int i = 0; i < products.length; i++)
		      System.out.println(i + ": " + products[i]);
			 }
			 }
