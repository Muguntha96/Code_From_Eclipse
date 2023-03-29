package array.org;

import java.util.Scanner;

public class Exercise24 {
	
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.println("Enter the no of subjects");
		int subjects=s.nextInt();
		int total=0;
		int[] marks=new int[subjects];
		int[] result=new int[subjects];
		System.out.println("Enter all the subjects marks");
		for (int i = 0; i < result.length; i++) {
			
		
			 marks[i]= s.nextInt();
		
		total=total+marks[i];
		
		}
		System.out.println("Total marks of a student :"+total);
		int percent=total/subjects;
		System.out.println("percent of total : "+percent);
		
		
		s.close();
	
	
	

	
	
	
	
	
	
	
	}

}
