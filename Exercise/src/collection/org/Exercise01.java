package collection.org;

import java.util.ArrayList;

public class Exercise01 {
	public static  void add() {
	ArrayList<String>a=new ArrayList<String>();
	a.add("Abi");
	a.add("Red");
	a.add("blue");
	a.add("green");
for (String string : a) {
	System.out.print(string+" ");
}
	
	
	}
	public static void main(String[] args) {
		add();
	}
}
