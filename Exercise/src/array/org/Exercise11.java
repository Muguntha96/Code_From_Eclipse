package array.org;

public class Exercise11 {
	public static void main(String[] args) {
		int[]a= {1,2,3,4};
		int[]b= {1,3,4,8};
		int[]c=new int[a.length];
		System.out.println("Sum of a & b array is: ");
		for (int i = 0; i < c.length; i++) {
			
			c[i]=a[i]+b[i];
			System.out.print(c[i]+" ");
			
		}
	
	
	
	
	}

}
