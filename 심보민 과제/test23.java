package asd;

import java.util.Scanner;

public class test20 {

	public static void main(String[] args) {
		Scanner oo = new Scanner(System.in);
		
		System.out.print("피라미드를 표시합니다. \n단수는?:");
		
		int a = oo.nextInt();
		
		for (int b = 1; b <= a; b++) {
			for (int c = 1; c <= a-b; c++)
				System.out.print(' ');
			
			for (int c = 1; c <= 2*b-1; c++)
				System.out.print("*");
			System.out.println();
		}
		
		
		
	
	}

}


