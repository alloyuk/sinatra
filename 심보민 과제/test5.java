package asd;

import java.util.Scanner;


public class test5 {

	public static void main(String[] args) {
		Scanner ed = new Scanner(System.in);
	
		
		System.out.println("카운트다운 합니다.");

		int a;
	
		
		do {
			System.out.print("양의 정숫값:");
			a= ed.nextInt();
			}while(a<1||a>999);{
				
	      for(int b=a; a>=0; a--) {
	            System.out.println( a + "");
	        
	    }
		System.out.println("x의 값이" +a+"이 됐습니다.");
		
		
		
	
		
			}

	}
		
		

}
		
