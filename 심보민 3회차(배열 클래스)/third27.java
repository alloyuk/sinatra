package test2;

public class third27 {
	int id;
	String name;
	
	third27(){
		System.out.println("기본 생성자 Student()호출");
	}
	public static void main(String[] args) {
		System.out.println("****학생 주소록****");
		third27 cl = new third27();
		
		cl.al(20221004, "홍길순");
		cl.bl();
	}


	
	void al(int a1, String b2) {
		id = a1;
		name = b2;
	}
	
	void bl() {
		System.out.println("아이디 : "+id);
		System.out.println("이름 : " + name);
	}
	

}

