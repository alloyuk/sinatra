package missss02;

import java.util.Scanner;

public class fish28 {

	public static void main(String[] args) {
		Scanner oo = new Scanner( System.in);
		
		System.out.print("행렬의 행 수:");
		int f = oo.nextInt();
		System.out.print("행렬의 열 수:");
		int g = oo.nextInt();
		
		int[][] a = new int[f][g];
		int[][] b = new int[f][g];
		
		for(int u = 0; u < a.length; u++) {
			for(int i =0; i < a[u].length; i++) {
			System.out.printf("a[%d][%d]:", u,i);
			a[u][i] = oo.nextInt();
			}
		}
		for (int u=0; u<b.length; u++) {
			for (int i = 0; i < b[u].length; i++) {
				System.out.printf("b[%d][%d]:", u,i);
				b[u][i] = oo.nextInt();
			}
		}
		
		
			int[][] h = addMatrix(a,b);
			System.out.println("행렬a"); script(a);
			System.out.println("\n행렬b"); script(b);
			System.out.println("\n행렬c"); script(h);
		}






	
	
	public static int[][] addMatrix(int[][]x, int[][]y) {
		int[][] a = new int[x.length][];
		
		for(int u = 0; u < x.length; u++) {
			a[u] = new int[x[u].length];
		for(int i = 0; i < x[u].length; i++)
				a[u][i] = x[u][i]+y[u][i];
		}
		return a;
		
	}
	
	public static void script(int[][] c) {
		for (int u = 0; u < c.length; u++) {
			for(int i = 0; i < c[u].length; i++)
				System.out.print(c[u][i]+" ");
			System.out.println();
			
		}


	}
	
}



