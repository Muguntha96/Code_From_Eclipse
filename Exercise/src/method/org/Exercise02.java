package method.org;

import java.util.Scanner;

public class Exercise02 {
public static void main(String[] args) {
	
	Exercise02 fac=new Exercise02();
	fac.fact();
	
	
	
}

public void fact() {
	Scanner s=new Scanner(System.in);
	int i=1;
	int fact=1;
	System.out.println("Enter the factorial number");
	int f=s.nextInt();
	while (i<=f) {
		
		 fact=fact*i;
		 i++;
		 
	}
	System.out.println("The factoria of "+f+" is "+ fact);
	
s.close();
}
		
	
	
	

}



