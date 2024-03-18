package missss02;

import java.util.Scanner;

public class fish22 {

	public static void main(String[] args) {
		Scanner oo = new Scanner(System.in);
		
		System.out.print("요소 수:");
		int al = oo.nextInt();
		
		int[] d = new int[al];
		for (int u = 0; u < al; u++) {
			System.out.print("x["+u+"]:");
			d[u] = oo.nextInt();
		}
		
		int[] e=arrayClone(d);
		System.out.println("배열 x를 복사해서 배열 y를 생성했습니다.");
		for (int u =0; u < al; u++)
			System.out.println("y["+u+"]="+e[u]);




	}
	
	public static int[] arrayClone (int[]a) {
		int[] b = new int[a.length];
		for(int u=0; u< b.length; u++)
			b[u] = a[u];
		return b;



	}
	
}



