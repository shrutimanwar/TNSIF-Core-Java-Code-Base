package Single_Inheritance;

public class SingleInheritance_Student extends SingleInheritance_Citizen
{
	
	//data member
	private int rollno;
	private String collegeName;
	
	//non para constructor
	public SingleInheritance_Student() {
		super();
	}

	//para constructor
	public SingleInheritance_Student(String name, String adharNo, String address, long phone, int rollno, String collegeName)  {
		super( name,adharNo,address,phone);
		this.rollno = rollno;
		this.collegeName = collegeName;
		
	}

	//getter and setter
	public int getRollno() {
		return rollno;
	}

	public void setRollno(int rollno) {
		this.rollno = rollno;
	}

	public String getCollegeName() {
		return collegeName;
	}

	public void setCollegeName(String collegeName) {
		this.collegeName = collegeName;
	}

	//toString
	@Override
	public String toString() {
		return "SingleInheritance_Student [rollno=" + rollno + ", collegeName=" + collegeName + ", getName()="
				+ getName() + ", getAdharNo()=" + getAdharNo() + ", getAddress()=" + getAddress() + ", getPhone()="
				+ getPhone() + "]";
	}

	
	
	
	
	

}
