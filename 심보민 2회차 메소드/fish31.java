package missss02;

import java.util.Scanner;

public class fish31 {

	public static void main(String[] args) {
		Scanner oo = new Scanner(System.in);
		
		System.out.print("int    형 정수 a의 값:"); int a = oo.nextInt();
		System.out.print("long   형 정수 b의 값:"); long b = oo.nextLong();
		System.out.print("float  형 실수 c의 값:"); float c = oo.nextFloat();
		System.out.print("double 형 실수 d의 값:"); double d = oo.nextDouble();
		System.out.println("a의 절댓값은" + absolute(a) + "입니다.");
		System.out.println("b의 절댓값은" + absolute(b) + "입니다.");
		System.out.println("c의 절댓값은" + absolute(c) + "입니다.");
		System.out.println("d의 절댓값은" + absolute(d) + "입니다.");
		
		
		
		
		
	}
	
	public static int absolute(int x) {
		return x >= 0? x : -x;
		
	}
	
	public static long absolute(long x) {
		return x >= 0? x : -x;
	}
	
	public static float absolute(float x) {
		return x >= 0? x : -x;
		
	}
	
	public static double absolute(double x) {
		return x >= 0? x : -x;
		

		


	}
	
}



