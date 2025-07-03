package Has_a_Relation;

public class Executor {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Address address=new Address("405 Laxmi Nagar", "Pune", "Maharashtra", "4110001");
	
	
		Person p=new Person("Shruti", address);
		p.displayInfo();
		System.out.println(p);
	

	}

}
