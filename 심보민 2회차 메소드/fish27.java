package missss02;

import java.util.Scanner;

public class fish27 {

	public static void main(String[] args) {
		Scanner oo = new Scanner( System.in);
		
		int[][] a = {{1,2,3},{4,5,6}};
		int[][] b = {{6,3,4},{5,1,2}};
		int[][] c = {{7,5,7},{9,6,8}};
		
		if(addMatrix(a,b,c)) {
			System.out.println("행렬a"); script(a);
			System.out.println("\n행렬b"); script(b);
			System.out.println("\n행렬c"); script(c);
		}






	}
	
	public static boolean addMatrix(int[][]x, int[][]y, int[][]z) {
		if (x.length!= y.length || y.length != z.length)
			return false;
		for(int u = 0; u < x.length; u++)
			if(x[u].length != y[u].length || y[u].length !=z[u].length)
				return false;
		for(int u = 0; u < x.length; u++)
			for(int i = 0; i < x[u].length; i++)
				z[u][i] = x[u][i]+y[u][i];
		return true;
		
	}
	
	public static void script(int[][] c) {
		for (int u = 0; u < c.length; u++) {
			for(int i = 0; i < c[u].length; i++)
				System.out.print(c[u][i]+" ");
			System.out.println();
			
		}


	}
	
}



