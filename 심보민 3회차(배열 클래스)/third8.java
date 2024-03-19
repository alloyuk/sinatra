package test2;

import java.util.Scanner;

public class third8 {

	public static void main(String[] args) {
		Scanner oo = new Scanner(System.in);
		
		System.out.print("학급 수:");
		
		int a = oo.nextInt();
		int[][] b = new int[a][];
		int c = 0;
		
		for(int i=0;i<b.length;i++) {
			System.out.printf("\n%d반의 학생 수:",i+1);
			int d = oo.nextInt();
			b[i] = new int [d];
			c += d;
			
			for(int j=0;j<b[i].length; j++) {
				System.out.printf("%d반%d번의 점수:", i+1, j+1);
				b[i][j] = oo.nextInt();
			}
		}
		System.out.println("반|합계 평균");
		System.out.println("-----+---------");
		int e = 0;
		for(int i=0; i<b.length;i++) {
			int f=0;
			for(int j=0;j<b[i].length; j++)
				f += b[i][j];
			e += f;
			System.out.printf("%2d반|%7d%7.1f\n", i+1, f, (double)f/b[i].length);
		}
		System.out.println("-----+---------");
		System.out.printf("합|%7d%7.1f\n", e, (double)e/c);

	}

}
