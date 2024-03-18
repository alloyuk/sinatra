package missss02;

import java.util.Scanner;

public class fish7 {

	public static void main(String[] args) {
		Scanner oo = new Scanner(System.in);
		
	
		
		System.out.println("왼쪽 아래가 직각인 이등변 삼각형을 표시합니다.");
		System.out.print("단수는:");
		
		int a = oo.nextInt();
		for (int b = 1; b <= a; b++) {
			
			script(b);
			System.out.println();
			
			
			oo.close();
			

			
		}
		




	}
	
	public static void proto(char c, int a) {
		while(a--> 0)
			System.out.print(c);
			
		}
		 


	
	
	public static void script(int a) {
		proto('*', a);
		
		
	}
	
}



