package test;

import java.util.Scanner;
import java.util.Random;

public class test3 {

	public static void main(String[] args) {
  		Scanner pp = new Scanner(System.in);
  		Random  oo = new Random();
  		
  		int a = 10 + oo.nextInt(90);
  		
  		System.out.println("숫자 맞추기 게임 시작!");
  		System.out.println("10부터 99사이의 숫자를 맞추세요.");
  		
  		int w;
  		int limit = 5;
  		boolean og = true;
  		
  		do {
  			System.out.print("어떤 숫자일까?:");
  			w = pp.nextInt();
  			
  			if (w != a) {--limit;
  			String ms;
  			ms = (w>a)?"더 작은 숫자":"더 큰 숫자";
  			System.out.println(ms+"입니다.");
  			}else if(w == a) {
  				System.out.println("정답입니다.");
  				 og= false;
  			}
  			if(limit==0) {og=false; System.out.println("실패하셨습니다. 정답은"+a);}
  			}while(og);
  			
  	}
}
