package missss02;

import java.util.Scanner;

public class fish4 {

	public static void main(String[] args) {
		Scanner oo = new Scanner(System.in);
		
		System.out.println("1부터 x까지의 합을 구하자.");
		
		int a;
		
		do {
			System.out.print("x의 값:");
			a = oo.nextInt();
		} while (a <= 0);
			System.out.println("1부터 "+a+"까지의 합은" +ban(a)+"입니다.");
	}
		


		public static int ban(int b) {
			int qq = 0;
			
			for (int c = 1; c <= b; c++)
				qq+=c;
			return qq;
			
		





	}
	
}



