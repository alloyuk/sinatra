package asd;

import java.util.Scanner;

public class test18 {

	public static void main(String[] args) {
		Scanner oo = new Scanner(System.in);
		
		System.out.print("정방형을 표시합니다. \n단수는:");
		
		int a = oo.nextInt();
		
		for(int b = 1; b <= a; b++) {
			for (int c = 1; c <= a; c++)
				System.out.print("*");
			System.out.println();
		}
			
		
	
	}

}

