package test2;


import java.util.Scanner;

public class third19 {

	public static void main(String[] args) {
		Scanner oo = new Scanner(System.in);
		
		System.out.print("요소 수:");
		int a = oo.nextInt();
		int[] b = new int[a];
		
		
		for(int i=0; i< a; i++) {
			System.out.print("a["+i+"]=");
			b[i]=oo.nextInt();
			
		}
		
		System.out.print("찾을 숫자:");
		int c = oo.nextInt();
		
		int d;
		for(d=0; d<a; d++)
			if(b[d]==c)
				break;
		
		if(d<a)
			System.out.println("그 값은 a["+d+"]에 있습니다.");
		else
			System.out.println("해당 값이 존재하지 않습니다.");

	}

}