package Assignments;

public class person {
	String firstname;
	String lastname;
	char gender;
	public String getFirstname() {
		return firstname;
	}
	public void setFirstname(String firstname) {
		this.firstname = firstname;
	}
	public String getLastname() {
		return lastname;
	}
	public void setLastname(String lastname) {
		this.lastname = lastname;
	}
	public char getGender() {
		return gender;
	}
	public void setGender(char gender) {
		this.gender = gender;
	}
	public person(String firstname, String lastname, char gender) {
		super();
		this.firstname = firstname;
		this.lastname = lastname;
		this.gender = gender;
	}
	
@Override
	public String toString() {
		return "person [firstname=" + firstname + ", lastname=" + lastname + ", gender=" + gender + "]";
	}
public static void main(String[] args) {
	person p=new person("adithya", "prakash",'m');
	System.out.println(p);
}	
}

