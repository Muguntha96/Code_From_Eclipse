package array.org;

public class Exercise03 {
	public static void main(String[] args) {
		int[] a= {1,2,3,4,5};
	int sum=0;
	for (int i = 0; i < a.length; i++) {
		sum=sum+a[i];
		
	}
	System.out.println("Sum of array is : "+ sum);
	int avg=sum/a.length;
	System.out.println("avg of array is :" + avg);
	
	
	}
}
