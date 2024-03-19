package test2;

import java.util.Random;
import java.util.Scanner;

public class third13 {

	public static void main(String[] args) {
		Scanner oo = new Scanner(System.in);
		Random pp = new Random();
		
		System.out.println("요일명을 영어 소문자로 입력하시오.");
		
		
		String[] a = {"일", "월", "화", "수", "목", "금", "토"};
		String[] b = {"sunday","monday","tuesday","wednesday","thursday","friday","saturday"};

		int c;
		int d = -1;
		
		do {
			int e;
			do {
				e = pp.nextInt(7);
		}while (e == d);
		d=e;
		
		int g;
		do {
			System.out.print(a[e]+"요일:");
			String h = oo.next();
			
			if(h.equals(b[e])) {
				System.out.println("정답입니다.");
				break;
		}
		System.out.println("틀렸습니다.");
		do {
			System.out.print("어떡게 할까요? 1..재입력/0..정답 보기:");
			g=oo.nextInt();
		}while(g!=0&&g!=1);
		if(g==0)
			System.out.println(a[e]+"요일은\""+b[e]+"입니다.");
		}while(g==1);
		
		
	
		System.out.println("다시 한번? 1...Yes/0...No:");
		c = oo.nextInt();

	}while (c==1);
	}
}
