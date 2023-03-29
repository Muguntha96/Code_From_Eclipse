package exercise.org;

public class Exercise09 {
	public static void main(String[] args) {
		int a=12345;
		int sum=0;
		int rem;
		while (a>0) {
			rem=a%10;
			sum=sum+rem;
			a=a/10;
			
			
			
		}
		System.out.println(sum);
		
	}
}
