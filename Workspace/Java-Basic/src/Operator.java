
public class Operator {
	public static void main(String[] args) {
		//산술연산자
		int num1 = 10;
		int num2 = 5;
		System.out.println("10 / 5 : " + num1 / num2);
		
		num2 = 4;
		System.out.println("10 / 4 : " + num1 / num2);
		
		System.out.println("10 % 4 : " + num1 % num2);
		
		// 증감연산자 ++ : 1증가, -- : 1감소
		// 증감연산자 전치, 후치 -> 전치연산은 선 증감 후 연산, 후치연산은 선 연산 후 증감
		int a = 3;
		System.out.println("a : " + a);
		// a++;
		System.out.println("a : " + a++);
		System.out.println("a : " + a);

		// --a;
		System.out.println("a : " + --a);

	}

}
