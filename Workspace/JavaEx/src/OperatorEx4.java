
public class OperatorEx4 {

	public static void main(String[] args) {
		// 대입연산자
		int a = 3;
		int b = a;
		
		a = 3;
		b = 5;
		System.out.println("변경 전 a: " + a + ", b: " + b);
		
		int c;
		c = a;
		a = b;
		b = c;
		
		System.out.println("변경 후 a: " + a + ", b: " + b);
		
		// +=, -=, *=, /=, %=
		a = 3;
		b = 2;
		a += b; 		// a = a + b
		System.out.println("a: " + a);
		a -= b; 		// a = a - b
		System.out.println("a: " + a);

	}

}
