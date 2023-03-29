package array.org;

public class Exercise14 {
	public static void main(String[] args) {
		int[]a= {5,6,3,7,10};
		int max=0;
		int secondmax=0;
		for (int i = 0; i < a.length; i++) {
			if (a[i]>max) {
				secondmax=max;
				max=a[i];
				
			} else if (a[i]>secondmax) {
				secondmax=a[i];
			} 

			
			
		}
			
			System.out.println("The largest value of array is: "+max);
			System.out.println("The second largest value of array is :"+secondmax);
		}
		
		
	}


