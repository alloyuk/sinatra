package missss02;

import java.util.Scanner;

public class fish1 {

public static void main(String[] args) {
	Scanner oo = new Scanner(System.in);
	
	System.out.print("정수 x:");
		
	int a = oo.nextInt();
			
	int b = singf1(a);
	
	System.out.println("sing0f(x)는 "+b+"입니다.");
	
	oo.close();
	

}

public static int singf1(int f) {
	if( f > 0)
		return 1;
	else if (f <  0)
		return -1;
	else
		return 0;
}



public int singf2(int d) {
	int kk = 0;
	
	if( d > 0)
		kk= 1;
	else if (d < 0)
		kk= -1;
	return kk;

	
}









	
}



