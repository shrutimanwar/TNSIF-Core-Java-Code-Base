package String;

public class StringComparison {

	public static void main(String[] args) {
		
		//creating string using literals //pool memory
		String s1 = "TNSIF";
		String s2 = "TNSIF";
		
		//creating new string operator //heap memory
		
		String s3 = new String("TNSIF");
		String s4 = new String("TNSIF");
		
		//== equals
		System.out.println("Case 1 :"+ (s1==s2));
		System.out.println("Case 2 :"+ (s1==s3));	
		System.out.println("Case 3 :"+ (s2.equals(s1)));
		System.out.println("Case 4 :"+ (s2.equals(s4)));
		System.out.println("Case 5 :"+ (s3==s4));
		System.out.println("Case 6 :"+ (s3.equals(s4)));
		
		System.out.println(s1.hashCode());
		System.out.println(s2.hashCode());
		
		//compare by using compareTo
		
		System.out.println(s1.compareTo(s4));
		
		System.out.println(s1.compareToIgnoreCase(s4));
	}
	

}
