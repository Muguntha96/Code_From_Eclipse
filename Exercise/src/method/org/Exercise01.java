package method.org;

public class Exercise01 {
	
	public static void main(String[] args) {
		
		Exercise01 a=new Exercise01();
		System.out.println("average of three values");
		a.avg();
		
	}
	
	public void avg() {
		int x=20;
		int y=30;
		int z=40;
		
		int sum=x+y+z;
		int avg=sum/3;
		System.out.println(avg);

	}

}
