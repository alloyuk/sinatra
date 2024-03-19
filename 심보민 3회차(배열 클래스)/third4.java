package test2;


public class third4 {

	public static void main(String[] args) {
		
		int[][] m1 = {
				{2, 3, 4},
				{3, 2, 1}
				};
		int[][] m2 = {
				{1, 2, 3},
				{-4, -2, 1}
				};
		
		int[][] m3 = new int[m1.length][m1[0].length];
		
		for(int i=0; i<m1.length; i++) {
			for(int j=0; j<m1[i].length; j++) {
				m3[i][j] = m1[i][j] + m2[i][j];
			}
		}
		System.out.println("두 행렬의 합:");
		for(int i=0; i<m3.length; i++) {
			for(int j=0; j<m3[i].length;j++) {
				System.out.print(m3[i][j]+"\t");
			}
			System.out.println();
		}
			

		
		
	}
			
			
}
	
