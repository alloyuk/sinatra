package asd;

import java.util.Scanner;

public class test17 {

	public static void main(String[] args) {
		Scanner oo = new Scanner(System.in);
		
		System.out.println("계절을 찾습니다.");
		int a;
		
		do {
			int b;
			
			do {
				System.out.print("몇 월입니까?:");
				b = oo.nextInt();
			}while (b < 1 || b > 12);
			
			if (b >= 3 && b <= 5)
				System.out.println("봄 입니다.");
			
			else if (b >= 6 && b <= 8)
				System.out.println("여름 입니다.");
			
			else if (b >= 9 && b <= 11)
				System.out.println("가을 입니다.");
			
			else if (b == 12 || b == 1 || b == 2)
				System.out.println("겨울 입니다.");
			
			
			System.out.print("다시 하겠습니까? 1...yes/0...no:");
			a = oo.nextInt();
			
		}while (a == 1);
					
	
	}

}


