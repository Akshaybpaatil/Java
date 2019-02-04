package Assignments;

public class asiignment2_4 {
	String firstname;
	String lastname;
	char gender;
	int phonenumber;
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
	public int getPhonenumber() {
		return phonenumber;
	}
	public void setPhonenumber(int phonenumber) {
		this.phonenumber = phonenumber;
	}
	public asiignment2_4(String firstname, String lastname, char gender, int phonenumber) {
		super();
		this.firstname = firstname;
		this.lastname = lastname;
		this.gender = gender;
		this.phonenumber = phonenumber;
	}
	@Override
	public String toString() {
		return "asiignment2_4 [firstname=" + firstname + ", lastname=" + lastname + ", gender=" + gender
				+ ", phonenumber=" + phonenumber + "]";
	}
	public static void main(String[] args) {
		asiignment2_4 a=new asiignment2_4("siva", "ariga", 'm', 812119);
		System.out.println(a);
	}

}
