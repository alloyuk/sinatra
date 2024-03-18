package challenge.one;

public class RectangleTest {
    public static void main(String[] args) {
        // double w, h, area;
        // Scanner in = new Scanner(System.in);
        // Random cho = new Random();
        for (int i = 2; i < 10; i++) {
            System.out.println(i + "단을 출력 합니다.");
            // 이 반복문(j)이 종료되면 위의 반복문 변수 i가 1 증가하여 다시 3x1 ~ 3x9 까지 진행하는 식으로 9단까지 반복 합니다
            for (int j = 1; j < 10; j++) {
                System.out.println(i + " x " + j + " = " + i * j);
            }
            System.out.println();

        }
    }
}