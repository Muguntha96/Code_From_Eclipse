package method.org;

import java.util.Scanner;

public class Exercise06 {
	public static double areaOfTriangle(int b,int h) {
		return (1.0/2.0*b*h);

	}public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.println("Enter the b value");
		int b=s.nextInt();
		System.out.println("Enter the h value");
		int h=s.nextInt();
		System.out.println("Area of triangle is "+areaOfTriangle(b,h));
		s.close();
	
	
	}

}
