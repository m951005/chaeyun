
public class VariableEx {
	public static void main(String[] args) {
		// 한 줄 주석 : 컴파일러가 해석하지 않는다.
		/*
		 * 여러 줄 주석
		 */
		/*
		 * 데이터 타입
		 * 1. primary type(기본형 타입)
		 * 	- 논리형(boolean - 1byte) : 참(true) or 거짓(false)
		 * 	- 문자형(char - 2byte) : 1개의 문자를 표현 ex) 'A', 'a', '가'
		 * 	- 정수형(byte - 1byte, short - 2byte, int - 4byte, long - 8byte) : 소수점 자리가 없는 수
		 * 	- 실수형(float - 4byte, double - 8byte) : 소수점 자리가 있는 수 ex) 1.0
		 * 2. reference type(참조형 타입)
		 */
		System.out.println(true);
		System.out.println(false);
		System.out.println(2 > 5);
		System.out.println('A');
		System.out.println(10);
		System.out.println(1.2);
		System.out.println(1 + 2);
		
		// 변수 : 데이터를 저장할 수 있는 메모리 공간의 이름
		// 변수의 선언 -> 데이터타입 변수명;
		// 변수의 초기화 -> 변수명 = 초기값;
		// 변수의 선언과 동시에 초기화 -> 데이터타입 변수명 = 초기값;
		int a = 10;
		System.out.println(a);
		
		byte b = 127;
		short s = 10000;
		int i = 500000000;
		long l = 5000000000l;
		
		float f = 1.2f;
		double d = 1.2;
		
		/*
		 * 변수의 이름 규칙
		 * 1. 숫자로 시작할 수 없다.
		 * 2. 특수문자를 사용할 수 없다.
		 * 		(단, _, $는 사용가능)
		 * 
		 * 변수 이름 만드는 법
		 * 1. 의미를 가진 단어로 작성
		 * 2. 시작하는 첫 글자는 소문자로 작성
		 * 3. 카멜케이스 : korScoreOct, engScore, ...
		 *    스네이크케이스 : kor_score_oct, eng_score, ...
		 */
		
		
		
	}

}
