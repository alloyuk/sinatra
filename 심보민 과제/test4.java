package test;

import java.util.Scanner;

public class test4 {

	public static void main(String[] args) {
		Scanner oo = new Scanner(System.in);
	
		/*int a = oo.nextInt(); //이게 syst~앞에 있으면 작동을 하지 않는다.*/
		System.out.print("정수 A:"); int a = oo.nextInt(); 
		/*이게 올바른 예시*/
		System.out.print("정수 B:"); int b = oo.nextInt();
		
		if(a>b) {
			int t =a;
			a=b;
			b=t;
		}
		
		do {
			System.out.print(a + " ");
			a = a+1;
		} while (a <= b);
		System.out.println();

	}

}
