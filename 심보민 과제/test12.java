package asd;

import java.util.Scanner;

public class test12 {

	public static void main(String[] args) {
		Scanner oo = new Scanner(System.in);
		
		System.out.println("카운트업 합니다.");
		int p;
		
		do {
			System.out.println("양의 정숫값:");
			p = oo.nextInt();
			
			}while (p <= 0);
		
			for (int u = 0; u <= p; u++)
				System.out.println(u);
	
	}

}


