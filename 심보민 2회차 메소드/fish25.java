package missss02;

import java.util.Scanner;

public class fish25 {

	public static void main(String[] args) {
		Scanner oo = new Scanner(System.in);
		
		System.out.print("요소 수:");
		int kl = oo.nextInt();
		int[]d = new int[kl];
		
		for(int u =0; u < kl; u++) {
			System.out.print("x["+u+"]:");
			d[u] = oo.nextInt();
		}
		
		System.out.print("삭제를 시작할 인덱스:");
		int e = oo.nextInt();
		System.out.print("삭제할 요소의 개수:");
		int f= oo.nextInt();
		int[] g = arrayRmv0fN(d, e, f);
		
		for (int u=0; u<g.length; u++)
			System.out.println("y["+u+"]="+g[u]);
		}
			
		
		
		





	
	public static int[] arrayRmv0fN(int[]a, int idx, int n) {
		if(n < 0 || idx < 0 || idx > a.length)
			return a.clone();
		else {
			if (idx + n > a.length)
				n = a.length - idx;
			int[]b = new int[a.length - 1];
			int u = 0;
			for(; u < idx; u++)
				b[u] = a[u];
			for(; u < a.length - n; u++)
				b[u]=a[u+n];
			return b;
			
		}



	}
	
}







