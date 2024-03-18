package asd;

import java.util.Scanner;

public class test9 {

	public static void main(String[] args) {
		Scanner oo = new Scanner(System.in);
		
		System.out.print("몇 개를 표시할까요?:");
		
		int a = oo.nextInt();
	
		
		for(int b = 1; b <= a; b++) {
			
			if(b % 2 == 1) {
				if(b != 0) {
					System.out.print("*");
				}
			}else {
				if(b != 0) {
					System.out.print("+");
				}
			}
		}
		System.out.println();
	}

}