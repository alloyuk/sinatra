package kiosk;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class SubMenu {
	
	List<ThirdMenu> mainMenu = new ArrayList<>();
	List<ThirdMenu> sideMenu = new ArrayList<>();
	List<ThirdMenu> drinkMenu = new ArrayList<>();

	
	
	Order order = new Order();
	
	Scanner oo = new Scanner(System.in);
	

	public SubMenu() { //  각각의 리스트에 이름, 가격, 설명 추가 라인 테스트중
		mainMenu.add(new ThirdMenu( " 바삭 치킨마요덮밥", "W 7.9", "바삭한 가라아게에 부드러운 스크램블과 마요네즈의 환상조화"));
		mainMenu.add(new ThirdMenu( " 辛화락 철판볶음밥", "W 8.5", "감칠맛 가득 중독성 강한 고깃집 스타일"));
		mainMenu.add(new ThirdMenu( " 탱글 새우마요덮밥", "W 7.9", "탱글한 새우튀김에 부드러운 스크램블과 마요네즈의 환상조화"));
		mainMenu.add(new ThirdMenu( " 쫄깃야들 우삼겹덮밥 ", "W 9.5", "한입 크기의 쫄깃한 우삼겹을 올린 덮밥"));
		mainMenu.add(new ThirdMenu( " 야들야들 대패덮밥", "W 9.9", "한입 크기의 야들한 대패삼겹을 올린 덮밥"));
		mainMenu.add(new ThirdMenu( " 육즙가득 항정살덮밥", "W 10.9", "덮덮밥의 대표메뉴 육즙가득 항정살 덮밥"));
		mainMenu.add(new ThirdMenu( " 고소고소 곱창덮밥  ", "W 10.9", "통통한 곱창을 짚불에 훈연하여 구운 덮밥"));
		
		sideMenu.add(new ThirdMenu( " 가래떡꼬치 4pc", "W 2.0", "남녀노소 좋아하는 추억의 가래떡꼬치"));
		sideMenu.add(new ThirdMenu( " 맛감자", "W 2.5", "감자 튀김 중 가장 맛있는 테이터펍스"));
		sideMenu.add(new ThirdMenu( " 밀크모짜 치즈볼 3pc", "W 3.0", "부드러운 모짜렐라가 가득한 치즈볼"));
		sideMenu.add(new ThirdMenu( " 탱글한 새우튀김", "W 3.5", "바삭고소하게 튀긴 새우튀김"));
		sideMenu.add(new ThirdMenu( " 고기듬뿍 교자만두 4pc", "W 3.5", "국내산 돼지고기와 야채로 속을 꽉 채운 만두"));
		
		drinkMenu.add(new ThirdMenu( " 콜라 캔", "W 1.0", ""));
		drinkMenu.add(new ThirdMenu( " 사이다 캔", "W 1,0", ""));
		drinkMenu.add(new ThirdMenu( " 콜라 中 size", "W 1.5", ""));
		drinkMenu.add(new ThirdMenu( " 사이다 中 size", "W 1.5", ""));
		drinkMenu.add(new ThirdMenu( " 코카콜라제로", "W 2.0", ""));
		
	}
		
		public void showSubMenu() {
			System.out.println("\"덮덮밥에 오신걸 환영합니다.\"");
			System.out.println("아래 메뉴판을 보시고 메뉴 목록을 선택 해주세요.");
			System.out.println();
			System.out.println("< Menu >");
			System.out.println("1. Main      | 덮덮밥의 메인메뉴, 주 식사 메뉴들의 모음!");
			System.out.println("2. Side      | 한끼식사론 모자라 간식거리");
		    System.out.println("3. Drink      | 함께 마실 음료");
	/*		System.out.println("4. 쫄깃야들 우삼겹덮밥     | 한입 크기의 쫄깃한 우삼겹을 올린 덮밥");
			System.out.println("5. 야들야들 대패덮밥      | 한입 크기의 야들한 대패삼겹을 올린 덮밥");
			System.out.println("6. 육즙가득 항정살덮밥     | 덮덮밥의 대표메뉴 육즙가득 항정ㄴ살 덮밥");
			System.out.println("7. 고소고소 곱창덮밥      | 통통한 곱창을 짚불에 훈연하여 구운 덮밥");   */
			System.out.println();
			System.out.println("[ Order Menu ]");
			System.out.println("4. Order       | 장바구니를 확인 후 주문합니다.");
			System.out.println("5. Cancel      | 진행중인 주문을 취소합니다.");
			
			// 이하의 내용은 진행에 따라 추가하든 말든
			
			//....
			System.out.print("메뉴선택 : ");
			int choice = oo.nextInt();
			oo.nextLine(); // 개행문자 제거하기 위함, 개행문자 모르면 검색 go
			
			// 아래 메뉴 명령어들
			
			switch(choice) {
				case 1:
					showMainMenu(); // 메인 메뉴판 출력
					break;
				case 2:
					showSideMenu(); // 사이드 메뉴 출력
					break;
				case 3:
					showDrinkMenu(); // 음료 메뉴 출력
					break;
				case 4:
					showOrderMenu(); // 장바구니 출력
					break;
				case 5:
					OrderCancel(); // 주문취소 출력
					break;
				default:
					System.out.println("1~5번까지의 숫자만 입력가능합니다."); // 1~5번 제외 그외 숫자가 들어옴? = 출력
					break;
			}
		}
		
		public void showMainMenu() { // 메인관련
			System.out.println();
			System.out.println("[ Main Menu ]");
			
			for(int i = 0; i < mainMenu.size(); i++) { // 메인메뉴 리스트에 있는 사이즈만큼 반복 (사이즈는 3이니 i=0, 1.2)
				ThirdMenu menu = mainMenu.get(i);   // 메인메뉴 리스트에서 get()을 사용하여 menu안에 있는 메뉴정보를 대입 한다고 함
				System.out.println((i + 1) + ". " + menu.getName() + " | " + menu.getPrice() + " | " + menu.getDescription());
			} // (i + 1)을 사용한 이유는 i는 배열의 첫번째값부터 출력하기위해 0을 사용하였는데, 번호는 1번부터
			//출력해야하니 i+1을 해줘서 1,2,3이 출력되게 만들어줬다고 함. 근데 난 그렇게 안함 그래서 어찌변할지 ㅁㄹ
			
			System.out.print("상품선택 : ");
			int chooiseMain = oo.nextInt(); // 3개의 메뉴 중 추가할 메뉴 선택
			oo.nextLine(); // 개행문자 제거
			
			int mainInfo = chooiseMain - 1; // 사용자가 선택한 숫자와 리스트의 번호를 맞추기 위해 -1을 해줬다는데, 위의 i =0과 연관이 있나보다

			ThirdMenu selectedMain = mainMenu.get(mainInfo); // Third형 객체를 만들어서 mainInfo번째 정보를 대입
			System.out.println("\n" + "\"" + selectedMain.getName() + "     | " + selectedMain.getPrice()
			 + " | " + selectedMain.getDescription() + "\""); // 정보를 사용자에게 출력
			System.out.println("위 메뉴를 장바구니에 추가하시겠습니까?");
			System.out.println("1. 확인     2. 취소");
			
			int check = oo.nextInt();
			oo.nextLine();
			
			if (check == 1) {
				order.addbasket(selectedMain);
				System.out.println(selectedMain.getName() + " 가 장바구니에 추가되었습니다.");
				System.out.println();
			} else if (check == 2) {
				System.out.println("장바구니 추가가 취소되었습니다.");
			} else System.out.println("숫자를 잘못 입력하였습니다.");
			
			showSubMenu(); // 모든 기능이 종료되면 SubMenu를 호출해줌
			
			}
		
		public void showSideMenu() { // 메인관련
			System.out.println();
			System.out.println("[ Main Menu ]");
			
			for(int i = 0; i < mainMenu.size(); i++) { // 메인메뉴 리스트에 있는 사이즈만큼 반복 (사이즈는 3이니 i=0, 1.2)
				ThirdMenu menu = mainMenu.get(i);   // 메인메뉴 리스트에서 get()을 사용하여 menu안에 있는 메뉴정보를 대입 한다고 함
				System.out.println((i + 1) + ". " + menu.getName() + " | " + menu.getPrice() + " | " + menu.getDescription());
			} // (i + 1)을 사용한 이유는 i는 배열의 첫번째값부터 출력하기위해 0을 사용하였는데, 번호는 1번부터
			//출력해야하니 i+1을 해줘서 1,2,3이 출력되게 만들어줬다고 함. 근데 난 그렇게 안함 그래서 어찌변할지 ㅁㄹ
			
			System.out.print("상품선택 : ");
			int chooiseMain = oo.nextInt(); // 3개의 메뉴 중 추가할 메뉴 선택
			oo.nextLine(); // 개행문자 제거
			
			int mainInfo = chooiseMain - 1; // 사용자가 선택한 숫자와 리스트의 번호를 맞추기 위해 -1을 해줬다는데, 위의 i =0과 연관이 있나보다

			ThirdMenu selectedMain = mainMenu.get(mainInfo); // Third형 객체를 만들어서 mainInfo번째 정보를 대입
			System.out.println("\n" + "\"" + selectedMain.getName() + "     | " + selectedMain.getPrice()
			 + " | " + selectedMain.getDescription() + "\""); // 정보를 사용자에게 출력
			System.out.println("위 메뉴를 장바구니에 추가하시겠습니까?");
			System.out.println("1. 확인     2. 취소");
			
			int check = oo.nextInt();
			oo.nextLine();
			
			if (check == 1) {
				order.addbasket(selectedMain);
				System.out.println(selectedMain.getName() + " 가 장바구니에 추가되었습니다.");
				System.out.println();
			} else if (check == 2) {
				System.out.println("장바구니 추가가 취소되었습니다.");
			} else System.out.println("숫자를 잘못 입력하였습니다.");
			
			showSubMenu(); // 모든 기능이 종료되면 SubMenu를 호출해줌
			
			}
		
		public void showDrinkMenu() { // 메인관련
			System.out.println();
			System.out.println("[ Main Menu ]");
			
			for(int i = 0; i < mainMenu.size(); i++) { // 메인메뉴 리스트에 있는 사이즈만큼 반복 (사이즈는 3이니 i=0, 1.2)
				ThirdMenu menu = mainMenu.get(i);   // 메인메뉴 리스트에서 get()을 사용하여 menu안에 있는 메뉴정보를 대입 한다고 함
				System.out.println((i + 1) + ". " + menu.getName() + " | " + menu.getPrice() + " | " + menu.getDescription());
			} // (i + 1)을 사용한 이유는 i는 배열의 첫번째값부터 출력하기위해 0을 사용하였는데, 번호는 1번부터
			//출력해야하니 i+1을 해줘서 1,2,3이 출력되게 만들어줬다고 함. 근데 난 그렇게 안함 그래서 어찌변할지 ㅁㄹ
			
			System.out.print("상품선택 : ");
			int chooiseMain = oo.nextInt(); // 3개의 메뉴 중 추가할 메뉴 선택
			oo.nextLine(); // 개행문자 제거
			
			int mainInfo = chooiseMain - 1; // 사용자가 선택한 숫자와 리스트의 번호를 맞추기 위해 -1을 해줬다는데, 위의 i =0과 연관이 있나보다

			ThirdMenu selectedMain = mainMenu.get(mainInfo); // Third형 객체를 만들어서 mainInfo번째 정보를 대입
			System.out.println("\n" + "\"" + selectedMain.getName() + "     | " + selectedMain.getPrice()
			 + " | " + selectedMain.getDescription() + "\""); // 정보를 사용자에게 출력
			System.out.println("위 메뉴를 장바구니에 추가하시겠습니까?");
			System.out.println("1. 확인     2. 취소");
			
			int check = oo.nextInt();
			oo.nextLine();
			
			if (check == 1) {
				order.addbasket(selectedMain);
				System.out.println(selectedMain.getName() + " 가 장바구니에 추가되었습니다.");
				System.out.println();
			} else if (check == 2) {
				System.out.println("장바구니 추가가 취소되었습니다.");
			} else System.out.println("숫자를 잘못 입력하였습니다.");
			
			showSubMenu(); // 모든 기능이 종료되면 SubMenu를 호출해줌
			
			}
		
		public void showOrderMenu() { // 주문화면(장바구니)
			System.out.println("아래와 같이 주문 하시겠습니까?");
			System.out.println();
			System.out.println("[ Orders ]");
			
			List<ThirdMenu> basket = order.getbasket();
			// ThirdMenu 리스트형식 basket을 생성. order안에있는 getbasket()을 통해서 basket안의 값을 리턴받아서 대입.
			
			for (int i = 0; i < basket.size(); i++) { // 넘겨받은 basket의 길이만큼 반복해서 장바구니안의 메뉴를 출력
				ThirdMenu menu = basket.get(i); // Third형식의 menu를 만들어서 basket안에 들어있는 0번째 값부터 가져옴
				System.out.println(menu.getName() + "   | " + menu.getPrice() + " | " + menu.getDescription());
			}
			System.out.println();
			System.out.println("[ Total ]");
			System.out.println("W " + order.totalPrice()); // order클래스안의 totalPrice()을 실행시켜 총값을 출력
			
			System.out.println("\n1. 주문     2. 메뉴판");
			int checkNumber = oo.nextInt(); // 주문할지 메뉴판으로 돌아갈지 선택.
			oo.nextLine(); // 개행문자 제거
			
			if (checkNumber == 1) {
				OrderComplete(); // 1. 주문을 선택하면 OrderComplete()메서드를 불러와서 주문이 완료되었음을 알리고 대기번호를 부여 후 메뉴판으로 돌아감
				
			} else if (checkNumber == 2) {
				System.out.println("메뉴판으로 돌아갑니다."); // 2. 메뉴판을 선택하면 메뉴판으로 돌아간다고 함.
				showSubMenu();
			}
		} 
		
		public void OrderComplete() { // 주문완료, 대기번호 부여
			int orderNumber = order.getOrderNumber();
			// order클래스의 getOrderNumber()을 호출해 order()안에 있는 orderNumber의 숫자를 받아서 orderNumber 변수에 초기화
			System.out.println("주문이 완료되었습니다!");
			System.out.println();
			System.out.println("대기번호는 [ " + orderNumber + " ] 번 입니다."); // 대기번호 출력
			System.out.println("(3초 후 메뉴판으로 돌아갑니다.)");
			System.out.println();
			
			order.Clearbasket(); // 주문이 완료되었으니 카트를 초기화 시켜주는 명령어라고 함
			order.setOrderNumber(orderNumber + 1);
			// 대기번호를 사용하였으니 setOrderNumber 메서드안에 orderNumber +1 을 넘겨주어서
			// order클래스안의 orderNumber를 1증가시켜주는 것
			
			try { // 3초간 지연시키려고 Thread의 .sleep 사용 또한 예외처리를 하지않으면 사용불가능 하기 때문에 try-catch문 사용
				Thread.sleep( 3000); // millis단위이기 때문에 1000millis = 1초, 고로 3초간 재움
			} catch (InterruptedException e) { // InterruptedException 예외상항 발생시
				System.out.println(e); // 경고문 e를 출력
			}
			
			showSubMenu(); // 예외상황발생없이 위의 Thread.sleep(3000)이 try되면 메인메뉴로 돌아감.
		}
		
		public void OrderCancel() { // 주문취소
			System.out.println();
			System.out.println("진행하던 주문을 취소하시겠습니까?");
			System.out.println("1. 확인     2. 취소     ");
			
			int cancelNum = oo.nextInt(); // 확인할지 취소할지 번호를 받아옴.
			oo.nextLine(); // 개행문자 제거 3? 4?번째
			
			if (cancelNum == 1) {
				order.Clearbasket(); // 사용자가 1. 확인 선택시 order클래스안의 clearbasket() 메서드를 호출해서 카트를 비워줌
				System.out.println("진행하면 주문이 취소되었습니다.");
				System.out.println();
			} else if (cancelNum == 2) {
				System.out.println("주문을 유지하고 메뉴판으로 돌아갑니다."); // 유지시 메뉴판으로 돌아감
			}
			
			showSubMenu();
		}
		
		
	}

