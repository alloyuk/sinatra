package missss02;

import java.util.Scanner;

public class fish20 {

	public static void main(String[] args) {
		Scanner oo = new Scanner(System.in);
		
		System.out.print("요소 수:");
		int al = oo.nextInt();	
		int[] a = new int[al];
		
		for (int u = 0; u < al; u++) {
			System.out.print("a["+u+"]:");
			a[u] = oo.nextInt();	
		}
		
		System.out.print("삽입할 요소의 인덱스:");
		int idx = oo.nextInt();
		
		System.out.print("삽입할 값:");
		int f = oo.nextInt();
		
		aryIns(a, idx, f);
		for (int u = 0; u < al; u++)
			System.out.println("a["+u+"] = "+a[u]);



	}
	
	public static void aryIns(int[]a, int idx, int x) {
		if(idx >= 0 && idx < a.length) {
			for (int u = a.length -1; u > idx; u--)
				a[u] = a[u-1];
			a[idx] = x;
		}
		
	}
}









