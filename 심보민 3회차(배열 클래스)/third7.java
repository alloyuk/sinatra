package test2;

import java.util.Scanner;
import java.util.Random;

public class third7 {

	public static void main(String[] args) {
		Scanner oo = new Scanner(System.in);
		Random pp = new Random();
		
		System.out.print("요소 수:");
		int a = oo.nextInt();
		int[] b = new int[a];
		
		for(int i=0; i<a; i++)
			b[i] = 1 + pp.nextInt(10);

		for(int i=10; i>=1; i--) {
			for(int j=0; j<a; j++)
				if(b[j] >= i)
					System.out.print("* ");
				else System.out.print(" ");
			System.out.println();
		}
		for(int i=0; i<2*a;i++)
			System.out.print("-");
		System.out.println();
		
		for(int i=0; i<a; i++)
			System.out.print(i%10+ " ");
		System.out.println();
	}

}
