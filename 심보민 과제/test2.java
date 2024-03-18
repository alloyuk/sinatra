package test;

import java.util.Scanner;
import java.util.Random;

public class test2 {

	public static void main(String[] args) {

  		Scanner pp = new Scanner(System.in);
  		Random  oo = new Random();
  		int a = 10 + oo.nextInt(90);
  		System.out.println("숫자 맞추기 게임 시작!");
  		System.out.println("10부터 99사이의 숫자를 맞추세요.");
  		int w;
  
  		
  		do {
  			System.out.print("어떤 숫자일까?:");
  			w = pp.nextInt();
  
  			if(w>a)
  				System.out.println("더 낮은 숫자입니다.");
  			else if(w<a)
  				System.out.println("더 큰 숫자입니다.");
  		} while (w != a);
  		System.out.println("정답입니다.");
	


	}
}

