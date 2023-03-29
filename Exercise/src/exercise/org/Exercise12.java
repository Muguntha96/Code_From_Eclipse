package exercise.org;

import java.util.Scanner;

public class Exercise12 {
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		int a=s.nextInt();
		int j=0;
		while (a>0) {
			
			a=a/10;
			j++;
		}
				System.out.println("Count of the number : "+ j);
				s.close();
	}

}
