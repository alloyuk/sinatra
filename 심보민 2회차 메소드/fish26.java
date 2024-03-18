package missss02;

import java.util.Scanner;

public class fish26 {

	public static void main(String[] args) {
		Scanner oo = new Scanner(System.in);
		
		System.out.print("요소 수:");
		int kl = oo.nextInt();
		int[]d = new int[kl];
		
		for(int u =0; u < kl; u++) {
			System.out.print("x["+u+"]:");
			d[u] = oo.nextInt();
		}
		
		System.out.print("삽입할 인덱스:");
		int e = oo.nextInt();
		System.out.print("삽입할 인덱스");
		int f = oo.nextInt();
		int[] g=arrayIns0f(d,e,f);
		
		for (int u=0; u<g.length; u++)
			System.out.println("y["+u+"]="+g[u]);
		}
			
		
		
		





	
	public static int[] arrayIns0f(int[]a, int idx, int x) {
		if(idx < 0 && idx >= a.length)
			return a.clone();
		else {
			int[]b = new int[a.length + 1];
			int u = 0;
			for(; u < idx; u++)
				b[u] = a[u];
			for(; u < a.length; u++)
				b[u+1] = a[u];
			b[idx] = x;
			return b;
			
		}



	}
	
}



