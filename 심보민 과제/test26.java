package asd;

import java.util.Scanner;

public class test23 {

	public static void main(String[] args) {
		Scanner oo = new Scanner(System.in);
		
		System.out.print("정수를 더합니다.\n몇 개를 더할까요?:");
		
		int a = oo.nextInt();
		int b = 0;
		int c;
		
		for (c =0; c<a; c++) {
			System.out.print("정수(0으로 종료):");
			int d = oo.nextInt();
			if (d==0) break;
			b+=d;
		}
		System.out.println("합계는 "+b+"입니다.");
		if(c!=0)
			System.out.println("평균은 "+b/c+"입니다.");
		
	
	}

}

