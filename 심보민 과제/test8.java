package asd;

import java.util.Scanner;

public class test8 {

	public static void main(String[] args) {
		Scanner oo = new Scanner(System.in);
		
		System.out.println("몇개의 *을 표시할까요?:");
		
		
		int a = 1;
		int b = oo.nextInt();
		
		while (a <= b) {
			System.out.print("*");
			a++;
			
		}
		
			System.out.println("");
		
		

	}

}