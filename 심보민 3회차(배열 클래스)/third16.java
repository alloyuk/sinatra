package test2;

import java.util.Scanner;
import java.util.Random;

public class third16 {

	public static void main(String[] args) {
		Scanner oo = new Scanner(System.in);
		Random pp = new Random();
		
		System.out.print("요소 수:");
		int a = oo.nextInt();
		int[] b = new int[a];
		
		
		for(int i=0; i< a; i++) {
			System.out.print("a["+i+"]=");
			b[i] = oo.nextInt();
		}
		
		for(int i=0; i<2*a; i++) {
			int c = pp.nextInt(a);
			int d = pp.nextInt(a);
			int e = b[c];
			b[c] = b[d];
			b[d] = e;
		}
		
		System.out.println("요소를 섞었습니다.");
		for(int i=0; i<a; i++)
			System.out.println("a["+i+"]="+b[i]);
	}
}