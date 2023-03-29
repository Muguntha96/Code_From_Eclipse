package collection.org;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Exercise03 {
	public static void main(String[] args) {
		remove();
	}
	public static void remove() {
		List<Integer> b=new ArrayList<Integer>();
		b.add(2);
		b.add(3);
		b.add(5);
		b.add(6);
		b.add(1);
		
		//1]Created ARRAY list
		
		System.out.println("The list is ");
		for (Integer integer : b) {
			System.out.print(integer+" ");
		}
		//2]removed one element from the array list
		
		b.remove(2);
		System.out.println();
		System.out.println("After removed element ");
		for (Integer integer : b) {
			System.out.print(integer+" ");
		}
		System.out.println();
		//3]check the element contains in a array list
		
		if (b.contains(3)) {
			System.out.println("Found");
		} else {
			System.out.println("Not found");
		}
		//4]sorted array list
		
		Collections.sort(b);
		System.out.println(b);
		
		//5]new created ARRAY list
		List<Integer> a=new ArrayList<Integer>();
		a.add(10);
		a.add(11);
		a.add(12);
		a.add(16);
		a.add(13);
		
		System.out.println("The list 2 is");
		System.out.println(a);
		
		//6]copied array list
		Collections.copy(a,b);
		System.out.println("The copied list");
		System.out.println(a);
		
		
		//7]shuffled array list
		Collections.shuffle(a);
		System.out.println("shuffled list");
		System.out.println(a);
		
		//8]reversed array list
		
		Collections.reverse(a);
		System.out.println("reversed list");
		System.out.println(a);
		
		//9]extracted array list
		
		List<Integer> c=a.subList(0, 4);
		System.out.println("Extracted list");
		System.out.println(c);
		
		//10]compared array list
		if (b==c) {
			System.out.println("Both are same");
		} else {
			System.out.println("Not same");
		}
		//11]SWAPPING
		System.out.println("Before swap");
		System.out.println(b);
		Collections.swap(b, 0, 3);
		System.out.println("The swapped array list");
		
		System.out.println(b);
		
		
		
	
		}

}
