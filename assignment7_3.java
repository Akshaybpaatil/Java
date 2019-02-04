package Assignments;

import java.util.HashSet;
import java.util.Scanner;

public class assignment7_3 {
 public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
       HashSet<assignmentpojo7_3>p=new HashSet<>();
       p.add(new assignmentpojo7_3(101, "adithya", 25000, "tranee", "life bhema"));
       p.add(new assignmentpojo7_3(101, "siva", 35000, "manager", "health bhema"));
       p.add(new assignmentpojo7_3(101, "vijay", 45000, "sr.manager", "post bhema"));
       p.add(new assignmentpojo7_3(101, "anjali", 40000, "teamlead", "travel bhema"));
       System.out.println(p);

}
}
