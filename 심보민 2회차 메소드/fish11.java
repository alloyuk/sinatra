package missss02;

import java.util.Scanner;

public class fish11 {

	public static void main(String[] args) {
		Scanner oo = new Scanner(System.in);
		
		System.out.println("정수x를 n비트 시프트합니다.");
		System.out.print("x:"); int a = oo.nextInt();
		System.out.print("n:"); int b = oo.nextInt();
		
		int c = a * num(b);
		int d = a / num(b);
		int e = a << b;
		int f = a >> b;
		
		System.out.printf("[a] x × (2의 %d승) = %d\n", b, c);
		System.out.printf("[b] x ÷ (2의 %d승) = %d\n", b, d);
		System.out.printf("[c] x << %d = %d\n", b, e);
		System.out.printf("[d] x >> %d = %d\n", b, f);
		System.out.println("[a]와 [c]의 값이 일치" +((c == e) ? " 합니다." : "하지 않습니다."));
		System.out.println("[b]와 [d]의 값이 일치" +d == f+"합니다.");



	}
	
	public static int num(int one) {
		int kl = 1;
		while (kl --> 0)
			kl *= 2;
		return kl;
		

	}
	
}



