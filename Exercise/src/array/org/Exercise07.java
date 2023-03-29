package array.org;

public class Exercise07 {
public static void main(String[] args) {
	int[] a= {1,3,4,2,5};
	int j=a.length-1;
	int i = 0;
	int[]b=new int[a.length];
	for ( i = 0; i < b.length; i++) {
		b[i]=a[j];
		j--;
		System.out.print(b[i]+" ");
	}
	
}
}
