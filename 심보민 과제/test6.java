package asd;

import java.util.Scanner;

public class test6 {

	public static void main(String[] args) {
		Scanner oo = new Scanner(System.in);
		
		System.out.println("카운트다운 합니다.");
		int a;
		
		
		do {
			System.out.println("양의 정숫값:");
			a = oo.nextInt();
			}while(a<1||a>999);{
				
	      while(--a!=0 ) {// --x일시 음수까지 가지 않음, x--일시 음수를 끝으로 마침//
	            System.out.println( a + "");
	        
	    }
		System.out.println("x의 값이" +a+"이 됐습니다.");
		
		
		
	
		
			}

	}
		
		

}