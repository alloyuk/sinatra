package missss02;

import java.util.Scanner;

public class fish18 {

	public static void main(String[] args) {
		Scanner oo = new Scanner(System.in);
		
		System.out.print("요소 수:");
		int al = oo.nextInt();
		int[] a = new int[al];
		
		for (int u = 0; u < al; u++) {
			System.out.print("a["+u+"]:");
			a[u] = oo.nextInt();	
		}
		
		System.out.print("삭제할 요소의 인덱스:");
		int idx = oo.nextInt();
		
		aryRmv(a, idx);
		for (int u = 0; u < al; u++)
			System.out.println("a["+u+"] = "+a[u]);



	}
	
	public static void aryRmv(int[]a, int idx) {
		if(idx >= 0 && idx < a.length) {
			for (int u = idx; u < a.length -1; u++)
				a[u] = a[u+1];
		}



	}
	
}



