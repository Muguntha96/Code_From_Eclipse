package array.org;

public class Exercise05 {
	public static void main(String[] args) {
		int[] a= {1,2,4,5,7};
		int max=0;
		int min=a[0];
		for (int i = 0; i < a.length; i++) {
			if (a[i]>max) {
				max=a[i];
			}
		}
		System.out.println("max value of array is : "+max);
		for (int i = 1; i < a.length; i++) {
			if (a[i]<min) {
				min=a[i];
			}
		}
		System.out.println("min value of array is : "+min);
	}
	
	}


