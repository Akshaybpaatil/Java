package Assignments;

public class PersonMain {

		String firstname;
		String lastname;
		String gender;
		int age;
		double weight;
	
	public PersonMain() {
		
	}
	public PersonMain(String name,String lastname,String gender,int age,double weight)
	{
		firstname=name;
		this.lastname=lastname;
		this.gender=gender;
		this.age=age;
		this.weight=weight;
	}
	
public void display()
{
	System.out.println("Person Details");
	System.out.println("___________________");
	System.out.println("First Name: "+firstname);
	System.out.println("Last Name: "+lastname);
	System.out.println("Gender: "+gender);
	System.out.println("Age: "+age);
	System.out.println("Weight: "+weight);
}

		
	public static void main(String[] args) {
		PersonMain pm=new PersonMain("Adithya","prakash","m",23,78);
		pm.display();
	}

}

