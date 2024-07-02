
public class Variable {
	public static void main(String[] args) {
		//변수의 선언
		//문법 : 타입 변수명;
		int a;
		//초기값 설정
		a = 20;
		//변수 선언 후 반드시 초기값 설정 (선언하면서 바로 초기화 하는 편이 더 좋음)
		int A;
		//System.out.println(A); 초기값없음. 에러
		System.out.println(a);
		
		boolean b = false;
		System.out.println(b);
		
		a = 5;
		System.out.println(a);
		
		//대입하는 데이터와 변수의 타입이 다르면 대입 불가
		//b = 1;
		
		byte c = 50;
		System.out.println(c);
		//byte 타입이 표현할 수 있는 범위를 넘은 데이터를 대입 불가
		//c = 128;
		
		float f = 1.2f;
		System.out.println(f);
		
		long i = 10000000000l;
		System.out.println(i);
		//기본적으로 실수는 double, 정수는 int로 인식함. float타입 시 변수 뒤 소대문자f, long타입 시 변수 뒤 소대문자l
		//이외 타입은 상관없음
		
		int num1 = 10;
		int num2 = 20;
		
		System.out.println("num1 : " + num1);
		System.out.println("num2 : "+ num2);
		num2 = num1;
		System.out.println("num1 : " + num1);
		System.out.println("num2 : "+ num2);
		//변수끼리도 대입가능. 단, 같은 타입끼리만
		
		char ch1 = 'b';
		System.out.println("ch1 : " + ch1);
		
		double d = 3.1;
		System.out.println("d : " + d);
		
		
	}
}
