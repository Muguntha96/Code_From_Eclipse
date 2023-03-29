package array.org;


import java.util.HashSet;

public class Exercise25 {
public static void main(String[] args) {
	int[] a= {1,2,2,3,1,4,3,9,4,9,8,10};
	System.out.println("Original arral");
	for (int i : a) {
		System.out.print(i+" ");
	}
	
	HashSet<Integer> set=new HashSet<Integer>();
	for (int i = 0; i < a.length; i++) {
		set.add(a[i]);
	}	System.out.println();
	
	System.out.println("Unique values");
	System.out.println(set);
	

}
}
