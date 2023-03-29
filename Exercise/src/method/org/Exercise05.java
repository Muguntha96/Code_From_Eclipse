package method.org;

import java.util.Scanner;

public class Exercise05 {
	public static void main(String[] args) {
		Scanner s =new Scanner(System.in);
		System.out.println("Enter the su value");
		int su=s.nextInt();
		System.out.println("Enter the a value");
		int a=s.nextInt();
		System.out.println("The area of pentagon is "+areaOfPentagon(su, a));
		
		s.close();
		
	}
	public static double areaOfPentagon(int s,int a) {
		
		
		return (5.0/2.0*s*a);
		

	}
	

}
