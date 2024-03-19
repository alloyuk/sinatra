package test2;

import java.util.Scanner;
import java.util.Random;

public class third12 {

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
		
		while (true) {
			System.out.print(a[e]+"요일:");
			String f = oo.next();
			
			if (f.equals(b[e])) break;
			System.out.println("틀렸습니다.");
		}
		System.out.println("정답입니다. 다시 한번? 1...Yes/0...No:");
		c = oo.nextInt();

	}while (c==1);
	}
}
