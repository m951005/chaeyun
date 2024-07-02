public class Operator3 {
	public static void main(String[] args) {
		/* 논리 연산자
		 * && (and 연산) : 둘 다 true일 때만 true, 이 외 모든 경우는 false
		 * || (or 연산) : 둘 중 하나라도 true이면 true, 둘 다 false일 때만 false
		 * ! (not 연산) : true -> false, false -> true
		 */
		boolean a = true;
		boolean b = false;
		System.out.println(a && b);
		System.out.println(a || b);
		System.out.println(!a);
		
	}

}
