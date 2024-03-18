package missss02;

import java.util.Scanner;

public class fish15 {

	public static void main(String[] args) {
		Scanner oo = new Scanner(System.in);
		
		System.out.print("요소 수:");
		int kl = oo.nextInt();
		int[] c = new int[kl];
		
		for(int d=0; d<kl; d++) {
			System.out.print("x["+d+"]:");
			c[d] = oo.nextInt();
		}
		
		System.out.println("모든 요소의 합은 "+sum0f(c)+"입니다.");





		
	}

	public static int sum0f(int[] a) {
		int ai = 0;
		for (int b=0; b<a.length; b++)
			ai += a[b];
		return ai;

	}
	
}



