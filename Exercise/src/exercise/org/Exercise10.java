package exercise.org;

public class Exercise10 {
	public static void main(String[] args) {
		int a=20;
		int sum=0;
		int j=0;
		for (int i = 1; i <=a; i++) {
			if (i%2==0) {
				sum=sum +i;
				if (sum>0) {
					j++;
					
				}
				System.out.println(i);
			}
			
			
			
		}
		
		System.out.println("count of even : " +j);
		 System.out.println("sum of even : "+sum);
	}

}
