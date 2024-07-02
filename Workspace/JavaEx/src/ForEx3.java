
public class ForEx3 {
	public static void main(String[] args) {
		// 중첩 for문
		for (int i = 0; i < 5; i++) {
			for (int j = 0; j < 5; j++) {
				System.out.print("(" + i + ", " + j + ")");
			}
			System.out.println();
		}
		System.out.println();
		
		/*
		 * 문제
		 * 아래처럼 구구단을 1단부터 9단까지 출력하세요.
		 * 1 * 1 = 1
		 * 1 * 2 = 2
		 * 1 * 3 = 3
		 * ...
		 * 9 * 8 = 72
		 * 9 * 9 = 81
		 */
		for (int i = 1; i < 10; i++) {
			for (int j = 1; j < 10; j++) {
				System.out.println(i + " * " + j + " = " + (i * j));
				if (j == 9) {
					System.out.println();
				}
			}
			
		}
		

	}

}
