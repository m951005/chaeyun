public class Operator4 {
	public static void main(String[] args) {
	/* 대입 연산자
	 * a = b -> b를 변수 a에 대입한다.
	 * a += b -> a = a + b
	 * a -= b -> a = a - b
	 * a *= b -> a = a * b
	 * a /= b -> a = a / b
	 * a %= b -> a = a % b
	 */
	int a = 5;
	System.out.println("a : " + a);
	a += 2;
	System.out.println("a += 2 : " + a);
	a -= 4;
	System.out.println("a -= 4 : " + a);
	a %= 2;
	System.out.println("a %= 2 : " + a);
	}

}
