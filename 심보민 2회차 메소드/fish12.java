package missss02;

import java.util.Scanner;

public class fish12 {

	public static void main(String[] args) {
		Scanner oo = new Scanner(System.in);
		
		System.out.println("정수x를 n비트 회전합니다.");
		System.out.print("x:"); int a = oo.nextInt();
		System.out.print("n:"); int b = oo.nextInt();
		System.out.print("회전 전 = "); mind(a);
		System.out.print("\n오른쪽 회전 = "); mind(rRotate(a, b));
		System.out.print("\n왼쪽 회전 = "); mind(lRotate(a, b));
		System.out.println();






	}
	
	public static int rRotate(int a, int b) {
		if (b < 0) return lRotate(a, -b);
		b %= 32;
		return (b == 0 ? a : (a>>>b) | (a << (32-b)));


	}
	
	public static int lRotate(int a, int b) {
		if (b < 0) return rRotate(a, -b);
		b %= 32;
		return (b == 0 ? a : (a << b) | (a >>> (32-b)));
	
	
	}
	
	public static void mind(int a) {
		for (int c = 31; c >= 0; c--)
			System.out.print(((a >>> c & 1) == 1) ? '1':'0');
			
		
		
		
	}

}

