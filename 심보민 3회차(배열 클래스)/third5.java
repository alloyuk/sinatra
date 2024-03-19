package test2;

import java.util.Scanner;

public class third5 {

	public static void main(String[] args) {
		Scanner oo = new Scanner(System.in);
		int a;
		double b = 0.0, c;
		double fasd[] = new double[5];
		
		System.out.println("dnum 배열의 길이 : "+fasd.length);
		System.out.print("초기화 하지 않은 dnum[]의 값: ");
		
		for(a=0; a <fasd.length;a++) 
			System.out.print(fasd[a]+" ");
			System.out.println();
		
	
		for (a=0;a<fasd.length; a++) {
			System.out.print("dnum["+a+"] 번째 데이터 입력:");
			fasd[a] = oo.nextDouble();
			
		}
		for(a=0; a<fasd.length; a++)
			b=b+fasd[a];
		System.out.println("배열의 합은 "+b+ "입니다.");
		c=b/fasd.length;
		System.out.println("배열 값의 평균은 "+c+ "입니다.");
		
	}
}
