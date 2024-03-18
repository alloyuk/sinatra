package asd;

import java.util.Scanner;

public class test22 {

	public static void main(String[] args) {
		Scanner oo = new Scanner(System.in);
		
		
		int a;
		
		do {
			System.out.print("2이상의 정숫값:");
			a=oo.nextInt();
		}while (a < 2);
		int b;
		
		for (b = 2; b <a; b++)
			if (a % b ==0)
				break;
		
		if (b == a)
			System.out.println("소수입니다.");
		else
			System.out.println("소수가 아닙니다.");
		
		
	
	}

}