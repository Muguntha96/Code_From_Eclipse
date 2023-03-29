package method.org;

import java.util.Scanner;

public class Exercise04 {
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.println("Enter the number");
		int num=s.nextInt();
		
		Exercise04.even(num);
		
		if (even(num)) {
			System.out.println("The given number is even");
		} else {
			System.out.println("The number is not even");
		}
		
		s.close();
		
		
	}
	public static boolean even(int num) {
		if (num%2==0) {
			return true;
		} else {
			return false;
		}
		
	}

}
