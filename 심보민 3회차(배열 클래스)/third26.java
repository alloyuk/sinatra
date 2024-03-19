package test2;

public class third26 {
	public void al() {
		System.out.println("No Parameter Method Called");
	
	}
	
	public int bl(int a, int b) {
		int c = a*b;
		return c;
	}
	
	public double cl(double a, double b) {
		double c = a*b;
		return c;
	}
	
	public double dl(int a, double b) {
		double c = a*b;
		return c;
		
	}

	
		public static void main(String[] args) {
			third26 f = new third26();
			System.out.println("가로:10, 세로:5 사각형의 넓이는"+f.bl(10,5));
			System.out.println("가로:2.5, 세로:4.5 사각형의 넓이는"+f.cl(2.5,4.5));
			
			

		}
	}