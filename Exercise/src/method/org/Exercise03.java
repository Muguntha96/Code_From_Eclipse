package method.org;

public class Exercise03 {
	public static void main(String[] args) {
	
		
		Exercise03.palindrome();
	}
		
	
	
	
	
	public static void palindrome() {
		int a=10231;
		int rem=0;
		int rev=0;
		int temp=a;
		
		
		while (a>0) {
			rem=a%10;
			rev=(rev*10)+rem;
			a=a/10;
			
			
			
			
			
		}
		System.out.println("Reverse number is " + rev);
		
		if (temp==rev) {
			System.out.println("The number is palindrome");
		} else {System.out.println("Non palindrome");}
		
		
	}
	}


