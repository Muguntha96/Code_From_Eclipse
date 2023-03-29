package array.org;

public class Exercise21 {
	public static void main(String[] args) {
		int[] a= {9,6,4,1,5,10};
		int temp=0;
		
		
		System.out.println("Original array");
		for (int i : a) {
			System.out.print(i+" ");
		}
		System.out.println();
		System.out.println("Ascending order");
		for ( int i = 0; i < a.length; i++) {
			for (int j = i+1; j < a.length; j++) {
				if (a[i]>a[j]) {
					temp=a[i];
					a[i]=a[j];
					a[j]=temp;
					
				}
				
				
			}
		}
		
		
		for (int i : a) {
			System.out.print(i + " ");
		}
	}
	
		
	

		}

		
	

		
