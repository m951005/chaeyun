
public class DoWhileEx1 {
	public static void main(String[] args) {
		/*
		 * do {
		 * 	 조건식이 true일 동안 실행될 문장...
		 * 	 단, 실행을 먼저 하고 조건 검사를 나중에 한다.
		 * } while (조건식)
		 */
		int n = 1;
		do {
			System.out.println(n++);
		} while (n <= 5);
		
	}

}
