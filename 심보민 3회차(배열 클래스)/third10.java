package test2;

import java.util.Scanner;

public class third10 {

	public static void main(String[] args) {
		Scanner oo = new Scanner(System.in);
		
		final int a = 6;
		int[][] b = new int[a][2];
		int[] c = new int[a];
		int[] d = new int[2];
		
		System.out.printf("%d명의 국어, 수학 점수를 입력하세요.\n", a);
		
		for(int i=0; i<a; i++) {
			System.out.printf("%2d번 국어:", i+1);
			b[i][0] = oo.nextInt();
			System.out.print("   수학:");
			b[i][1] = oo.nextInt();
			c[i] = b[i][0]+b[i][1];
			d[0] += b[i][0];
			d[1] += b[i][1];
			
		}
		System.out.println("No. 국어    수학    평균");
		for(int i=0; i<a; i++)
			System.out.printf("%2d%6d%6d%6.1f\n", i+1, b[i][0], b[i][1], (double)c[i]/2);
		System.out.printf("평균%6.1f%6.1f\n", (double)d[0]/a, (double)d[1]/a);
		

	}

}
