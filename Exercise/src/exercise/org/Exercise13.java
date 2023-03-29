package exercise.org;

public class Exercise13 {
	
	public static void main(String[] args) {
		int[] a= {1,2,3,4,6,8,9};
		int j=0;
		int k=0;
		for (int i = 0; i<a.length; i++) {
			if (a[i]%2==0) {
				j++;
			}else if (a[i]%2!=0) {
				k++;
			}
			System.out.print(a[i]+ " ");
		}
		System.out.println("count of even: "+j);
		System.out.println("count of odd :"+k);
	}

}
