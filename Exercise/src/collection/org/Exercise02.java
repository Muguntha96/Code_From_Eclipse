package collection.org;

import java.util.ArrayList;
import java.util.List;



public class Exercise02 {
	public static void main(String[] args) {
		insert();
	
		
	}
	
	public static void insert() {
		List<Integer>n=new ArrayList<Integer>();
		n.add(1);
		n.add(2);
		n.add(3);
		n.add(4);
		n.add(5);
System.out.println("The created array list is : ");
		for (Integer integer : n) {
			System.out.print(integer+" ");
		}
		System.out.println();
		System.out.println("The new list with inserted value");
		n.set(0, 3);
		n.set(1, 10);
		for (Integer integer : n) {
			System.out.print(integer+" ");
		}
	}

}
