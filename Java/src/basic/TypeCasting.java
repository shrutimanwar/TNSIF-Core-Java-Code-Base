package basic;

public class TypeCasting {
public static void main(String[] args) {
		
		//widening or implicit type TypeCasting
		
		byte b = 10;
		int i = b;
		System.out.println(i);
		
		float f = 22.14f;
		double d = f;
		System.out.println(d);
		
		//narrowing or Explicit TypeCasting
		
		double f1 = 10.52f;
		long l1 = (long) f1;
		System.out.println(l1);
		
		long l2 = 8857898946L;
		int il2 = (int) l2;
		System.out.println(il2);
		
		short a = 130;
		byte b1 = (byte) a;
		System.out.println(b1);
		
		//byte -128 to 127
		

	}

}


