package linked.org;

import java.util.*;

public class Exercise02 {
	public static void main(String[] args) {
		
		LinkedList<Integer>a=new LinkedList<Integer>();

		
		a.add(1);
		a.add(2);
		a.add(3);
		a.add(4);
		a.add(5);
		
		
		Collections.swap(a, 0, 4);
		
		System.out.println(a);
		
		Collections.shuffle(a);
		System.out.println(a);
		LinkedList<Integer>b=new LinkedList<Integer>();
		b=(LinkedList)a.clone();
		System.out.println(b);
		LinkedList<Integer>c=new LinkedList<Integer>();
		c.add(10);
		c.add(11);
		c.add(12);
		c.add(13);
		
		LinkedList<Integer>d=new LinkedList<Integer>();
	d.addAll(a);
	d.addAll(c);
	System.out.println(d);
	d.pop();
	
	System.out.println(d);
	
	System.out.println(d.peekFirst());
	System.out.println(d);
	
	System.out.println(d.peekLast());
	
	if (d.contains(2)) {
		System.out.println("true");
	}
		
		ArrayList<Integer>s=new ArrayList<Integer>(d);
		for (Integer integer : s) {
			System.out.print(integer+" ");
			
		}
		d.set(1, 100);
		System.out.println();
		System.out.println(d);
	
	
	
	
	
	
	
	
	}
	
	

}
