package missss02;

import java.util.Scanner;

public class fish21 {

	public static void main(String[] args) {
		Scanner oo = new Scanner(System.in);
		
		System.out.print("배열 a의 요소 수:");
		int al = oo.nextInt();	
		int[] a = new int[al];
		
		for (int u = 0; u < al; u++) {
			System.out.print("a["+u+"]:");
			a[u] = oo.nextInt();	
		}
		
		System.out.print("배열 b의 요소 수:");
		int idx = oo.nextInt();
		
		int[]b=new int[idx];
		for(int u=0; u<idx;u++) {
			System.out.print("b["+u+"]:");
			b[u] = oo.nextInt();
		}
		
		
		aryExchng(a, b);
		System.out.println("배열 a와 b의 전체 요소를 교환했습니다.");
		for (int u = 0; u < al; u++)
			System.out.println("a["+u+"] = "+a[u]);
		for (int u = 0; u < al; u++)
			System.out.println("b["+u+"]= "+b[u]);



	}
	
	public static void aryExchng(int[]a, int []b) {
		int c = a.length < b.length ? a.length : b.length;
			for (int u = 0; u < c; u++) {
				int d = a[u]; a[u]=b[u];b[u]=d;
			}
				
			
		
	}
}
	


