package missss02; //*선형탐색? https://adjh54.tistory.com/193

import java.util.Scanner;

public class fish17 {

	public static void main(String[] args) {
		Scanner oo = new Scanner(System.in);
	
		System.out.print("요소 수:");
		
		int c = oo.nextInt();
		int[] d = new int[c];
		for (int u = 0; u < c; u++) {
			System.out.print("x["+u+"]:");
			d[u] = oo.nextInt();
		}
		System.out.print("찾는 값:");
		int kl = oo.nextInt();
		
		int e = linearSearch(d, kl);
		int f = linearSearchR(d, kl);
		
		if(e == -1)
			System.out.println("해당 값은 존재하지 않습니다.");
		else if (e == f)
			System.out.println("해당 값은 x["+e+"]에 있습니다.");
		else {
			System.out.println("해당 값의 요소가 여러 개 존재합니다.");
			System.out.println("가장 앞에 위치한 값은 x["+e+"]에 있습니다.");
			System.out.println("가장 뒤에 위치한 값은 x["+f+"]에 있습니다.");
			
		}





	}
	
	public static int linearSearch(int[] a, int b) {
		for(int u = 0; u < a.length; u++)
			if (a[u] == b)
				return u;
		return -1;

	}

	public static int linearSearchR(int[] a, int b) {
		for (int u = a.length - 1; u>=0; u--)
			if (a[u] == b)
				return u;
		return -1;

	}
	
}



