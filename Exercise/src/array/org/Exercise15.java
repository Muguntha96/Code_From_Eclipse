package array.org;

public class Exercise15 {
public static void main(String[] args) {
	int[]a= {0,1,4,-1,5};
	int n=0;
	int mini=a[n];
	int secondmini = 0;
	for (int i = 1; i < a.length; i++) {
		if (a[i]<mini) {
			secondmini=mini;
			mini=a[i];
			
		}else if(a[i]<secondmini) {
			secondmini=a[i];
			
		}
		
		
		
		
	}
	
	
	System.out.println("Second smallest value of an array: "+secondmini);
	System.out.println("smallest value of an array: "+mini);
	
	
	
}
}
