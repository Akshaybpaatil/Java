package Assignments;
class Account{
long accno;
double balance;
String name;
public void deposit(double amt) {
	balance=balance+amt;
	System.out.println(balance);
}
public void withdraw(double amt) {
	balance=balance-amt;
	System.out.println(balance);
}
public double getbalance(double amt) {
	
	
	
	return balance;
	
}
}
public class Account4_1_1 extends Account {
	public static void main(String[] args) {
		
	}

}
