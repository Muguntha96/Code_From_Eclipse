package method.org;

public class Exercise09 {
	public static void main(String[] args) {
	
		int a=12594122;
		
		System.out.println(sumOfNum(a));
		
	}
	public static int sumOfNum(long a) {
		int sum=0;
		while (a>0) {
			sum+=a%10;
			a=a/10;
		}
		return sum;
		
	}

}
