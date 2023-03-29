package collection.org;

import java.util.ArrayList;

public class Exercise04 {
	public static void main(String[] args) {
		ArrayList<Integer>A=new ArrayList<Integer>();
	
		A.add(1);
		A.add(2);
		A.add(3);
		A.add(4);
		ArrayList<Integer>B=new ArrayList<Integer>();
		B.add(5);
		B.add(6);
		B.add(7);
		B.add(8);
		System.out.println("Joined Array");
		
		ArrayList<Integer>C=new ArrayList<Integer>();
		C.addAll(A);
		C.addAll(B);
		for (Integer integer : C) {
			System.out.print(integer+" ");
		}
		System.out.println();
		
	ArrayList<Integer>D=(ArrayList<Integer>)C.clone();
		System.out.println("Cloned array");
		System.out.print(D+" ");
		
		
		System.out.println();
		System.out.println("Emptied array");
		
		A.clear();
		System.out.println(A);
		if (A.isEmpty()) {
			System.out.println("Array is empty");
		} else {
			System.out.println("Array is not value");
		}
		
		
		System.out.println("Trimmed array");
		
		D.trimToSize();
		System.out.println(D);
		System.out.println();
		System.out.println("Increased the size");
	C.ensureCapacity(5);
	C.add(11);
	C.add(12);
	System.out.println(C);
	
	
	System.out.println("Replaced array list");
	C.set(5, 100);
	System.out.println(C);
	
	System.out.println("All the elements printed based on the index");
	for (int i = 0; i < C.size(); i++) {
		System.out.print(C.get(i)+" ");
		
	}
		
		
	}
	
	


}
