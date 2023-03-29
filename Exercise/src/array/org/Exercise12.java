package array.org;


public class Exercise12 {
	public static void main(String[] args) {
		int size=3;
	int[][]a= {{1,3,4},
			   {2,3,4},
			   {4,5,6}};
	System.out.println("a array value");
	print(a, size, size);
	int[][]b= {{1,4,5},
			   {3,4,5},
			   {3,6,7}};
	
	System.out.println("b array value");
	print(b, size, size);
	
	
	
	int[][]c=add(a, b, size);
	System.out.println("c array value");
	print(c, size, size);
	
	}	

	public static void print(int M[][],int row,int col) {
		for (int i = 0; i < row; i++) {
			for (int j = 0; j < col; j++) 
				System.out.print(M[i][j]+" ");
				System.out.println();
			
			
		
		
		}
		

	}
	
	public static int[][] add(int a[][],int b[][],int size) {
		int c[][]=new int[size][size];
		for (int i = 0; i < size; i++) 
			for (int j = 0; j < size; j++) 
				c[i][j]=a[i][j]+b[i][j];
				
			
			
		
		
		return c;
	

	}
	

}
