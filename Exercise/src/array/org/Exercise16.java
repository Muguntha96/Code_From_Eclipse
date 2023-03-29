package array.org;

public class Exercise16 {
	public static void main(String[] args) {
		int[]a= {2,1,4,3,7};
		int count=0;
		int sum=0;

		for (int i = 0; i < a.length; i++) {
			if (a[i]%2==0) {
				
				
				
				count++;
							}
			
			else {
				
				
				sum++;
							}
			
			
			
		}
		
		System.out.println("The count of even values in array: "+count);
		System.out.println("The count of odd values in array: "+sum);
		
	}

}
