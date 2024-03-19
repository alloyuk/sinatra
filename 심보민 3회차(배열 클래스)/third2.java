package test2;

public class third2 {

	public static void main(String[] args) {
		
		double[] a = new double [] {90, 70.5, 80, 79, 82.5, 50, 70, 90.2
				, 89.5, 89.7};
		
		float b = 0, c=0;
		for(int i =0; i < a.length; i++)
		{ b+=a[i];
		}
		c=b/(a.length);
		System.out.println("합계: "+ b);
		System.out.println("평균: "+c);

	}

}
