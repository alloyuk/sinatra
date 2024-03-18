package test;

import java.util.Scanner;
import java.util.Random;

public class test {

	public static void main(String[] args) {
		Scanner oo = new Scanner(System.in);
		
		int a;
		
		do {
			System.out.print("세 자리의 정숫값:");
			a = oo.nextInt();
			}while(a<100||a>999);
			System.out.println("입력한 값은 "+a+"입니다.");
			oo.close();
		}
	
	
		

	}


  				
  			
 

