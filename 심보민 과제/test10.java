package asd;

import java.util.Scanner;

public class test10 {

	public static void main(String[] args) {
		Scanner oo = new Scanner(System.in);
		
		
		System.out.println("양의 정숫값의 자릿수를 표시합니다.");
		
		int a;
		
		
		do {
			System.out.println("양의 정숫값:");
			a = oo.nextInt();
		} while(a <= 0);
			int b = 0;
			while (a > 0) {
					a /= 10;
					b++;
			
			}
			
			System.out.println("입력한 숫자는 "+b+ "자리입니다.");
	
	}

}