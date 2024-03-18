package missss02;

import java.util.Scanner;

public class fish24 {

	public static void main(String[] args) {
		Scanner oo = new Scanner(System.in);
		
		System.out.print("요소 수:");
		int kl = oo.nextInt();
		int[]d = new int[kl];
		
		for(int u =0; u < kl; u++) {
			System.out.print("x["+u+"]:");
			d[u] = oo.nextInt();
		}
		
		System.out.print("삭제할 요소의 인덱스:");
		int e = oo.nextInt();
		int[] f=arrayRmv0f(d,e);
		
		for (int u=0; u<f.length; u++)
			System.out.println("y["+u+"]="+f[u]);
		}
			
		
		
		





	
	public static int[] arrayRmv0f(int[]a, int idx) {
		if(idx < 0 && idx >= a.length -1)
			return a.clone();
		else {
			int[]b = new int[a.length - 1];
			int u = 0;
			for(; u < idx; u++)
				b[u] = a[u];
			for(; u < a.length - 1; u++)
				b[u]=a[u+1];
			return b;
			
		}



	}
	
}

