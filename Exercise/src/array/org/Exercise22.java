package array.org;



public class Exercise22 {
	public static void main(String[] args) {
		String []a= {"Mugi","Navi","Raju","Mugil","Nidhi"};
		String temp;
		System.out.println("Original array");
		for (String string : a) {
			System.out.print(string +" ");
		}
		
		
	for (int i = 0; i < a.length; i++) {
		for (int j = i+1; j < a.length; j++) {
			if (a[i].compareTo(a[j])>0) {
				temp=a[i];
				a[i]=a[j];
				a[j]=temp;
			}
			
			
			
		}
		
	}   System.out.println();
		System.out.println("alphabetical order");
		for (String string : a) {
			System.out.print(string+" ");
		}
		
		
		
		
		
		
	}
}
