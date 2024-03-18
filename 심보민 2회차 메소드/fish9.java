package missss02;

import java.util.Scanner;

public class fish9 {

	public static void main(String[] args) {
		Scanner oo = new Scanner(System.in);
		
		
		int a ;
		
		do {
			int b = readPlusInt();
			System.out.print("반대로 읽으면");
			
			while ( b > 0) {
				System.out.print(b%10);
				b /=10;
			}
			System.out.println(" 입니다.");
			
			do {
				System.out.println("다시 한번?<Yes...1/No...0>:");
				a = oo.nextInt();
			}while (a!=0 && a!=1);
		}while (a==1);
			
		}





	
	public static int readPlusInt() {
		Scanner oo = new Scanner(System.in);
		int a;
		do {
			System.out.print("양의 정숫값:");
			a = oo.nextInt();
					
		}while ( a <=0 );
		return a;
	

	}
	
}



