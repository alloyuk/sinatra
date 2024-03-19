package test2;

public class third28 {
	
	third28(){
		System.out.println("기본 생성자 third() 호출");
	}
	
	third28(int a, int b){
		System.out.println("일반 생성자 third(int a, int b) 호출");
		System.out.println(a+"+"+b+"="+(a+b));
	}
	
	third28(double a, double b) {
		System.out.println("일반 생성자 third(double a, double b) 호출");
		System.out.println(a+"+"+b+"="+(a+b));
	}
	
	third28(int a, double b){
		System.out.println("일반 생성자 third(int a, double b) 호출");
		System.out.println(a+"+"+b+"="+(a+b));
	
	}

	public static void main(String[] args) {
		third28 al = new third28(1,2);
		third28 bl = new third28(2.4,6.2);
		third28 cl = new third28(3, 5.5);
		

	}

}
