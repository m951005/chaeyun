
public class DoWhileEx2 {
	public static void main(String[] args) {
		/*
		 * 구구단 출력하기
		 * 3단
		 * 3 * 1 = 3
		 * 3 * 2 = 6
		 * 3 * 3 = 9
		 * ..
		 * 3 * 9 = 27
		 */
		int dan = 4;
		int a = 1;
		do {
			System.out.println(dan + " * " + a + " = " + (dan * a));
			a++;
		} while (a < 10);

	}

}
