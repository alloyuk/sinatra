package missss02;

import java.util.Random;
import java.util.Scanner;
import java.util.Scanner;

public class fish10 {

	public static void main(String[] args) {
		Scanner oo = new Scanner(System.in);
		Random rr = new Random();
		
		System.out.println("암산 훈련!!");
		
	
		
		do {
			int a = rr.nextInt(900) + 100;
			int b = rr.nextInt(900) + 100;
			int c = rr.nextInt(900) + 100;
			int d = rr.nextInt(4);
			
			
			int e;
			switch (d) {
				case 0: e = a+b+c; break;
				case 1: e = a+b-c; break;
				case 2: e = a-b+c; break;
				default: e = a-b-c; break;
			}while (true ) {
				System.out.print(a + ((d < 2)?"+":"-")+b+((d % 2 ==0) ?"+":"-")+c+"=");
				int f = oo.nextInt();
				if (f == e) 
					break;
				System.out.println("틀렸습니다.");
			}
			
		}while (light());

	}
	public static boolean light() {
		Scanner oo = new Scanner(System.in);
		int g;
		do {
			System.out.println("다시 한번?<Yes...1/No...0>:");
			g = oo.nextInt();
		}while (g != 0 && g != 1);
		return g ==1;
	






	}
	
}



