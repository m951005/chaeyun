
public class OperatorEx3 {
	
	public static void main(String[] args) {
		// 증감연산자
		int a = -5;
		a = -a;
		System.out.println("a : " + a);
		
		// ++, -- : 1증가, 1감소
		a++;
		System.out.println("a : " + a);
		a--;
		System.out.println("a : " + a);
		// 후치연산 : 선 연산 후 증가
		System.out.println("a : " + a++);
		System.out.println("a : " + a);
		// 치연산 : 선 증가 후 연산
		System.out.println("a : " + ++a);
		
		// 문제
		a = 2;
		int b = 3;
		b++;
		System.out.println(++a + b++); // 3 + 4 = 7
		System.out.println(a); // 3
		System.out.println(b); // 5
		
		a = 3;
		b = 4;
		System.out.println(a + (b++));
		

	}

}
