package asd;

import java.util.Scanner;

public class test13 {

	public static void main(String[] args) {
		Scanner oo = new Scanner(System.in);
		
		System.out.print("1부터 n까지의 합을 구합니다.");
		
		int q;
		
		do {
			System.out.print("n의 값:");
			q = oo.nextInt();
			
		}while (q <= 0);
		
		int y = 0;
		for (int r = 0; r <= q; r++)
			y += r;
		
		System.out.println("1부터 "+q+"까지의 합은 "+y+"입니다.");
	
	}

}



