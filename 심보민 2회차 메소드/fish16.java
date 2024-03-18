package missss02;

import java.util.Scanner;

public class fish16 {

	public static void main(String[] args) {
		Scanner oo = new Scanner(System.in);
		
		System.out.print("사람 수는:");
		
		int kl = oo.nextInt();
		int[]cm = new int[kl];
		int[]kg = new int[kl];
		
		System.out.println(kl+"명의 신장과 체중을 입력하자.");
		
		for(int u=0; u<kl; u++) {
			System.out.print((u+1)+"번의 신장:");
			cm[u]=oo.nextInt();
			System.out.print((u+1)+"번의 체중:");
			kg[u]=oo.nextInt();
		}
		
		System.out.println("가장 키가 작은 사람의 신장:"+min0f(cm)+"cm");
		System.out.println("가장 마른 사람의 체중:"+min0f(kg)+"kg");




	}
	
	public static int min0f(int[]a) {
		int al = a[0];
		for (int u=1; u<a.length; u++)
			if(a[u] < al)
				al=a[u];
		return al;




	}
	
}



