package array.org;

public class Exercise08 {
	public static void main(String[] args) {
		int[]a= {1,2,3,4,5};
		int[]b= {2,3,6,7,4};
	System.out.println("the common values of both the array is :");
		for (int i = 0; i < a.length; i++) {
			for (int j = 0; j < b.length; j++) {
				if (a[i]==b[j]) {
					System.out.print(b[j]+" ");
				}
				
			}
			
		}
	}

}
