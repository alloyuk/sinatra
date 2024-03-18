package asd;

import java.util.Scanner;

public class test26 {

	public static void main(String[] args) {
		Scanner oo = new Scanner(System.in);
		
		System.out.println("정수를 더합니다.");
		
		int a = 0;
		
		Outer:
			for (int b=1; b<=10; b++) {
				System.out.println(b+"그룹");
				
				for (int c=0; c<5; c++) {
					System.out.print("정수:");
					int d = oo.nextInt();
					if (d==99999)
						break Outer;
					
					else if (d==88888)
						continue Outer;
					a+=d;
				}
			}
			System.out.println("합계는 "+a+"입니다.");
		
		
	
	}

}

