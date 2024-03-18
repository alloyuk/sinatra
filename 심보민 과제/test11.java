package asd;

import java.util.Scanner;

public class test11 {

	public static void main(String[] args) {
		Scanner oo = new Scanner(System.in);
		
		int g;
		
		do {
			System.out.println("양의 정숫값:");
			g= oo.nextInt();
			
		} while (g <= 0);
			int p = 1;
			int q = 1;
			
			while (p <= g) {
				q *= p;
				p++;/* 순서 안 지키면 이상하게 연산됨 q *= p; 보다 p(연산)이 앞으로 나오면 결과가 달라짐*/
				
		}
			
		System.out.println("1부터 "+g+"까지의 곱은 "+q+"입니다.");
		
	}

}

