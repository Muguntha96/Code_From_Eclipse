package array.org;


import java.util.Arrays;

public class Exercise23 {
	public static void main(String[] args) {
		
		String list[]= {"gamma","alpha","lamba","beta","armstrong"};
		
		System.out.println("Original array value");
		
		
		for (String string : list) {
		System.out.print(string+","+" ");	
		}
		
		
		System.out.println();
		System.out.println("arranged list");
		Arrays.sort(list);
		
		for (String string : list) {
			System.out.print(string+","+" ");
		}
	}

}
