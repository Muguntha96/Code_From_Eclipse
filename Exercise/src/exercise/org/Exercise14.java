package exercise.org;



public class Exercise14 {
	public static void main(String[] args) {
		int[] a= {1,2,3,4,5,6};
		int x;
		x=a[0];
		a[0]=a[a.length-1];
		a[a.length-1]=x;
		for (int i = 0; i < a.length; i++) {
			System.out.print(a[i] + " ");
		}
		
		
			
			
			

	}

}
