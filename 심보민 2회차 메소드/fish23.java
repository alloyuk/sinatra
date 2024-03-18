package missss02;

import java.util.Scanner;

public class fish23 {

	public static void main(String[] args) {
		Scanner oo = new Scanner(System.in);
		
		System.out.print("요소 수:");
		int kl = oo.nextInt();
		int[]d = new int[kl];
		
		for(int u =0; u < kl; u++) {
			System.out.print("x["+u+"]:");
			d[u] = oo.nextInt();
		}
		
		System.out.print("탐색할 값:");
		int e = oo.nextInt();
		int[] f=arraySrchIdx(d,e);
		
		if(f.length==0)
			System.out.println("일치하는 요소가 없습니다.");
		else {
			System.out.println("일치하는 요소의 인덱스");
			for (int u=0; u<f.length; u++)
				System.out.println(f[u]);
		}
			
		
		
		




	}
	
	public static int[] arraySrchIdx(int[]a, int b) {
		int al = 0;
		for (int u = 0; u < a.length; u++)
			if(a[u] == b) al++;
		int[] c = new int[al--];
		for (int u = a.length - 1; al >=0; u--)
			if(a[u] == b)
				c[al--] = u;
		return c;



	}
	
}



