package test2;

import java.util.Scanner;

public class third21 {

	public static void main(String[] args) {
		Scanner oo = new Scanner(System.in);
		
		System.out.print("사람 수:");
		int a = oo.nextInt();
		int[] b = new int[a];
		
		for(int i=0; i<a; i++) {
			System.out.print("a["+i+"]=");
			b[i] = oo.nextInt();
		}
		System.out.print("a={");
		if(a>=2)
			for(int i=0; i<a-1; i++)
				System.out.print(b[i]+", ");
		if(a>=1)
			System.out.print(b[a-1]);
		System.out.print("}");
		
		
	}

}
