public class WhileEx1 {
	public static void main(String[] args) {
		/* while문
		 * while (조건식) {				<- 조건식의 값은 true, false
		 * 	조건식이 true일 동안 실행될 문장..
		 * }
		 */
		int n = 1;
		System.out.println("while문 실행 전 n : " + n);
		while (n <= 10) {
			System.out.println(n++);
		}
		System.out.println("while문 실행 후 n : " + n);
		
	}

}
