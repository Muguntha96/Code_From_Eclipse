package linked.org;

import java.util.HashSet;

public class Exercise04 {
	
	public static void main(String[] args) {
		HashSet<String>c=new HashSet<String>();
		c.add("Black");
		c.add("Green");
		c.add("Yellow");
		c.add("Grey");
		c.add("Black");
		System.out.println("The colours are: "+c);
		
		c.add("purple");
		System.out.println(c);
	}

}
