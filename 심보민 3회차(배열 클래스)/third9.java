package test2;

import java.util.Scanner;

public class third9 {

	public static void main(String[] args) {
		Scanner oo = new Scanner(System.in);
		
		System.out.println("불규칙한 2차원 배열을 생성합니다.");
		System.out.print("행 수:");
		int a = oo.nextInt();
		
		int[][] b = new int[a][];
		
		for(int i=0; i<b.length;i++) {
			System.out.print(i+"행째의 열 수:");
			int c = oo.nextInt();
			b[i] = new int[c];
		}
		
		System.out.println("각 요소의 값을 입력하세요.");
		for(int i=0; i<b.length; i++) {
			for(int j=0; j<b[i].length; j++) {
				System.out.printf("c[%d][%d]:", i, j);
				b[i][j] = oo.nextInt();
				
			}
		}
		
		System.out.println("배열 c의 각 요솟값은 다음과 같습니다.");
		for(int i=0;i<b.length;i++) {
			for(int j=0; j < b[i].length; j++)
				System.out.printf("%3d", b[i][j]);
			System.out.println();
		}

	}

}
