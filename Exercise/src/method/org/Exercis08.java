package method.org;

public class Exercis08 {
	public static void main(String[] args) {
		int count=0;
		int a=102932;
		System.out.println("The count of the given digits "+countDigit(a, count));
		
		
	}
	public static  int countDigit(int a,int count) {
		while (a!=0) {
			a=a/10;
			count++;
				
		}
		
		return count;
		
	}
				
	}


