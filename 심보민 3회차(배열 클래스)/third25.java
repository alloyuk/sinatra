package test2;

public class third25 {
		int d;
		
		public void bl(int a, int b) {
			d = a+b;
			System.out.println("두 수의 덧셈 : "+ d);
		}
		
		public void cl(int a, int b) {
			d = a-b;
			System.out.println("두 수의 뺄셈 : "+ d);
		}
}
	
	class oppp extends third25{
		void dl(int a, int b) {
			d = a*b;
			System.out.println("두 수의 곱셈 : " + d);
	
		}
		public static void main(String[] args) {
			int a = 20, b = 10;
			oppp f = new oppp();
			f.bl(a,b);
			f.cl(a,b);
			f.dl(a,b);
			
			}
		}
	

