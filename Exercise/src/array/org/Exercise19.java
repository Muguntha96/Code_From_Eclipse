package array.org;

public class Exercise19 {
	public static void main(String[] args) {
		int[]a= {2,1,3,10,5};
		int temp=0;
		for (int i = 0; i < a.length; i++) {
			for (int j = i+1; j < a.length; j++) {
				if (a[i]<a[j]) {
					temp=a[j];
					a[j]=a[i];
					a[i]=temp;
				}
			}
			System.out.print(a[i]+" ");
		}
		
		
	}

}
