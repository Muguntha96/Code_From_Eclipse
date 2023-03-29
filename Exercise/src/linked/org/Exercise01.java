package linked.org;

import java.util.*;

public class Exercise01 {
	public static void main(String[] args) {
		Exercise01 c=new Exercise01();
		c.append();
	}
	public void append() {
		LinkedList<Integer>a=new LinkedList<Integer>();
		a.add(1);
		a.add(2);
		a.add(3);
		a.add(4);
		System.out.println(a);
		System.out.println('\n'+"Appened the element");
		a.addLast(10);
		System.out.println(a);
		System.out.println('\n'+"Iterated through loop");
		
		LinkedList<String>b=new LinkedList<String>();
		b.add("Red");
		b.add("Blue");
		b.add("Green");
		b.add("Black");
		for (String string : b) {
			System.out.print(string+" ");
		}
		System.out.println();
		System.out.println('\n'+"Iterated with specific loop");
		for (int i = 2; i < b.size(); i++) {
			System.out.print(b.get(i)+" ");
		}
		System.out.println();
		Iterator x=b.descendingIterator();
		System.out.println('\n'+"Reversed linked list");
		while (x.hasNext()) {
			System.out.print(x.next()+" ");
		}
		System.out.println();
		System.out.println('\n'+"Update the element in specific position");
		a.add(3, 20);
		System.out.println(a  );
		
		
		System.out.println('\n'+"Add the elements in 1st and last position");
		b.addFirst("pink");
		b.addLast("Orange");
		System.out.println(b);
		
		System.out.println('\n'+"Add the element in the list at the specified position");
		b.add(3, "Peach");
	System.out.println(b);
	
	System.out.println('\n'+"Get the last and first element in the list");
	
	b.getLast();
	System.out.println(b.getFirst());
	System.out.println(b.getLast());
	
	System.out.println('\n'+"List the elements and position");
	
for (int i = 0; i < b.size(); i++) {
	System.out.println(i+" "+b.get(i));
}

System.out.println('\n'+"Remove the elements at the specified position");
b.remove(4);
System.out.println(b);

System.out.println('\n'+"Remove the first and last elements for the list");
	b.removeFirst();
	b.removeLast();
	System.out.println(b);
System.out.println('\n'+"Remove all the elements from the list");
	b.removeAll(b);
	System.out.println('\n'+"Check the linked list is empty or not");
	System.out.println(b.isEmpty());
	
	}
	
	

}
