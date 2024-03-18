package missss02;

import java.util.Scanner;

public class fish30 {

	public static void main(String[] args) {
		Scanner oo = new Scanner(System.in);
		
		System.out.print("x값:"); int d = oo.nextInt();
		System.out.print("y값:"); int e = oo.nextInt();
		System.out.print("z값:"); int f = oo.nextInt();
		System.out.print("배열 a의 요소 수:");
		int kl = oo.nextInt();
		int[]a = new int[kl];
		for (int u = 0; u < kl; u++) {
			System.out.print("a["+u+"]:");
			a[u] = oo.nextInt();
		}
		System.out.println("x, y의 최솟값은"+ min(d,e)+"입니다.");
		System.out.println("x, y, z의 최솟값은" + min(d,e,f)+"입니다.");
		System.out.println("배열 a의 최솟값은 "+ min(a)+"입니다.");




	}
	
	public static int min(int a, int b) {
		return a < b ? a : b;
		
	}
	
	public static int min(int a, int b, int c) {
		int al = a;
		if(b<al)al=b;
		if(c<al)al=c;
		return al;
		
	}
	
	public static int min(int[]a) {
		int al = a[0];
		for (int u = 1; u<a.length; u++)
			if (a[u] < al)
				al = a[u];
		return al;
		
	






	}
	
}



