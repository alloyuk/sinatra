package test2;

import java.util.Scanner;
import java.util.Random;

public class third17 {

	public static void main(String[] args) {
		Scanner oo = new Scanner(System.in);
		Random pp = new Random();
		
		System.out.print("요소 수:");
		int a = oo.nextInt();
		int[] b = new int[a];
		
		for(int i=0; i<a; i++)
			b[i] = 1+pp.nextInt(10);
		
		for(int i=0; i< a; i++)
			System.out.println("a["+i+"]="+b[i]);

	}

}
