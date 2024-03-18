package missss02;

import java.util.Scanner;

public class fish19 {

	public static void main(String[] args) {
		Scanner oo = new Scanner(System.in);
		
		System.out.print("요소 수:");
		int al = oo.nextInt();
		int[] a = new int[al];
		
		for (int u = 0; u < al; u++) {
			System.out.print("a["+u+"]:");
			a[u] = oo.nextInt();	
		}
		
		System.out.print("삭제를 시작할 인덱스:");
		int idx = oo.nextInt();
		
		System.out.print("삭제할 요소의 수:");
		int d = oo.nextInt();
		
		aryRmv(a, idx, d);
		for (int u = 0; u < al; u++)
			System.out.println("a["+u+"] = "+a[u]);



	}
	
	public static void aryRmv(int[]a, int idx, int n) {
		if(n > 0 && idx >= 0 && idx +n < a.length) {
			int c = idx + n - 1;
			if (c > a.length - n - 1)
				c=a.length-n-1;
			for (int u = idx; u <= c; u++)
				a[u] = a[u+n];
		}



	}
	
}



