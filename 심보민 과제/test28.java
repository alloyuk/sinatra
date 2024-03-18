package asd;

import java.util.Scanner;

public class test25 {

	public static void main(String[] args) {
		Scanner oo = new Scanner(System.in);
		
		System.out.print("정수를 더합니다.\n몇 개를 더할까요?:");
		
		int a = oo.nextInt();
		int b = 0;
		int c;
		int e = 0;
		
		for (c =0; c<a; c++) {
			System.out.print("정수:");
			int d = oo.nextInt();
			if (d<0) {
				System.out.println("음수는 더하지 않습니다.");
				continue;
			}
			b+=d;
			e++;
		}
		System.out.println("합계는 "+b+"입니다.");
		if(c!=0)
			System.out.println("평균은 "+b/e+"입니다.");
		
	
	}

}
