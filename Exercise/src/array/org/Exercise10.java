package array.org;

import java.util.ArrayList;

import java.util.List;



public class Exercise10 {
	public static void main(String[] args) {
		int[]a= {1,2,3,4,5};
		List<Integer>a2=new ArrayList<Integer>();
		
		
		for (Integer integer : a) {
			
			a2.add(integer);
			
			
		}
		System.out.print(a2);
	}

}
