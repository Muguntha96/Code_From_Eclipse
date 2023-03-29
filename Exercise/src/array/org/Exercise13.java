package array.org;

public class Exercise13 {
	public static void main(String[] args) {
		int size=4;
				
		int[][]a= {{1,2,3,4},
				   {2,3,4,2},
				   {4,5,6,5},
				   {2,3,4,5}};
		
		System.out.println("A array");
		print(a, size, size);

		
		
		int[][]b= {{1,4,5,6},
				   {5,6,7,7},
				   {7,5,1,3},
				   {2,3,4,5}};
		System.out.println("b array");
		print(b, size, size);
	
	
	
	
	int c[][]=add(a, b, size);
	System.out.println("c array");
	
	print(c, size, size);
	
	}
		
		
		
	public static void print(int M[][],int row,int col) {
		
		
		for (int i = 0; i <row; i++) {
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
