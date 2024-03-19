package test2;

public class third29 {

	String aa;
	int bb;
	int cc;
	
	public static void main(String[] args) {
		third29 al = new third29();
		third29 bl = new third29();
		
		al.aa = "길동";
		al.bb = 170;
		al.cc = 60;
		
		bl.aa = "철수";
		bl.bb = 166;
		bl.cc = 72;
		
		System.out.println("이름:" + al.aa);
		System.out.println("신장:" + al.bb+"cm");
		System.out.println("체중:" + al.cc+"kg");
		System.out.println();
		
		System.out.println("이름:" + bl.aa);
		System.out.println("신장:" + bl.bb+"cm");
		System.out.println("체중:" + bl.cc+"kg");

	}

}
