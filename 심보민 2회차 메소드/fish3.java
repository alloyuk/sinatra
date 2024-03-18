package missss02;

import java.util.Scanner;

public class fish3 {

	public static void main(String[] args) {
		Scanner oo = new Scanner(System.in);
		
		System.out.print("정수 a:"); int a = oo.nextInt();
		System.out.print("정수 b:"); int b = oo.nextInt();
		System.out.print("정수 c:"); int c = oo.nextInt();
		System.out.println("중간값은 "+ ban(a, b, c) +"입니다.");
		
	
	}
	



	public static int ban(int a, int b, int c) {
		int ban = a;
		if (b > ban) ban = b;
		if (c < ban) ban = c;
		
		return  ban;
		
		
	




	}
	
}

