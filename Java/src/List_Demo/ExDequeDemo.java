package List_Demo;

import java.util.ArrayDeque;
import java.util.Deque;

public class ExDequeDemo {

	public static void main(String[] args) {
	
		Deque<String> deque1=new ArrayDeque<String>();
		deque1.add("Rohan");
		deque1.add("Aditya");
		deque1.add("Shreya");
		deque1.add("Ritu");
		
		System.out.println(deque1);
		
		deque1.pollLast();
		System.out.println(deque1);
		
		deque1.pollFirst();
		System.out.println(deque1);
		
		for(String str : deque1)
		{
			System.out.println("queue is :"+ str);
		}
		
		System.out.println(deque1);
		

	}

}