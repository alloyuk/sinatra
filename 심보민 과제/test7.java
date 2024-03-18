package asd;

import java.util.Scanner;

public class test7 {

	public static void main(String[] args) {
		Scanner oo = new Scanner(System.in);
	
		System.out.println("몇개의 *을 표시할까요?:");
		
		
		int a = 0;
		a = oo.nextInt();
		
		
		
		for (int i=0; i<a; i++) {
			{
				System.out.print("*");
			}
			System.out.print("");
		}
		

	}

}
