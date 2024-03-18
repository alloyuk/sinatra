package asd;

import java.util.Scanner;

public class test24 {

	public static void main(String[] args) {
		Scanner oo = new Scanner(System.in);
		
		System.out.print("정수를 더합니다.\n몇 개를 더할까요?:");
		
		int a = oo.nextInt();
		int b = 0;
		int c;
		
		for (c =0; c<a; c++) {
			System.out.print("정수:");
			int d = oo.nextInt();
			if (b+d> 1000) {
				System.out.println("합계가 1,000을 넘었습니다.");
				System.out.println("마지막 값은 무시합니다.");
				break;
			}
			b+=d;
		}
		System.out.println("합계는 "+b+"입니다.");
		if(c!=0)
			System.out.println("평균은 "+b/c+"입니다.");
		
	
	}

}
