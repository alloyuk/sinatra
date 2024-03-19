package test2;

import java.util.Scanner;

public class third20 {

	public static void main(String[] args) {
		Scanner oo = new Scanner(System.in);
		
		System.out.print("사람 수:");
		int a = oo.nextInt();
		int[] b = new int[a];
		
		System.out.println("점수를 입력하세요.");
		int c = 0;
		for(int i=0; i<a; i++) {
			System.out.print((i+1)+"번의 점수:");
			b[i] = oo.nextInt();
			c+=b[i];
		}
		
		int d = b[0];
		int e = b[0];
		for(int i=1; i<a; i++) {
			if(b[i] > d) d=b[i];
			if(b[i] < e) e=b[i];
		}
		System.out.println("합계는 "+c+"점입니다.");
		System.out.println("평균은 "+(double)c/a+"점입니다.");	
		System.out.println("최고점은 "+d+"점입니다.");
		System.out.println("최저점은 "+e+"점입니다.");
	}

}
