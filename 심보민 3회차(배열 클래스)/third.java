package test2;

import java.util.Scanner;

public class third {

	public static void main(String[] args) {
		Scanner oo = new Scanner(System.in);

		
		String[] a = new String[3];
		
		int b = a.length;
		
		System.out.println("3개의 문자열을 입력하세요.");
		
		
		
		for (int i = 0; i < b; i++ ) {
			a[i] = oo.next();
		}
		
		System.out.println(a[0]+ " "+ a[1]+" " + a[2]);	

	}

}