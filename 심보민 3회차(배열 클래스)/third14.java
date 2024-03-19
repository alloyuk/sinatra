package test2;

import java.util.Random;
import java.util.Scanner;

public class third14 {

	public static void main(String[] args) {
		Scanner oo = new Scanner(System.in);
		Random pp = new Random();
		
		System.out.println("해당 월의 영어 단어를 입력하시오.");
		System.out.println("첫 글자는 대문자, 나머지는 소문자로 입력하세요.");
		
		
		String[] a = {"February", "March", "April", "May", "June", "July", "August", "September", "October","November", "December"};

		


		int c;
		int d = -1;
		
		do {
			int e;
			do {
				e = pp.nextInt(7);
		}while (e == d);
		d=e;
		
		while(true) {
			System.out.print((e+1)+"월:");
			String f = oo.next();
			
			if(f.equals(a[e])) break;
			System.out.println("틀렸습니다.");
		}
		System.out.println("정답입니다. 다시 한번? 1...Yes/0...No:");
		c=oo.nextInt();
		}while(c==1);
			
		
		
		
		
	}
}