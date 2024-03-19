package test2;

import java.util.Scanner;

public class third3 {

	public static void main(String[] args) {
		   Scanner oo = new Scanner(System.in);
		   
		   int[][] sl = new int [2][2];
		   String[] op = {"국어", "수학"};
		   
		   for(int i=0; i<2; i++) {
			   System.out.println("학생번호"+(i+1));
			   for(int j=0; j<op.length; j++) {
				   System.out.print(op[j]+"점수:");
				   sl[i][j] = oo.nextInt();
				   
			   }
		   }
		   for(int i=0; i<2; i++) {
			   int aa = 0;
			   for (int j=0; j<2; j++) {
				   aa +=sl[i][j]; 
			   }
			   double qw = aa/2.0;
				   System.out.println("학생번호"+(i+1)+"\n국어:"+sl[i][0]+"수학:"+sl[i][1]+"평균:"+qw);
			   }
		   }
		
		
		
	}
