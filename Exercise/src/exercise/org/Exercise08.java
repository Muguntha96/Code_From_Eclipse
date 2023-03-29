package exercise.org;

public class Exercise08 {
	public static void main(String[] args) {
		int n=12344;
		
		System.out.println("sum of digits is :"+ sum(n));
	}
		
public static  int sum(int n) {
	int sum=0;
	while(n!=0) {
		sum= sum + n%10;
		n=n/10;
		
		
		
		
	}
	return sum;

}
	}
		
	
	

