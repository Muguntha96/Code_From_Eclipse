package string.org;

public class Exercise01 {
	public static void main(String[] args) {
		String f1="MUGUNTHa";
		String l1="ramkumar";
		String n1="  Muguntha is a good girl   ";
		
		String s=f1.concat(l1);
		System.out.println(s);
		String s2=f1.toLowerCase();
		System.out.println(s2);
		String s3=f1.toUpperCase();
		System.out.println(s3);
		String s4=n1.trim();
		System.out.println(s4);
		
		String s5= n1.substring(10);
		System.out.println(s5);
		String s6=n1.replace('g', 'h');
		System.out.println(s6);
		System.out.println(n1.length());
		int s7=n1.charAt(10);
		System.out.println(s7);
		for (int i = n1.length()-1; i >=0 ; i--) {
			char s8=n1.charAt(i);
			System.out.print(s8);
			
		}
	}

}
