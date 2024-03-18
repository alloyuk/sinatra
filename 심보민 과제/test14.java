package asd;

import java.util.Scanner;

public class test14 {

	public static void main(String[] args) {
		Scanner oo = new Scanner(System.in);
		
		System.out.println("1부터 n까지의 합을 구합니다.");
		
		int q;
		
		do {
			System.out.print("n의 값:");
			q = oo.nextInt();
			
		}while (q <= 0);
		int u = 0;
	
		for (int r = 1; r < q; r++) {
			System.out.print(r+" + ");
			u += r;
		}
			System.out.print(q + " = ");
			u += q;
			System.out.println(u);
	
	}

}


