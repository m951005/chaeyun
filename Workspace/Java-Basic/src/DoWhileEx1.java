public class DoWhileEx1 {
	public static void main(String[] args) {
		/* do ~ while
		 * do {
		 *  while의 조건식이 true일 경우 실행될 문장..
		 *  단, 처음 1회는 조건식의 값과 관계없이 무조건 실행된다.
		 * } while (조건식)
		 */
		
//		int n = 1;
//		do {
//			System.out.println(n++);
//		} while (n < 11);
		
		int num = 1;
		do {
			if (num % 3 == 0) {
				System.out.println(num);
			}
			num++;
		} while (num <= 20);

	}

}
