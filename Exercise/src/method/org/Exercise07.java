package method.org;

import java.util.Scanner;

public class Exercise07 {
	public static boolean leapYear(int year) {
		if (year%4==0) {
			return true;
		} else {
			return false;

		}
	}
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.println("Enter the num value");
		int year=s.nextInt();
		
		leapYear(year);
		
		if (leapYear(year)) {
			System.out.println("The given year is leap year");
			
		} else {
			System.out.println("The give year is not leap year");
		}
	
	
	s.close();
	}

}
