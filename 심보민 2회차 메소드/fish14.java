package missss02;

import java.util.Scanner;

public class fish14 {

	public static void main(String[] args) {
		Scanner oo = new Scanner(System.in);
		
		System.out.println("정수x의 pos번째 비트부터 n개 비트를 변경합니다.");
		System.out.print("x:"); int a = oo.nextInt();
		System.out.print("pos:"); int b = oo.nextInt();
		System.out.println("n:)"); int c = oo.nextInt();
		System.out.print("x     = "); mind(a);
		System.out.print("\nset(x, pos, n)   ="); mind(set(a, b, c));
		System.out.print("\nreset(x, pos, n)    ="); mind(reset(a, b, c));
		System.out.print("\ninverse(x, pos, n)    ="); mind(inverse(a, b, c));





	}
	
	public static int set(int a, int b, int c) {
		return a |(~(~0<<c) << b);


	}



	public static int reset(int a, int b, int c) {
		return a&~(~(0<<c) << b);
	
	}
	
	public static int inverse(int a, int b, int c) {
		return a^(~(~0<<c)<< b);
	
	}
	
	public static void mind(int a) {
		for (int o=31; o>=0; o--)
			System.out.print(((a>>>o & 1)==1)?'1':'0');
		
	}
}



