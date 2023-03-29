package exercise.org;

import java.util.Scanner;

public class Exercise05 {
	public static void main(String[] args) {
		Scanner s= new Scanner(System.in);
		System.out.println("Enter i/p 1");
		int a=s.nextInt();
		System.out.println("Enter i/p 2");
		int b=s.nextInt();
		System.out.println("Enter i/p 3");
		int c=s.nextInt();
		System.out.println("Enter i/p 4");
		int d=s.nextInt();
		System.out.println("Enter i/p 5");
		int e=s.nextInt();
		
		int sum=a+b+c+d+e;
		int avg=sum/5;
		System.out.println(sum);
		System.out.println(avg);
		s.close();
		
	}

}
