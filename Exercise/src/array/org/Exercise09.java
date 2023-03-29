package array.org;

public class Exercise09 {
	public static void main(String[] args) {
		int[]a= {1,2,3,2,4,5,1};
		
		System.out.println("Duplicate value of the array is : ");
		for (int i = 0; i < a.length; i++) {
			for (int j = i+1; j < a.length; j++) {
				if ((a[i]==a[j])&&(i!=j)) {
					System.out.print(a[j]+" ");
				}
				
			}
			
		}
	}

}
