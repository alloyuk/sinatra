package missss02;

import java.util.Scanner;

public class fish29 {

	public static void main(String[] args) {
		Scanner oo = new Scanner( System.in);
		
		System.out.print("행렬의 행 수:");
		int f = oo.nextInt();
		System.out.print("행렬의 열 수:");
		int g = oo.nextInt();
		
		int[][] a = new int[f][g];
		
		for(int u = 0; u < a.length; u++) {
			for(int i =0; i < a[u].length; i++) {
			System.out.printf("a[%d][%d]:", u,i);
			a[u][i] = oo.nextInt();
			
			}
		}
			int[][] b=aryClone2(a);
			System.out.println("행렬a");
			script(a);
		
	
			System.out.println("행렬의 복사본");
			script(b);
		}






	
	
	public static int[][] aryClone2(int[][]a) {
		int[][] b = new int[a.length][];
		for(int u = 0; u < a.length; u++) {
			b[u] = new int[a[u].length];
		for(int i = 0; i < a[u].length; i++)
				b[u][i] = a[u][i];
		}
		return b;
		
	}
	
	public static void script(int[][] c) {
		for (int u = 0; u < c.length; u++) {
			for(int i = 0; i < c[u].length; i++)
				System.out.print(c[u][i]+" ");
			System.out.println();
			
		}


	}
	
}


