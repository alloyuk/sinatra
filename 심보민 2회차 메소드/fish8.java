package missss02;

import java.util.Scanner;
import java.util.Random;

public class fish8 {

	public static void main(String[] args) {
		Scanner oo = new Scanner(System.in);
		
		System.out.println("난수를 생성합니다.");
		System.out.print("하한값:"); int c = oo.nextInt();
		System.out.print("상한값:"); int d = oo.nextInt();
		System.out.println("생성한 난수는"+ random(c, d) +"입니다.");
		




	}
	
	public static int random(int a, int b) { // 리턴에 대한 작동이 궁금하면 아래 코드에 맞는
		//int 외의 다른 타입의 변수형을 넣어볼것...void를 넣을시 에러가 뜸!
		if(b <= a)
		return a;
		else {
			Random rr = new Random();
			return a + rr.nextInt(b - a + 1);
		}
		

	}
	
}



