package kk;

import java.util.Scanner;

public class aa4 {

	public static void main(String[] args) {
		Scanner oo = new Scanner(System.in);
		
		System.out.print("왼쪽 아래가 직각인 이등변 삼각형을 표시합니다. \n단수는?:");
		
		int a = oo.nextInt();
		
		for (int b = 1; b <= a; b++) {
			for (int c = 1; c <= b-1; c++)
				System.out.print(" ");
			for (int c = 1; c<=a-b+1; c++)
				System.out.print("*");
			System.out.println();
			
		}
	
	}

}
