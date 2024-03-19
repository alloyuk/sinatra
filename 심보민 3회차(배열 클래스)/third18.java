package test2;

import java.util.Random;
import java.util.Scanner;

public class third18 {

	public static void main(String[] args) {
		Scanner oo = new Scanner(System.in);
		Random pp = new Random();
		
		System.out.print("요소 수:");
		int a = oo.nextInt();
		int[] b = new int[a];
		
		b[0] = 1+pp.nextInt(10);
		
		
		for(int i=1; i<a; i++) {
			do {
				b[i] = 1+pp.nextInt(10);
			}while(b[i]==b[i-1]);
		}
		
		for(int i=0; i< a; i++)
			System.out.println("a["+i+"]="+b[i]);

	}

}
