package array.org;

public class Exercise06 {
	public static void main(String[] args) {
		int[]a= {1,2,3,4,5};
		int num=7;
		 int index=4;
		 for (int i = 0; i < a.length; i++) {
			 
			 if (i==index) {
				a[i]=num;
				break;
			}
			 
			
		}
		 System.out.println("New array value is");
		 for (int i = 0; i < a.length; i++) {
			System.out.print(a[i]+" ");
		}
		 
	}

}
