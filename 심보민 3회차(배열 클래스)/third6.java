package test2;

public class third6 {

	public static void main(String[] args) {
		
		int [][][] third = new int [3][4][5];
		int a, b, c, d =11;
		for (a=0; a<third.length; a++)
			for(b=0; b<third[a].length; b++)
				for(c=0; c<third[a][b].length; c++) {
					third[a][b][c] = d;
					d++;
				}
		for(a=0; a<third.length; a++) {
			System.out.println((a+1)+"번째 2차원 배열");
			for(b=0; b<third[a].length; b++) {
				for(int e : third[a][b])
					System.out.print(e+" ");
				System.out.println();
			}
			System.out.println();
		}
		

	}

}
