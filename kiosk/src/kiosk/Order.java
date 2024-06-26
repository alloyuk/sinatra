package kiosk;

import java.util.ArrayList;
import java.util.List;

public class Order {
	
	private List<ThirdMenu> basket; // ThirdMenu 리스트 형식으로 사용할 basket 생성
	
	private int orderNumber; // 주문대기번호
	
	public Order() {
		basket = new ArrayList<>(); // 장바구니 어레이리스트 생성
		orderNumber = 1; // 초기 주문넘버
	}
	
	public List<ThirdMenu> getbasket() { return basket; }
	
	public int getOrderNumber() { return orderNumber; }
	// 현재 orderNumber를 리턴해줌
	
	public void setOrderNumber(int orderNumber) { this.orderNumber = orderNumber; }
	// OrderNumber을 넘겨받아 Order()에서 선언한 orderNumber에 넘겨받은 orderNumber으로 초기화
	
	public void addbasket(ThirdMenu menu) { basket.add(menu); }
	// 장바구니에 들어온 ThirdMenu 형식의 menu를 받아서 안의 정보를 basket에 추가해줌
	
	public void Clearbasket() { basket.clear(); }
	// 장바구니 초기화
	
	public double totalPrice() { // 가격계산
		double total = 0.0; // 처음 total의 가격 0원으로 시작
		for (ThirdMenu menu : basket) { // basket안에 들어있는 값이 ThirdMenu형이니 똑같이 menu을 만들어서 basket값을 menu에 넣어줌.
			total += Double.parseDouble(menu.getPrice().substring( 2));
			// basket안에 있는 이름, 가격, 설명 중 가격만 추출한 뒤 total에 차례대로 더해줌
			// Double.parseDOuble()은 문자열을 double형태로 변환하는 역할을 함
			// 그 안에 ThirdMenu형식으로 만들어진 menu에 basket안에 있던 메뉴들이 차례대로 대입
			// 대입될때마다 menu.getPrice()를 사용하여 가격을 추출해옴
			// 추출해오게되면 현재 W 6.5 이런식으로 추가해두었으니 그대로 W 6.5를 가져오게 하였다고 함
			// 그래서 substring()을 사용해서 문자열의 일부분을 가져올 수 있도록 제작
			// W 6.9 라고 저장되어있을테니 substring(2)를 입력해서 2번째 문자열부터 null을 만나기전까지 문자열을 추출
			// 0번째 - W    1번째 - 공백   2번째 - 6    3번째 -.   4번째 - 9
			// 따라서 6.9만 가져와서 double형으로 변경 뒤 total에 더해준다.
		}
		
		return total; // 처리된 total값 리턴
	}

}
