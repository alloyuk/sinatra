package asd;

import java.util.Scanner;

public class test15 {

	public static void main(String[] args) {
		Scanner oo = new Scanner(System.in);
		
		System.out.print("몇 cm부터:");
		int a = oo.nextInt();
		
		System.out.print("몇 cm까지:");
		int b = oo.nextInt();
		
		System.out.print("몇 cm 단위:");
		int c = oo.nextInt();
		
		System.out.println("신장 표준 체중");
		System.out.println("---------");
		
		for (int d = a; d <= b; d+= c)
			System.out.println(d + " " + 0.9 * (d-100));
		
		
	}

}


