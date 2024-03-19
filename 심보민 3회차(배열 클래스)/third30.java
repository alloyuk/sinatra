package test2;

public class third30 {
	
	private String a;
	private String b;
	private int c;
	private int d;
	private int e;
	private double f;
	private double g;
	private double h;
	private double i;
	private double j;
	
	third30(String a, String b, int c, int d, int e, double f, double g, double h, double j){
		this.a = a; this.b = b; this.c = c; this.d = d; this.e = e; this.h = h;
		
		this.i = (i<=h)? i:h;
		this.j=j; f=g=0.0;
	}
	
	double al() {return f;}
	double bl() {return g;}
	double cl() {return i;}
	
	void jj() {
		System.out.println("이름:" + a);
		System.out.println("번호:" + b);
		System.out.println("전폭:" + c+"mm");
		System.out.println("전고:" + d+"mm");
		System.out.println("전장:" + e+"mm");
		System.out.println("탱크:" + h+"리터");
		System.out.println("연비:" + j+"km/리터");
	}
	
	boolean ii(double qq, double ww) {
		double ee = Math.sqrt(qq*qq+ww*ww);
		double tt = ee / j;
		
		if(tt > i)
			return false;
		else {
			i -=tt;
			f+=qq;
			g+=ww;
			return true;
		}
	}
	void uu(double nn) {
		if(nn>0) {
			i+=nn;
			if(i>h)
				i=h;
		}
		

	}
}
	

