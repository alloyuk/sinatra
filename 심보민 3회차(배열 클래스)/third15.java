package test2;

import java.util.Scanner;

public class third15 {

	public static void main(String[] args) {
		Scanner oo = new Scanner(System.in);
		
		System.out.print("요소 수:");
		int a = oo.nextInt();
		int[] b = new int[a];
		int[] c = new int[a];
		
		for(int i=0; i< a; i++) {
			System.out.print("a["+i+"]=");
			b[i] = oo.nextInt();
		}
		
		for(int i=0; i<a; i++) {
			c[i]=b[a-i-1];
		}
		System.out.println("a의 모든 요소를 역순으로 복사했습니다.");
		
		for(int i=0; i<a; i++)
			System.out.println("b["+i+"]="+c[i]);
	}

}
