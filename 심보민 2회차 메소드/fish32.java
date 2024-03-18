package missss02;

import java.util.Scanner;

public class fish32 {

	public static void main(String[] args) {
		Scanner oo = new Scanner(System.in);
		
		System.out.print("1차원 행렬 y의 요소 수:");
		int al = oo.nextInt();
		int[] g = new int[al];
		
		for (int u = 0; u < al; u++) {
			System.out.print("x["+u+"]:");
			g[u] = oo.nextInt();
		}
		
		System.out.print("2차원 배열 y의 행 수:");
		int kl = oo.nextInt();
		int[][] h = new int[kl][];
		for(int u = 0; u < h.length; u++) {
			System.out.print(u+"행째 열 수:");
			int j = oo.nextInt();
			h[u] = new int [j];
		}
		System.out.println("각 요소의 값을 입력하자.");
		for(int u = 0; u < h.length; u++) {
			for(int i =0; i < h[u].length; i++) {
				System.out.printf("y[%d][&d]:", u,i);
				h[u][i] = oo.nextInt();
			}
		}
		System.out.println("\n1차원 배열 x");
		printArray(g);
		System.out.println("\n2차원 배열 y");
		printArray(h);
		
		
	}
	
	public static void printArray(int[]a) {
		for (int u = 0; u < a.length - 1; u++)
			System.out.print(a[u]+" ");
		System.out.print(a[a.length - 1]);
		System.out.println();
		
		
	}
	
	public static void printArray(int[][]a) {
		int[][] b = new int[a.length][];
		int c = 0;
		for (int u = 0; u < a.length; u++) {
			b[u] = new int[a[u].length];
			if (a[u].length > c)
				c = a[u].length;
		}
		int[] d = new int[c];
		for (int u = 0; u < a.length; u++) {
			for(int i = 0; i < a[u].length; i++) {
				int e = a[u][i];
				b[u][i] = (e < 0) ? 1:0;
				
				do {
					b[u][i]++;
					e/=10; } while (e!=0);
				if (b[u][i] > d[i])
					d[i] = b[u][i];
				}
			}
		
		for (int u = 0; u < a.length; u++) {
			for(int i = 0; i < a[u].length - 1; i++) {
				System.out.print(a[u][i]);
				for (int f = 0; f<=d[i] - b[u][i]; f++)
					System.out.print(' ');
			}
			System.out.println(a[u][a[u].length -1]);
		}
		
	}








}
	




