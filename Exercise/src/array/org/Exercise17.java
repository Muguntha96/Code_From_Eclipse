package array.org;


public class Exercise17 {
	public static void main(String[] args) {
		int[]a= {5,2,3,4,10};
		int max=0;
		int min=a[a.length-1];
		int diff=0;
		for (int i = 0; i < a.length; i++) {
			
			if (a[i]>max) {
				max=a[i];
			}
			if (a[i]<min) {
				min=a[i];
			}
			diff=max-min;
			
		}
		System.out.println("The max value of array is : "+max);
		System.out.println("The min value of array is : "+min);
		System.out.println("The difference of max and min of array is : "+diff);
		
		
		
		
		
	}

}
