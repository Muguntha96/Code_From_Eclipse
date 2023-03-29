package method.org;



public class Exercise10 {
	public static void main(String[] args) {
		String str="India is my country all indians are brothers and sisters";
		System.out.println(str);
		int count=0;
		int i=0;
		int len=str.length();
		for (int j = 0; j < len; j++) {
			if (str.charAt(i)==' '&& Character.isLetter(str.charAt(i+1))&&(i>0)) {
				count++;
			}
			
		}
		count++;
		System.out.println("There are totaly "+count + " words.");
		}
		
	}

